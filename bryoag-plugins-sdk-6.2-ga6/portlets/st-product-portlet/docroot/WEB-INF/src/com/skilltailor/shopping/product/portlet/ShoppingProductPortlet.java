package com.skilltailor.shopping.product.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.shopping.DuplicateItemSKUException;
import com.liferay.portlet.shopping.ItemLargeImageNameException;
import com.liferay.portlet.shopping.ItemLargeImageSizeException;
import com.liferay.portlet.shopping.ItemMediumImageNameException;
import com.liferay.portlet.shopping.ItemMediumImageSizeException;
import com.liferay.portlet.shopping.ItemNameException;
import com.liferay.portlet.shopping.ItemSKUException;
import com.liferay.portlet.shopping.ItemSmallImageNameException;
import com.liferay.portlet.shopping.ItemSmallImageSizeException;
import com.liferay.portlet.shopping.NoSuchCategoryException;
import com.liferay.portlet.shopping.NoSuchItemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.skilltailor.shopping.product.model.Product;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.ProductLocalServiceUtil;
import com.skilltailor.shopping.product.service.ProductPartsServiceUtil;
import com.skilltailor.shopping.product.service.ProductServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class shoppingproduct
 */
public class ShoppingProductPortlet extends MVCPortlet {

	/** The Constant LOG. */
	private static final Log LOG = LogFactoryUtil.getLog(ShoppingProductPortlet.class);

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
			PortletException {
		UploadPortletRequest uploadPortletRequest = null;
		try {
			uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			updateItem(uploadPortletRequest, themeDisplay, actionRequest);
		} catch (Exception e) {
			if (e instanceof NoSuchCategoryException || e instanceof NoSuchItemException
					|| e instanceof PrincipalException) {

				SessionErrors.add(actionRequest, e.getClass());
				ShoppingProductPortlet.LOG.error(e);

			} else if (e instanceof DuplicateItemSKUException || e instanceof ItemLargeImageNameException
					|| e instanceof ItemLargeImageSizeException || e instanceof ItemMediumImageNameException
					|| e instanceof ItemMediumImageSizeException || e instanceof ItemNameException
					|| e instanceof ItemSKUException || e instanceof ItemSmallImageNameException
					|| e instanceof ItemSmallImageSizeException) {

				SessionErrors.add(actionRequest, e.getClass());
				ShoppingProductPortlet.LOG.error(e);
			} else {
				ShoppingProductPortlet.LOG.error(e);
				throw new PortletException(e);
			}
		} finally {
			uploadPortletRequest.cleanUp();

		}
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest arg0, RenderResponse arg1) throws PortletException, IOException {

		long itemId = ParamUtil.getLong(arg0, "productId");
		long fieldCount = ParamUtil.getLong(arg0, "fieldsCount");

		Product item = null;

		if (itemId > 0) {
			try {
				item = ProductLocalServiceUtil.getProduct(itemId);

			} catch (PortalException | SystemException e) {
				// TODO Auto-generated catch block
				SessionErrors.add(arg0, e.getClass());
				ShoppingProductPortlet.LOG.error(e);
			}
		}

		arg0.setAttribute("shopping_product", item);
		super.render(arg0, arg1);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}

	protected void updateItem(UploadPortletRequest uploadPortletRequest, ThemeDisplay themeDisplay,
			ActionRequest actionRequest) throws Exception {

		long itemId = ParamUtil.getLong(uploadPortletRequest, "itemId");

		long groupId = themeDisplay.getScopeGroupId();
		long categoryId = ParamUtil.getLong(uploadPortletRequest, "categoryId");
		String sku = ParamUtil.getString(uploadPortletRequest, "sku");
		String name = ParamUtil.getString(uploadPortletRequest, "productname");
		String description = ParamUtil.getString(uploadPortletRequest, "description");

		int fieldsCount = ParamUtil.getInteger(uploadPortletRequest, "fieldsCount", 1);

		List<ProductParts> itemFields = new ArrayList<ProductParts>();

		for (int i = 0; i < fieldsCount; i++) {
			String fieldName = ParamUtil.getString(uploadPortletRequest, "fieldName" + i);
			String fieldValues = ParamUtil.getString(uploadPortletRequest, "fieldValues" + i);
			String fieldDescription = ParamUtil.getString(uploadPortletRequest, "fieldDescription" + i);
			String fieldTagName = ParamUtil.getString(uploadPortletRequest, "fieldTagName" + i);
			boolean fieldIsComman = ParamUtil.getBoolean(uploadPortletRequest, "fieldIsComman" + i);
			boolean fieldHasAdditionalCost = ParamUtil.getBoolean(uploadPortletRequest, "fieldHasAdditionalCost" + i);
			int fieldSequence = ParamUtil.getInteger(uploadPortletRequest, "fieldSequence" + i);
			Integer fieldAdditionalCost = ParamUtil.getInteger(uploadPortletRequest, "fieldAdditionalCost" + i);
			String fieldCompatibleTag = ParamUtil.getString(uploadPortletRequest, "fieldCompatibleTag" + i);

			File smallPartFile = uploadPortletRequest.getFile("smallPartFile");

			File largePartFile = uploadPortletRequest.getFile("largePartFile");

			long smallImagePartSize = uploadPortletRequest.getSize("smallPartFile");
			long largeImagePartSize = uploadPortletRequest.getSize("largePartFile");

			if (smallImagePartSize == 0) {
				smallPartFile = null;
			} else {
				ProductLocalServiceUtil.updateImage(actionRequest, uploadPortletRequest, name + "/" + fieldName,
						"smallPartFile", "ADD");
			}

			if (largeImagePartSize == 0) {
				largePartFile = null;
			} else {
				ProductLocalServiceUtil.updateImage(actionRequest, uploadPortletRequest, name + "/" + fieldName,
						"largePartFile", "ADD");
			}

			ProductParts itemField = ProductPartsServiceUtil.create();

			itemField.setName(fieldName);
			itemField.setValues(fieldValues);
			itemField.setDescription(fieldDescription);
			itemField.setAdditionalCost(fieldAdditionalCost);
			itemField.setCompatibleTag(fieldCompatibleTag);
			itemField.setHasAdditionalCost(fieldHasAdditionalCost);
			itemField.setIsCommon(fieldIsComman);
			itemField.setProductId(itemId);
			itemField.setSequence(fieldSequence);
			itemField.setTagName(fieldTagName);
			itemFields.add(itemField);

		}

		int stockQuantity = ParamUtil.getInteger(uploadPortletRequest, "stockQuantity");

		File smallFile = uploadPortletRequest.getFile("smallFile");

		File mediumFile = uploadPortletRequest.getFile("mediumFile");

		File largeFile = uploadPortletRequest.getFile("largeFile");

		long smallImageSize = uploadPortletRequest.getSize("smallFile");
		long mediumImageSize = uploadPortletRequest.getSize("mediumFile");
		long largeImageSize = uploadPortletRequest.getSize("largeFile");

		if (smallImageSize == 0) {
			smallFile = null;
		}

		if (mediumImageSize == 0) {
			mediumFile = null;
		}

		if (largeImageSize == 0) {
			largeFile = null;
		}

		int totalQuantity = ParamUtil.getInteger(uploadPortletRequest, "totalQuantity");

		int discount = ParamUtil.getInteger(uploadPortletRequest, "discount");
		Boolean stockchecking = ParamUtil.getBoolean(uploadPortletRequest, "stockchecking");

		int basiccost = ParamUtil.getInteger(uploadPortletRequest, "basiccost");
		int minQuantity = ParamUtil.getInteger(uploadPortletRequest, "minQuantity");
		int maxQuantity = ParamUtil.getInteger(uploadPortletRequest, "maxQuantity");

		int shippingcost = ParamUtil.getInteger(uploadPortletRequest, "shippingcost");
		boolean isTaxable = ParamUtil.getBoolean(uploadPortletRequest, "isTaxable");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Product.class.getName(), actionRequest);
		if (itemId <= 0) {

			// Add item

			ProductServiceUtil.addProduct(themeDisplay.getUserId(), groupId, categoryId, sku, name, description,
					stockQuantity, smallFile, mediumFile, largeFile, smallImageSize, mediumImageSize, largeImageSize,
					itemFields, discount, basiccost, shippingcost, totalQuantity, stockchecking, minQuantity,
					maxQuantity, isTaxable, serviceContext);
		} else {

			// Update item

			// ProductServiceUtil.updateItem(groupId, categoryId, sku, name, description,
			// properties, fieldsQuantities,
			// smallFile, mediumFile, largeFile, itemFields, serviceContext);
		}
	}

}

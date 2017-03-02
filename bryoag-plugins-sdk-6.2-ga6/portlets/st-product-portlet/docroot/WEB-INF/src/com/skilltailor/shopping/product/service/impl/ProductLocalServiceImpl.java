/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.skilltailor.shopping.product.service.impl;

import com.bryoag.shared.util.UploadUtil;
import com.bryoag.shopping.image.model.Image;
import com.bryoag.shopping.image.service.ImageLocalServiceUtil;
import com.bryoag.shopping.image.service.ImageServiceUtil;
import com.liferay.counter.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ServiceContext;
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
import com.skilltailor.shopping.product.NoSuchProductException;
import com.skilltailor.shopping.product.model.Product;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.ProductPartsLocalServiceUtil;
import com.skilltailor.shopping.product.service.base.ProductLocalServiceBaseImpl;
import com.skilltailor.shopping.product.service.persistence.ProductPersistence;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;

/**
 * The implementation of the product local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.skilltailor.shopping.product.service.ProductLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same
 * VM.
 * </p>
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.product.service.base.ProductLocalServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.ProductLocalServiceUtil
 */
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {

	public Product addProduct(long userId, long groupId, long categoryId, String sku, String name, String description,
			int stockQuantity, File smallImageFile, File mediumImageFile, File largeImageFile, long smallImageSize,
			long mediumImageSize, long largeImageSize, List<ProductParts> itemFields, double discount, int basiccost,
			int shippingcost, int totalQuantity, boolean stockchecking, int minQuantity, int maxQuantity,
			boolean isTaxable, ServiceContext serviceContext) throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);
		sku = StringUtil.toUpperCase(sku.trim());

		Date now = new Date();

		validate(user.getCompanyId(), 0, sku, name, smallImageFile, mediumImageFile, largeImageFile, smallImageSize,
				mediumImageSize, largeImageSize);

		long itemId = counterLocalService.increment();

		Product item = productPersistence.create(itemId);

		item.setGroupId(groupId);
		item.setCompanyId(user.getCompanyId());
		item.setUserId(user.getUserId());
		item.setUserName(user.getFullName());
		item.setCreateDate(now);
		item.setModifiedDate(now);
		item.setCategoryId(categoryId);
		item.setSku(sku);
		item.setProductName(name);
		item.setDescription(description);
		item.setDiscount(discount);
		item.setBasicCost(basiccost);
		item.setShippingCost(shippingcost);
		item.setTotalQuantity(totalQuantity);
		item.setStockChecking(stockchecking);
		item.setMinQuantity(minQuantity);
		item.setMaxQuantity(maxQuantity);
		item.setTaxable(isTaxable);
		item.setImageId(itemId);

		productPersistence.update(item);

		// Images

		if (smallImageFile != null || mediumImageFile != null || largeImageFile != null) {
			Image image = ImageServiceUtil.createImage(itemId);

			try {
				updateImage(image, item, serviceContext, smallImageFile, mediumImageFile, largeImageFile, "ADD");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Item fields

		for (ProductParts itemField : itemFields) {
			long itemFieldId = counterLocalService.increment();

			itemField.setPartId(itemFieldId);
			itemField.setProductId(itemId);

			ProductPartsLocalServiceUtil.updateProductParts(itemField);
		}

		// Item prices

		return item;
	}

	@Override
	public Product addProduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return super.addProduct(product);
	}

	public Product createProduct() throws SystemException {
		long key = getCounterLocalService().increment();
		return createProduct(key);
	}

	@Override
	public Product createProduct(long productId) {
		// TODO Auto-generated method stub
		return super.createProduct(productId);
	}

	@Override
	public Product deleteProduct(long productId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.deleteProduct(productId);
	}

	@Override
	public Product deleteProduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return super.deleteProduct(product);
	}

	@Override
	public int getProductsCount() throws SystemException {
		// TODO Auto-generated method stub
		return super.getProductsCount();
	}

	@Override
	public Product updateProduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return super.updateProduct(product);
	}

	@Override
	public CounterLocalService getCounterLocalService() {
		// TODO Auto-generated method stub
		return super.getCounterLocalService();
	}

	@Override
	public ResourceLocalService getResourceLocalService() {
		// TODO Auto-generated method stub
		return super.getResourceLocalService();
	}

	@Override
	public ProductPersistence getProductPersistence() {
		// TODO Auto-generated method stub
		return super.getProductPersistence();
	}

	public List<Product> findByGroupId(long groupId) throws SystemException {
		return getProductPersistence().findByGroupId(groupId);
	}

	public List<Product> findByCategory(long categoryId) throws SystemException {
		return getProductPersistence().findByCategory(categoryId);
	}

	public List<Product> findByC_G(long companyId, long groupId) throws SystemException {
		return getProductPersistence().findByC_G(companyId, groupId);
	}

	public Product findByProductId(long productId) throws SystemException, NoSuchProductException {
		return getProductPersistence().findByProductId(productId);
	}

	protected void validate(long companyId, long productId, String sku, String name, File smallImageFile,
			File mediumImageFile, File largeImageFile, long smallImageSize, long mediumImageSize, long largeImageSize)
			throws PortalException, SystemException {

		if (Validator.isNull(sku)) {
			throw new ItemSKUException();
		}

		Product item = getProductPersistence().fetchByCompanySku(sku, companyId);

		if ((item != null) && (item.getProductId() != productId)) {
			StringBundler sb = new StringBundler(5);

			sb.append("{companyId=");
			sb.append(companyId);
			sb.append(", sku=");
			sb.append(sku);
			sb.append("}");

			throw new DuplicateItemSKUException(sb.toString());
		}

		if (Validator.isNull(name)) {
			throw new ItemNameException();
		}

		String[] imageExtensions = PrefsPropsUtil.getStringArray(PropsKeys.SHOPPING_IMAGE_EXTENSIONS, StringPool.COMMA);

		// Small image

		if ((smallImageFile != null)) {

			String smallImageName = smallImageFile.getName();

			if (smallImageName != null) {
				boolean validSmallImageExtension = false;

				for (int i = 0; i < imageExtensions.length; i++) {
					if (StringPool.STAR.equals(imageExtensions[i])
							|| StringUtil.endsWith(smallImageName, imageExtensions[i])) {

						validSmallImageExtension = true;

						break;
					}
				}

				if (!validSmallImageExtension) {
					throw new ItemSmallImageNameException(smallImageName);
				}
			}

			long smallImageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_SMALL_MAX_SIZE);

			if ((smallImageMaxSize > 0) && ((smallImageSize == 0) || (smallImageSize > smallImageMaxSize))) {

				throw new ItemSmallImageSizeException();
			}
		}

		// Medium image

		if ((mediumImageFile != null)) {

			String mediumImageName = mediumImageFile.getName();

			if (mediumImageName != null) {
				boolean validMediumImageExtension = false;

				for (int i = 0; i < imageExtensions.length; i++) {
					if (StringPool.STAR.equals(imageExtensions[i])
							|| StringUtil.endsWith(mediumImageName, imageExtensions[i])) {

						validMediumImageExtension = true;

						break;
					}
				}

				if (!validMediumImageExtension) {
					throw new ItemMediumImageNameException(mediumImageName);
				}
			}

			long mediumImageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_MEDIUM_MAX_SIZE);

			if ((mediumImageMaxSize > 0) && ((mediumImageSize == 0) || (mediumImageSize > mediumImageMaxSize))) {

				throw new ItemMediumImageSizeException();
			}
		}

		// Large image
		if ((largeImageFile != null)) {
			String largeImageName = largeImageFile.getName();

			if (largeImageName != null) {
				boolean validLargeImageExtension = false;

				for (int i = 0; i < imageExtensions.length; i++) {
					if (StringPool.STAR.equals(imageExtensions[i])
							|| StringUtil.endsWith(largeImageName, imageExtensions[i])) {

						validLargeImageExtension = true;

						break;
					}
				}

				if (!validLargeImageExtension) {
					throw new ItemLargeImageNameException(largeImageName);
				}
			}

			long largeImageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_LARGE_MAX_SIZE);

			if ((largeImageMaxSize > 0) && ((largeImageSize == 0) || (largeImageSize > largeImageMaxSize))) {

				throw new ItemLargeImageSizeException();
			}
		}
	}

	public Image updateImage(Image image, Product product, ServiceContext serviceContext, File smallImageFile,
			File mediumImageFile, File largeImageFile, String cmd) throws SystemException, PortalException, IOException {

		LiferayPortletRequest request = serviceContext.getLiferayPortletRequest();

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);

		if (smallImageFile != null) {
			String smallFileName = smallImageFile.getName();
			if (smallFileName != null) {
				String smallImageFilePath = createPath(product, smallFileName);
				updateImage(request, uploadRequest, product.getProductName(), "smallFile", cmd);
				image.setSmallImagePath(smallImageFilePath + "/" + smallFileName);

			}
		}
		if (mediumImageFile != null) {
			String mediumFileName = mediumImageFile.getName();
			if (mediumFileName != null) {
				String mediumImageFilePath = createPath(product, mediumFileName);
				updateImage(request, uploadRequest, mediumImageFilePath, "mediumFile", cmd);
				image.setMediumImagePath(mediumImageFilePath + "/" + mediumFileName);
			}
		}
		if (largeImageFile != null) {
			String largeFileName = largeImageFile.getName();
			if (largeFileName != null) {

				String largeImageFilePath = createPath(product, largeFileName);
				updateImage(request, uploadRequest, largeImageFilePath, "largeFile", cmd);
				image.setLargeImagePath(largeImageFilePath + "/" + largeFileName);

			}
		}

		image.setAssetId(product.getProductId());
		image.setAssetType(Product.class.getName());
		image.setCompanyId(product.getCompanyId());
		image.setCreateDate(product.getCreateDate());
		image.setGroupId(product.getGroupId());
		image.setModifiedDate(new Date());
		ImageLocalServiceUtil.updateImage(image);

		return image;

	}

	public void uploadImage(PortletRequest actionRequest, UploadPortletRequest aUploadrequest, String foldername,
			String imageName) throws PortalException, SystemException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		Folder folder =
				UploadUtil.createFolder(actionRequest, themeDisplay.getScopeGroupId(), foldername,
						"uploaded files form tag");

		UploadUtil.fileUpload(themeDisplay.getScopeGroupId(), actionRequest, folder.getFolderId(), imageName);
	}

	public void updateImage(PortletRequest actionRequest, UploadPortletRequest aUploadrequest, String foldername,
			String imageName, String cmd) throws PortalException, SystemException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Folder folder = null;

		if (cmd.equalsIgnoreCase(Constants.ADD)) {
			uploadImage(actionRequest, aUploadrequest, foldername, imageName);

		} else if (cmd.equalsIgnoreCase(Constants.UPDATE)) {
			folder = UploadUtil.getFolder(themeDisplay.getScopeGroupId(), foldername, 0);
			UploadUtil.updateFileEntry(themeDisplay.getScopeGroupId(), actionRequest, folder.getFolderId(), imageName);

		} else if (cmd.equalsIgnoreCase(Constants.DELETE)) {
			UploadUtil.deleteFileEntry(themeDisplay.getScopeGroupId(), imageName, folder.getFolderId());
		}
	}

	public String createPath(Product product, String fileName) throws PortalException, SystemException {
		String path = StringPool.BLANK;
		StringBuilder sb = new StringBuilder(path);

		if (product.getProductName() != null) {
			sb.append(product.getProductName());
		}

		return sb.toString();

	}

}

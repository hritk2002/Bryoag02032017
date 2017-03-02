package com.skilltailor.shopping.category.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.skilltailor.shopping.category.portlet.helper.ShoppingCategoryHelper;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class ShoppingCategory
 */
public class ShoppingCategory extends MVCPortlet {

	private final static Log LOG = LogFactoryUtil.getLog(ShoppingCategory.class);

	public void createCategory(final ActionRequest actionRequest, final ActionResponse actionResponse) {
		try {
			ShoppingCategoryHelper.addOrUpdateCategory(actionRequest);
			actionResponse.setRenderParameter("jspPath", "/html/shoppingcategory/createUpdateCategory.jsp");
		} catch (SystemException e) {
			LOG.error("SystemException occur while creating/updating category ", e);
		} catch (PortalException e) {
			LOG.error("PortalException occur while creating/updating category ", e);
		}
	}

	public void deleteCategory(final ActionRequest actionRequest, final ActionResponse actionResponse) {
		try {
			ShoppingCategoryHelper.deleteCategory(actionRequest);
			actionResponse.setRenderParameter("jspPath", "/html/shoppingcategory/createUpdateCategory.jsp");
		} catch (SystemException e) {
			LOG.error("SystemException occur while deleting category ", e);
		} catch (PortalException e) {
			LOG.error("PortalException occur while deleting category ", e);
		}
	}

}

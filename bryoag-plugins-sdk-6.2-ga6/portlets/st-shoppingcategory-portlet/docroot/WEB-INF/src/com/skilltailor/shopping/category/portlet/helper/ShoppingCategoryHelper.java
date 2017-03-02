package com.skilltailor.shopping.category.portlet.helper;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.skilltailor.shopping.category.model.shoppingcategory;
import com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil;

import java.util.Date;

import javax.portlet.ActionRequest;

public final class ShoppingCategoryHelper {

	public static void addOrUpdateCategory(ActionRequest actionRequest) throws SystemException, PortalException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long catId = ParamUtil.getLong(actionRequest, "categoryId", 0l);
		shoppingcategory category = null;
		if (catId != 0) {
			category = shoppingcategoryLocalServiceUtil.getshoppingcategory(catId);
			initCategory(actionRequest, themeDisplay, category);
			shoppingcategoryLocalServiceUtil.updateshoppingcategory(category);
		} else {
			category = shoppingcategoryLocalServiceUtil.createshoppingcategory(CounterLocalServiceUtil.increment());
			initCategory(actionRequest, themeDisplay, category);
			shoppingcategoryLocalServiceUtil.addshoppingcategory(category);
		}

	}

	private static void initCategory(ActionRequest actionRequest, ThemeDisplay themeDisplay, shoppingcategory category) {
		category.setName(ParamUtil.getString(actionRequest, "name", StringPool.BLANK));
		category.setDescription(ParamUtil.getString(actionRequest, "description", StringPool.BLANK));
		category.setParentId(ParamUtil.getLong(actionRequest, "parentId", 0l));
		Date currentDate = new Date();
		category.setCreateDate(currentDate);
		category.setModifiedDate(currentDate);
		category.setGroupId(themeDisplay.getScopeGroupId());
		category.setCompanyId(themeDisplay.getCompanyId());
	}

	private ShoppingCategoryHelper() {
	}

	public static void deleteCategory(ActionRequest actionRequest) throws PortalException, SystemException {
		shoppingcategoryLocalServiceUtil.deleteshoppingcategory(ParamUtil.getLong(actionRequest, "del_category"));

	}
}

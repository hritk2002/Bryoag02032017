package com.bryoag.shopping.category.portlet;

import com.bryoag.shopping.model.EshoppingCategory;
import com.bryoag.shopping.service.EshoppingCategoryLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.shopping.NoSuchCategoryException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class CategoryPortlet
 */
public class CategoryPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		try {
			ActionUtil.getCategory(renderRequest);
		} catch (Exception e) {
			if (e instanceof NoSuchCategoryException || e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass());

				return actionMapping.findForward("portlet.shopping.error");
			} else {
				throw e;
			}
		}

		return actionMapping.findForward(getForward(renderRequest, "portlet.shopping.edit_category"));
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}

	protected void deleteCategory(ActionRequest actionRequest) throws Exception {

		long categoryId = ParamUtil.getLong(actionRequest, "categoryId");

		EshoppingCategoryLocalServiceUtil.deleteCategory(categoryId);
	}

	protected void updateCategory(ActionRequest actionRequest) throws Exception {

		long categoryId = ParamUtil.getLong(actionRequest, "categoryId");

		long parentCategoryId = ParamUtil.getLong(actionRequest, "parentCategoryId");
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");

		boolean mergeWithParentCategory = ParamUtil.getBoolean(actionRequest, "mergeWithParentCategory");

		ServiceContext serviceContext =
				ServiceContextFactory.getInstance(EshoppingCategory.class.getName(), actionRequest);
		String user = actionRequest.getRemoteUser();
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User userObj = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), user);

		if (categoryId <= 0) {

			// Add category

			EshoppingCategoryLocalServiceUtil.addCategory(userObj.getUserId(), parentCategoryId, name, description,
					serviceContext);
		} else {

			// Update category

			EshoppingCategoryLocalServiceUtil.updateCategory(categoryId, parentCategoryId, name, description,
					mergeWithParentCategory, serviceContext);
		}
	}
}

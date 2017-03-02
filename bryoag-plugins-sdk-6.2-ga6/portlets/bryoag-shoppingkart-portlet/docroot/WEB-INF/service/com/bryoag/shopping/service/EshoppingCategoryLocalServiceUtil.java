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

package com.bryoag.shopping.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EshoppingCategory. This utility wraps
 * {@link com.bryoag.shopping.service.impl.EshoppingCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author deepakgupta02
 * @see EshoppingCategoryLocalService
 * @see com.bryoag.shopping.service.base.EshoppingCategoryLocalServiceBaseImpl
 * @see com.bryoag.shopping.service.impl.EshoppingCategoryLocalServiceImpl
 * @generated
 */
public class EshoppingCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.bryoag.shopping.service.impl.EshoppingCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the eshopping category to the database. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory addEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEshoppingCategory(eshoppingCategory);
	}

	/**
	* Creates a new eshopping category with the primary key. Does not add the eshopping category to the database.
	*
	* @param categoryId the primary key for the new eshopping category
	* @return the new eshopping category
	*/
	public static com.bryoag.shopping.model.EshoppingCategory createEshoppingCategory(
		long categoryId) {
		return getService().createEshoppingCategory(categoryId);
	}

	/**
	* Deletes the eshopping category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category that was removed
	* @throws PortalException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory deleteEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEshoppingCategory(categoryId);
	}

	/**
	* Deletes the eshopping category from the database. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory deleteEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEshoppingCategory(eshoppingCategory);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.bryoag.shopping.model.EshoppingCategory fetchEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEshoppingCategory(categoryId);
	}

	/**
	* Returns the eshopping category with the primary key.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category
	* @throws PortalException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory getEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEshoppingCategory(categoryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the eshopping categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @return the range of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> getEshoppingCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEshoppingCategories(start, end);
	}

	/**
	* Returns the number of eshopping categories.
	*
	* @return the number of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getEshoppingCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEshoppingCategoriesCount();
	}

	/**
	* Updates the eshopping category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory updateEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEshoppingCategory(eshoppingCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.bryoag.shopping.model.EshoppingCategory addCategory(
		long userId, long parentCategoryId, java.lang.String name,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(userId, parentCategoryId, name, description,
			serviceContext);
	}

	public static void addCategoryResources(long categoryId,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, addGroupPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(long categoryId,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, groupPermissions, guestPermissions);
	}

	public static void addCategoryResources(
		com.liferay.portlet.shopping.model.ShoppingCategory category,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, addGroupPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(
		com.liferay.portlet.shopping.model.ShoppingCategory category,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, groupPermissions, guestPermissions);
	}

	public static void deleteCategories(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCategories(groupId);
	}

	public static void deleteCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCategory(categoryId);
	}

	public static void deleteCategory(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCategory(category);
	}

	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> getCategories(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategories(groupId);
	}

	public static com.bryoag.shopping.model.EshoppingCategory getCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(categoryId);
	}

	public static com.bryoag.shopping.model.EshoppingCategory getCategory(
		long groupId, java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(groupId, categoryName);
	}

	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> getParentCategories(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentCategories(categoryId);
	}

	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> getParentCategories(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentCategories(category);
	}

	public static com.bryoag.shopping.model.EshoppingCategory getParentCategory(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getParentCategory(category);
	}

	public static void getSubcategoryIds(
		java.util.List<java.lang.Long> categoryIds, long groupId,
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().getSubcategoryIds(categoryIds, groupId, categoryId);
	}

	public static com.bryoag.shopping.model.EshoppingCategory updateCategory(
		long categoryId, long parentCategoryId, java.lang.String name,
		java.lang.String description, boolean mergeWithParentCategory,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCategory(categoryId, parentCategoryId, name,
			description, mergeWithParentCategory, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static EshoppingCategoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EshoppingCategoryLocalService.class.getName());

			if (invokableLocalService instanceof EshoppingCategoryLocalService) {
				_service = (EshoppingCategoryLocalService)invokableLocalService;
			}
			else {
				_service = new EshoppingCategoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EshoppingCategoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EshoppingCategoryLocalService service) {
	}

	private static EshoppingCategoryLocalService _service;
}
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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EshoppingCategoryLocalService}.
 *
 * @author deepakgupta02
 * @see EshoppingCategoryLocalService
 * @generated
 */
public class EshoppingCategoryLocalServiceWrapper
	implements EshoppingCategoryLocalService,
		ServiceWrapper<EshoppingCategoryLocalService> {
	public EshoppingCategoryLocalServiceWrapper(
		EshoppingCategoryLocalService eshoppingCategoryLocalService) {
		_eshoppingCategoryLocalService = eshoppingCategoryLocalService;
	}

	/**
	* Adds the eshopping category to the database. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory addEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.addEshoppingCategory(eshoppingCategory);
	}

	/**
	* Creates a new eshopping category with the primary key. Does not add the eshopping category to the database.
	*
	* @param categoryId the primary key for the new eshopping category
	* @return the new eshopping category
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory createEshoppingCategory(
		long categoryId) {
		return _eshoppingCategoryLocalService.createEshoppingCategory(categoryId);
	}

	/**
	* Deletes the eshopping category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category that was removed
	* @throws PortalException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory deleteEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.deleteEshoppingCategory(categoryId);
	}

	/**
	* Deletes the eshopping category from the database. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory deleteEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.deleteEshoppingCategory(eshoppingCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _eshoppingCategoryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory fetchEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.fetchEshoppingCategory(categoryId);
	}

	/**
	* Returns the eshopping category with the primary key.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category
	* @throws PortalException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory getEshoppingCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getEshoppingCategory(categoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.bryoag.shopping.model.EshoppingCategory> getEshoppingCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getEshoppingCategories(start, end);
	}

	/**
	* Returns the number of eshopping categories.
	*
	* @return the number of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEshoppingCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getEshoppingCategoriesCount();
	}

	/**
	* Updates the eshopping category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param eshoppingCategory the eshopping category
	* @return the eshopping category that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.bryoag.shopping.model.EshoppingCategory updateEshoppingCategory(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.updateEshoppingCategory(eshoppingCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _eshoppingCategoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_eshoppingCategoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _eshoppingCategoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory addCategory(
		long userId, long parentCategoryId, java.lang.String name,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.addCategory(userId,
			parentCategoryId, name, description, serviceContext);
	}

	@Override
	public void addCategoryResources(long categoryId,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.addCategoryResources(categoryId,
			addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addCategoryResources(long categoryId,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.addCategoryResources(categoryId,
			groupPermissions, guestPermissions);
	}

	@Override
	public void addCategoryResources(
		com.liferay.portlet.shopping.model.ShoppingCategory category,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.addCategoryResources(category,
			addGroupPermissions, addGuestPermissions);
	}

	@Override
	public void addCategoryResources(
		com.liferay.portlet.shopping.model.ShoppingCategory category,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.addCategoryResources(category,
			groupPermissions, guestPermissions);
	}

	@Override
	public void deleteCategories(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.deleteCategories(groupId);
	}

	@Override
	public void deleteCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.deleteCategory(categoryId);
	}

	@Override
	public void deleteCategory(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.deleteCategory(category);
	}

	@Override
	public java.util.List<com.bryoag.shopping.model.EshoppingCategory> getCategories(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getCategories(groupId);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory getCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getCategory(categoryId);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory getCategory(
		long groupId, java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getCategory(groupId, categoryName);
	}

	@Override
	public java.util.List<com.bryoag.shopping.model.EshoppingCategory> getParentCategories(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getParentCategories(categoryId);
	}

	@Override
	public java.util.List<com.bryoag.shopping.model.EshoppingCategory> getParentCategories(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getParentCategories(category);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory getParentCategory(
		com.bryoag.shopping.model.EshoppingCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.getParentCategory(category);
	}

	@Override
	public void getSubcategoryIds(java.util.List<java.lang.Long> categoryIds,
		long groupId, long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategoryLocalService.getSubcategoryIds(categoryIds, groupId,
			categoryId);
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory updateCategory(
		long categoryId, long parentCategoryId, java.lang.String name,
		java.lang.String description, boolean mergeWithParentCategory,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategoryLocalService.updateCategory(categoryId,
			parentCategoryId, name, description, mergeWithParentCategory,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EshoppingCategoryLocalService getWrappedEshoppingCategoryLocalService() {
		return _eshoppingCategoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEshoppingCategoryLocalService(
		EshoppingCategoryLocalService eshoppingCategoryLocalService) {
		_eshoppingCategoryLocalService = eshoppingCategoryLocalService;
	}

	@Override
	public EshoppingCategoryLocalService getWrappedService() {
		return _eshoppingCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		EshoppingCategoryLocalService eshoppingCategoryLocalService) {
		_eshoppingCategoryLocalService = eshoppingCategoryLocalService;
	}

	private EshoppingCategoryLocalService _eshoppingCategoryLocalService;
}
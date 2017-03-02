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

package com.skilltailor.shopping.category.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link shoppingcategoryLocalService}.
 *
 * @author deepakgupta02
 * @see shoppingcategoryLocalService
 * @generated
 */
public class shoppingcategoryLocalServiceWrapper
	implements shoppingcategoryLocalService,
		ServiceWrapper<shoppingcategoryLocalService> {
	public shoppingcategoryLocalServiceWrapper(
		shoppingcategoryLocalService shoppingcategoryLocalService) {
		_shoppingcategoryLocalService = shoppingcategoryLocalService;
	}

	/**
	* Adds the shoppingcategory to the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingcategory the shoppingcategory
	* @return the shoppingcategory that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory addshoppingcategory(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.addshoppingcategory(shoppingcategory);
	}

	/**
	* Creates a new shoppingcategory with the primary key. Does not add the shoppingcategory to the database.
	*
	* @param categoryId the primary key for the new shoppingcategory
	* @return the new shoppingcategory
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory createshoppingcategory(
		long categoryId) {
		return _shoppingcategoryLocalService.createshoppingcategory(categoryId);
	}

	/**
	* Deletes the shoppingcategory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory that was removed
	* @throws PortalException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory deleteshoppingcategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.deleteshoppingcategory(categoryId);
	}

	/**
	* Deletes the shoppingcategory from the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingcategory the shoppingcategory
	* @return the shoppingcategory that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory deleteshoppingcategory(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.deleteshoppingcategory(shoppingcategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shoppingcategoryLocalService.dynamicQuery();
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
		return _shoppingcategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shoppingcategoryLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shoppingcategoryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _shoppingcategoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _shoppingcategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory fetchshoppingcategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.fetchshoppingcategory(categoryId);
	}

	/**
	* Returns the shoppingcategory with the primary key.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory
	* @throws PortalException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory getshoppingcategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.getshoppingcategory(categoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the shoppingcategories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @return the range of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> getshoppingcategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.getshoppingcategories(start, end);
	}

	/**
	* Returns the number of shoppingcategories.
	*
	* @return the number of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getshoppingcategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.getshoppingcategoriesCount();
	}

	/**
	* Updates the shoppingcategory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shoppingcategory the shoppingcategory
	* @return the shoppingcategory that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory updateshoppingcategory(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.updateshoppingcategory(shoppingcategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _shoppingcategoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_shoppingcategoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shoppingcategoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> getCategoryByOrder(
		long companyId, long groupId, java.lang.String orderByCol,
		boolean isDesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.getCategoryByOrder(companyId,
			groupId, orderByCol, isDesc);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryLocalService.findByC_G(companyId, groupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public shoppingcategoryLocalService getWrappedshoppingcategoryLocalService() {
		return _shoppingcategoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedshoppingcategoryLocalService(
		shoppingcategoryLocalService shoppingcategoryLocalService) {
		_shoppingcategoryLocalService = shoppingcategoryLocalService;
	}

	@Override
	public shoppingcategoryLocalService getWrappedService() {
		return _shoppingcategoryLocalService;
	}

	@Override
	public void setWrappedService(
		shoppingcategoryLocalService shoppingcategoryLocalService) {
		_shoppingcategoryLocalService = shoppingcategoryLocalService;
	}

	private shoppingcategoryLocalService _shoppingcategoryLocalService;
}
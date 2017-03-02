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
 * Provides a wrapper for {@link shoppingcategoryService}.
 *
 * @author deepakgupta02
 * @see shoppingcategoryService
 * @generated
 */
public class shoppingcategoryServiceWrapper implements shoppingcategoryService,
	ServiceWrapper<shoppingcategoryService> {
	public shoppingcategoryServiceWrapper(
		shoppingcategoryService shoppingcategoryService) {
		_shoppingcategoryService = shoppingcategoryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _shoppingcategoryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_shoppingcategoryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shoppingcategoryService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> getAllShoppingCategory(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryService.getAllShoppingCategory(companyId,
			groupId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> getCategoryByOrder(
		long companyId, long groupId, java.lang.String orderByCol,
		boolean isDesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategoryService.getCategoryByOrder(companyId, groupId,
			orderByCol, isDesc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public shoppingcategoryService getWrappedshoppingcategoryService() {
		return _shoppingcategoryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedshoppingcategoryService(
		shoppingcategoryService shoppingcategoryService) {
		_shoppingcategoryService = shoppingcategoryService;
	}

	@Override
	public shoppingcategoryService getWrappedService() {
		return _shoppingcategoryService;
	}

	@Override
	public void setWrappedService(
		shoppingcategoryService shoppingcategoryService) {
		_shoppingcategoryService = shoppingcategoryService;
	}

	private shoppingcategoryService _shoppingcategoryService;
}
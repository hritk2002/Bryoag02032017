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

package com.skilltailor.shopping.category.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.skilltailor.shopping.category.model.shoppingcategory;
import com.skilltailor.shopping.category.service.base.shoppingcategoryLocalServiceBaseImpl;
import com.skilltailor.shopping.category.service.persistence.shoppingcategoryUtil;

import java.util.List;

/**
 * The implementation of the shoppingcategory local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.skilltailor.shopping.category.service.shoppingcategoryLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same
 * VM.
 * </p>
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.category.service.base.shoppingcategoryLocalServiceBaseImpl
 * @see com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil
 */
public class shoppingcategoryLocalServiceImpl extends shoppingcategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil} to access
	 * the shoppingcategory local service.
	 */

	public List<shoppingcategory> getCategoryByOrder(long companyId, long groupId, final String orderByCol,
			final boolean isDesc) throws SystemException {
		DynamicQuery dynamicQuery =
				DynamicQueryFactoryUtil.forClass(shoppingcategory.class, PortletClassLoaderUtil.getClassLoader());

		if (isDesc) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByCol));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByCol));
		}

		return dynamicQuery(dynamicQuery);
	}

	public List<shoppingcategory> findByC_G(long companyId, long groupId) throws SystemException {

		return shoppingcategoryUtil.findByC_G(companyId, groupId);
	}
}

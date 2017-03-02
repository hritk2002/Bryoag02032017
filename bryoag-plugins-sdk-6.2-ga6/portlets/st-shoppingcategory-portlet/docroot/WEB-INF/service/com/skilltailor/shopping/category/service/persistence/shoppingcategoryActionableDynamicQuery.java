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

package com.skilltailor.shopping.category.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.skilltailor.shopping.category.model.shoppingcategory;
import com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil;

/**
 * @author deepakgupta02
 * @generated
 */
public abstract class shoppingcategoryActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public shoppingcategoryActionableDynamicQuery() throws SystemException {
		setBaseLocalService(shoppingcategoryLocalServiceUtil.getService());
		setClass(shoppingcategory.class);

		setClassLoader(com.skilltailor.shopping.category.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("categoryId");
	}
}
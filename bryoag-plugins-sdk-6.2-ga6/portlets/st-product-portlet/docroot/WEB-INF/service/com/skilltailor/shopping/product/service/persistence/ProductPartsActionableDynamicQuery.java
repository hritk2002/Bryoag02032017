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

package com.skilltailor.shopping.product.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.ProductPartsLocalServiceUtil;

/**
 * @author deepakgupta02
 * @generated
 */
public abstract class ProductPartsActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ProductPartsActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ProductPartsLocalServiceUtil.getService());
		setClass(ProductParts.class);

		setClassLoader(com.skilltailor.shopping.product.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("partId");
	}
}
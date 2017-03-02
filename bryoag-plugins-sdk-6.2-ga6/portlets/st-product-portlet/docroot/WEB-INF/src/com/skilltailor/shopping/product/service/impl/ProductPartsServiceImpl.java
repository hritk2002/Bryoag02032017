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

package com.skilltailor.shopping.product.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.skilltailor.shopping.product.NoSuchProductPartsException;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.base.ProductPartsServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the product parts remote service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.skilltailor.shopping.product.service.ProductPartsService} interface.
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based
 * on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.product.service.base.ProductPartsServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.ProductPartsServiceUtil
 */
public class ProductPartsServiceImpl extends ProductPartsServiceBaseImpl {

	public ProductParts addProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().addProductParts(productParts);
	}

	public ProductParts deleteProductParts(long partId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().deleteProductParts(partId);
	}

	public ProductParts deleteProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().deleteProductParts(productParts);
	}

	public ProductParts getProductParts(long partId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().getProductParts(partId);
	}

	public int getProductPartsesCount() throws SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().getProductPartsesCount();
	}

	public ProductParts updateProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().updateProductParts(productParts);
	}

	public List<ProductParts> findByProductId(long productId) throws SystemException {
		return getProductPartsLocalService().findByProductId(productId);
	}

	public List<ProductParts> findByComman(boolean iscomman) throws SystemException {
		return getProductPartsLocalService().findByComman(iscomman);
	}

	public List<ProductParts> findByName(String name) throws SystemException {
		return getProductPartsLocalService().findByName(name);
	}

	public List<ProductParts> findByCompatibleTag(String compatibletag) throws SystemException {
		return getProductPartsLocalService().findByCompatibleTag(compatibletag);
	}

	public ProductParts findByPartId(long partId) throws SystemException, NoSuchProductPartsException {
		return getProductPartsLocalService().findByPartId(partId);
	}

	public List<ProductParts> findByProductCompatibility(long productId, String compatibletag) throws SystemException {
		return getProductPartsLocalService().findByProductCompatibility(productId, compatibletag);
	}

	public ProductParts findByProductName(long productId, String name) throws SystemException,
			NoSuchProductPartsException {
		return getProductPartsLocalService().findByProductName(productId, name);
	}

	public List<ProductParts> findByTagName(String tagName) throws SystemException {
		// TODO Auto-generated method stub
		return getProductPartsLocalService().findByTagName(tagName);
	}

	public ProductParts create() throws SystemException {
		return getProductPartsLocalService().createProductparts();
	}

}

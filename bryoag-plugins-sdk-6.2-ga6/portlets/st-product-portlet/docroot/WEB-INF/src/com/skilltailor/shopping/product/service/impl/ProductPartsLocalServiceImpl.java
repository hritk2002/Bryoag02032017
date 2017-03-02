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

import com.liferay.counter.service.CounterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.skilltailor.shopping.product.NoSuchProductPartsException;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.base.ProductPartsLocalServiceBaseImpl;
import com.skilltailor.shopping.product.service.persistence.ProductPersistence;

import java.util.List;

/**
 * The implementation of the product parts local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.skilltailor.shopping.product.service.ProductPartsLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same
 * VM.
 * </p>
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.product.service.base.ProductPartsLocalServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.ProductPartsLocalServiceUtil
 */
public class ProductPartsLocalServiceImpl extends ProductPartsLocalServiceBaseImpl {

	public ProductParts createProductparts() throws SystemException {
		return createProductParts(getCounterLocalService().increment());
	}

	@Override
	public ProductParts createProductParts(long partId) {
		// TODO Auto-generated method stub
		return super.createProductParts(partId);
	}

	@Override
	public ProductParts addProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return super.addProductParts(productParts);
	}

	@Override
	public ProductParts deleteProductParts(long partId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.deleteProductParts(partId);
	}

	@Override
	public ProductParts deleteProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return super.deleteProductParts(productParts);
	}

	@Override
	public ProductParts getProductParts(long partId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.getProductParts(partId);
	}

	@Override
	public int getProductPartsesCount() throws SystemException {
		// TODO Auto-generated method stub
		return super.getProductPartsesCount();
	}

	@Override
	public ProductParts updateProductParts(ProductParts productParts) throws SystemException {
		// TODO Auto-generated method stub
		return super.updateProductParts(productParts);
	}

	@Override
	public ProductPersistence getProductPersistence() {
		// TODO Auto-generated method stub
		return super.getProductPersistence();
	}

	@Override
	public CounterLocalService getCounterLocalService() {
		// TODO Auto-generated method stub
		return super.getCounterLocalService();
	}

	public List<ProductParts> findByProductId(long productId) throws SystemException {
		return getProductPartsPersistence().findByProductId(productId);
	}

	public List<ProductParts> findByComman(boolean iscomman) throws SystemException {
		return getProductPartsPersistence().findByCommon(iscomman);
	}

	public List<ProductParts> findByName(String name) throws SystemException {
		return getProductPartsPersistence().findByName(name);
	}

	public List<ProductParts> findByCompatibleTag(String compatibletag) throws SystemException {
		return getProductPartsPersistence().findByCompatibleTag(compatibletag);
	}

	public ProductParts findByPartId(long partId) throws SystemException, NoSuchProductPartsException {
		return getProductPartsPersistence().findByPartId(partId);
	}

	public List<ProductParts> findByProductCompatibility(long productId, String compatibletag) throws SystemException {
		return getProductPartsPersistence().findByProductCompatibility(productId, compatibletag);
	}

	public ProductParts findByProductName(long productId, String name) throws SystemException,
			NoSuchProductPartsException {
		return getProductPartsPersistence().findByProductName(productId, name);
	}

	public List<ProductParts> findByTagName(String tagName) throws SystemException {
		return getProductPartsPersistence().findByTagName(tagName);
	}

}

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

package com.skilltailor.shopping.product.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductPartsService}.
 *
 * @author deepakgupta02
 * @see ProductPartsService
 * @generated
 */
public class ProductPartsServiceWrapper implements ProductPartsService,
	ServiceWrapper<ProductPartsService> {
	public ProductPartsServiceWrapper(ProductPartsService productPartsService) {
		_productPartsService = productPartsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _productPartsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_productPartsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _productPartsService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts addProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.addProductParts(productParts);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.deleteProductParts(partId);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.deleteProductParts(productParts);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts getProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.getProductParts(partId);
	}

	@Override
	public int getProductPartsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.getProductPartsesCount();
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts updateProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.updateProductParts(productParts);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByProductId(productId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByComman(
		boolean iscomman)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByComman(iscomman);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByName(name);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByCompatibleTag(compatibletag);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts findByPartId(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return _productPartsService.findByPartId(partId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByProductCompatibility(productId,
			compatibletag);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts findByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return _productPartsService.findByProductName(productId, name);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.findByTagName(tagName);
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts create()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productPartsService.create();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProductPartsService getWrappedProductPartsService() {
		return _productPartsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProductPartsService(
		ProductPartsService productPartsService) {
		_productPartsService = productPartsService;
	}

	@Override
	public ProductPartsService getWrappedService() {
		return _productPartsService;
	}

	@Override
	public void setWrappedService(ProductPartsService productPartsService) {
		_productPartsService = productPartsService;
	}

	private ProductPartsService _productPartsService;
}
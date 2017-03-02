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
 * Provides a wrapper for {@link ProductService}.
 *
 * @author deepakgupta02
 * @see ProductService
 * @generated
 */
public class ProductServiceWrapper implements ProductService,
	ServiceWrapper<ProductService> {
	public ProductServiceWrapper(ProductService productService) {
		_productService = productService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _productService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_productService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _productService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product addproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.addproduct(product);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product createproduct(
		long productId) {
		return _productService.createproduct(productId);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product deleteProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productService.deleteProduct(productId);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product deleteproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.deleteproduct(product);
	}

	@Override
	public int getProductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.getProductsCount();
	}

	@Override
	public com.skilltailor.shopping.product.model.Product updateproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.updateproduct(product);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.findByGroupId(groupId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.findByCategory(categoryId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productService.findByC_G(companyId, groupId);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return _productService.findByProductId(productId);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product addProduct(
		long userId, long groupId, long categoryId, java.lang.String sku,
		java.lang.String name, java.lang.String description, int stockQuantity,
		java.io.File smallImageFile, java.io.File mediumImageFile,
		java.io.File largeImageFile, long smallImageSize, long mediumImageSize,
		long largeImageSize,
		java.util.List<com.skilltailor.shopping.product.model.ProductParts> itemFields,
		double discount, int basiccost, int shippingcost, int totalQuantity,
		boolean stockchecking, int minQuantity, int maxQuantity,
		boolean istaxable,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productService.addProduct(userId, groupId, categoryId, sku,
			name, description, stockQuantity, smallImageFile, mediumImageFile,
			largeImageFile, smallImageSize, mediumImageSize, largeImageSize,
			itemFields, discount, basiccost, shippingcost, totalQuantity,
			stockchecking, minQuantity, maxQuantity, istaxable, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProductService getWrappedProductService() {
		return _productService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProductService(ProductService productService) {
		_productService = productService;
	}

	@Override
	public ProductService getWrappedService() {
		return _productService;
	}

	@Override
	public void setWrappedService(ProductService productService) {
		_productService = productService;
	}

	private ProductService _productService;
}
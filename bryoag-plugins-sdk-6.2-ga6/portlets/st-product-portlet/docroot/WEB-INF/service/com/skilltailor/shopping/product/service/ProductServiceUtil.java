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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Product. This utility wraps
 * {@link com.skilltailor.shopping.product.service.impl.ProductServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author deepakgupta02
 * @see ProductService
 * @see com.skilltailor.shopping.product.service.base.ProductServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.impl.ProductServiceImpl
 * @generated
 */
public class ProductServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.skilltailor.shopping.product.service.impl.ProductServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.skilltailor.shopping.product.model.Product addproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addproduct(product);
	}

	public static com.skilltailor.shopping.product.model.Product createproduct(
		long productId) {
		return getService().createproduct(productId);
	}

	public static com.skilltailor.shopping.product.model.Product deleteProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProduct(productId);
	}

	public static com.skilltailor.shopping.product.model.Product deleteproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteproduct(product);
	}

	public static int getProductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProductsCount();
	}

	public static com.skilltailor.shopping.product.model.Product updateproduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateproduct(product);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByGroupId(groupId);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCategory(categoryId);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByC_G(companyId, groupId);
	}

	public static com.skilltailor.shopping.product.model.Product findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getService().findByProductId(productId);
	}

	public static com.skilltailor.shopping.product.model.Product addProduct(
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
		return getService()
				   .addProduct(userId, groupId, categoryId, sku, name,
			description, stockQuantity, smallImageFile, mediumImageFile,
			largeImageFile, smallImageSize, mediumImageSize, largeImageSize,
			itemFields, discount, basiccost, shippingcost, totalQuantity,
			stockchecking, minQuantity, maxQuantity, istaxable, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static ProductService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProductService.class.getName());

			if (invokableService instanceof ProductService) {
				_service = (ProductService)invokableService;
			}
			else {
				_service = new ProductServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ProductServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProductService service) {
	}

	private static ProductService _service;
}
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
 * Provides the remote service utility for ProductParts. This utility wraps
 * {@link com.skilltailor.shopping.product.service.impl.ProductPartsServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author deepakgupta02
 * @see ProductPartsService
 * @see com.skilltailor.shopping.product.service.base.ProductPartsServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.impl.ProductPartsServiceImpl
 * @generated
 */
public class ProductPartsServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.skilltailor.shopping.product.service.impl.ProductPartsServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.skilltailor.shopping.product.model.ProductParts addProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addProductParts(productParts);
	}

	public static com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProductParts(partId);
	}

	public static com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProductParts(productParts);
	}

	public static com.skilltailor.shopping.product.model.ProductParts getProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProductParts(partId);
	}

	public static int getProductPartsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProductPartsesCount();
	}

	public static com.skilltailor.shopping.product.model.ProductParts updateProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProductParts(productParts);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByProductId(productId);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByComman(
		boolean iscomman)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByComman(iscomman);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByName(name);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompatibleTag(compatibletag);
	}

	public static com.skilltailor.shopping.product.model.ProductParts findByPartId(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getService().findByPartId(partId);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByProductCompatibility(productId, compatibletag);
	}

	public static com.skilltailor.shopping.product.model.ProductParts findByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getService().findByProductName(productId, name);
	}

	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByTagName(tagName);
	}

	public static com.skilltailor.shopping.product.model.ProductParts create()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().create();
	}

	public static void clearService() {
		_service = null;
	}

	public static ProductPartsService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProductPartsService.class.getName());

			if (invokableService instanceof ProductPartsService) {
				_service = (ProductPartsService)invokableService;
			}
			else {
				_service = new ProductPartsServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ProductPartsServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ProductPartsService service) {
	}

	private static ProductPartsService _service;
}
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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for ProductParts. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author deepakgupta02
 * @see ProductPartsServiceUtil
 * @see com.skilltailor.shopping.product.service.base.ProductPartsServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.impl.ProductPartsServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ProductPartsService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductPartsServiceUtil} to access the product parts remote service. Add custom service methods to {@link com.skilltailor.shopping.product.service.impl.ProductPartsServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public com.skilltailor.shopping.product.model.ProductParts addProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts deleteProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.skilltailor.shopping.product.model.ProductParts getProductParts(
		long partId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getProductPartsesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts updateProductParts(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByComman(
		boolean iscomman)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts findByPartId(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibletag)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts findByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException;

	public java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.skilltailor.shopping.product.model.ProductParts create()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

package com.skilltailor.shopping.product.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.skilltailor.shopping.product.service.ProductPartsServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.skilltailor.shopping.product.service.ProductPartsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.skilltailor.shopping.product.model.ProductPartsSoap}.
 * If the method in the service utility returns a
 * {@link com.skilltailor.shopping.product.model.ProductParts}, that is translated to a
 * {@link com.skilltailor.shopping.product.model.ProductPartsSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author deepakgupta02
 * @see ProductPartsServiceHttp
 * @see com.skilltailor.shopping.product.model.ProductPartsSoap
 * @see com.skilltailor.shopping.product.service.ProductPartsServiceUtil
 * @generated
 */
public class ProductPartsServiceSoap {
	public static com.skilltailor.shopping.product.model.ProductPartsSoap addProductParts(
		com.skilltailor.shopping.product.model.ProductPartsSoap productParts)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.addProductParts(com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl.toModel(
						productParts));

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap deleteProductParts(
		long partId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.deleteProductParts(partId);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap deleteProductParts(
		com.skilltailor.shopping.product.model.ProductPartsSoap productParts)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.deleteProductParts(com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl.toModel(
						productParts));

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap getProductParts(
		long partId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.getProductParts(partId);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getProductPartsesCount() throws RemoteException {
		try {
			int returnValue = ProductPartsServiceUtil.getProductPartsesCount();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap updateProductParts(
		com.skilltailor.shopping.product.model.ProductPartsSoap productParts)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.updateProductParts(com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl.toModel(
						productParts));

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByProductId(
		long productId) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByProductId(productId);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByComman(
		boolean iscomman) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByComman(iscomman);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByName(
		java.lang.String name) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByName(name);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByCompatibleTag(
		java.lang.String compatibletag) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByCompatibleTag(compatibletag);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap findByPartId(
		long partId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.findByPartId(partId);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByProductCompatibility(
		long productId, java.lang.String compatibletag)
		throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByProductCompatibility(productId,
					compatibletag);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap findByProductName(
		long productId, java.lang.String name) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.findByProductName(productId,
					name);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap[] findByTagName(
		java.lang.String tagName) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.ProductParts> returnValue =
				ProductPartsServiceUtil.findByTagName(tagName);

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductPartsSoap create()
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.ProductParts returnValue = ProductPartsServiceUtil.create();

			return com.skilltailor.shopping.product.model.ProductPartsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ProductPartsServiceSoap.class);
}
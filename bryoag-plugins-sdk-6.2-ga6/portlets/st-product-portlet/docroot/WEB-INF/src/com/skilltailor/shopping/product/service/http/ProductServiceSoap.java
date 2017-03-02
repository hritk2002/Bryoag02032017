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

import com.skilltailor.shopping.product.service.ProductServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.skilltailor.shopping.product.service.ProductServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.skilltailor.shopping.product.model.ProductSoap}.
 * If the method in the service utility returns a
 * {@link com.skilltailor.shopping.product.model.Product}, that is translated to a
 * {@link com.skilltailor.shopping.product.model.ProductSoap}. Methods that SOAP cannot
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
 * @see ProductServiceHttp
 * @see com.skilltailor.shopping.product.model.ProductSoap
 * @see com.skilltailor.shopping.product.service.ProductServiceUtil
 * @generated
 */
public class ProductServiceSoap {
	public static com.skilltailor.shopping.product.model.ProductSoap addproduct(
		com.skilltailor.shopping.product.model.ProductSoap product)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.addproduct(com.skilltailor.shopping.product.model.impl.ProductModelImpl.toModel(
						product));

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap createproduct(
		long productId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.createproduct(productId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap deleteProduct(
		long productId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.deleteProduct(productId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap deleteproduct(
		com.skilltailor.shopping.product.model.ProductSoap product)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.deleteproduct(com.skilltailor.shopping.product.model.impl.ProductModelImpl.toModel(
						product));

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getProductsCount() throws RemoteException {
		try {
			int returnValue = ProductServiceUtil.getProductsCount();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap updateproduct(
		com.skilltailor.shopping.product.model.ProductSoap product)
		throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.updateproduct(com.skilltailor.shopping.product.model.impl.ProductModelImpl.toModel(
						product));

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap[] findByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.Product> returnValue =
				ProductServiceUtil.findByGroupId(groupId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap[] findByCategory(
		long categoryId) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.Product> returnValue =
				ProductServiceUtil.findByCategory(categoryId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap[] findByC_G(
		long companyId, long groupId) throws RemoteException {
		try {
			java.util.List<com.skilltailor.shopping.product.model.Product> returnValue =
				ProductServiceUtil.findByC_G(companyId, groupId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.skilltailor.shopping.product.model.ProductSoap findByProductId(
		long productId) throws RemoteException {
		try {
			com.skilltailor.shopping.product.model.Product returnValue = ProductServiceUtil.findByProductId(productId);

			return com.skilltailor.shopping.product.model.ProductSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ProductServiceSoap.class);
}
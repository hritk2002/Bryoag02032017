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

package com.bryoag.image.service.http;

import com.bryoag.image.service.ImageServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.bryoag.image.service.ImageServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.bryoag.image.model.ImageSoap}.
 * If the method in the service utility returns a
 * {@link com.bryoag.image.model.Image}, that is translated to a
 * {@link com.bryoag.image.model.ImageSoap}. Methods that SOAP cannot
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
 * @see ImageServiceHttp
 * @see com.bryoag.image.model.ImageSoap
 * @see com.bryoag.image.service.ImageServiceUtil
 * @generated
 */
public class ImageServiceSoap {
	public static com.bryoag.image.model.ImageSoap[] getImagesByCategory(
		long categoryId) throws RemoteException {
		try {
			java.util.List<com.bryoag.image.model.Image> returnValue = ImageServiceUtil.getImagesByCategory(categoryId);

			return com.bryoag.image.model.ImageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.bryoag.image.model.ImageSoap createImage(long imageId)
		throws RemoteException {
		try {
			com.bryoag.image.model.Image returnValue = ImageServiceUtil.createImage(imageId);

			return com.bryoag.image.model.ImageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.bryoag.image.model.ImageSoap deleteImage(long imageId)
		throws RemoteException {
		try {
			com.bryoag.image.model.Image returnValue = ImageServiceUtil.deleteImage(imageId);

			return com.bryoag.image.model.ImageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.bryoag.image.model.ImageSoap deleteImage(
		com.bryoag.image.model.ImageSoap image) throws RemoteException {
		try {
			com.bryoag.image.model.Image returnValue = ImageServiceUtil.deleteImage(com.bryoag.image.model.impl.ImageModelImpl.toModel(
						image));

			return com.bryoag.image.model.ImageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery()
		throws RemoteException {
		try {
			com.liferay.portal.kernel.dao.orm.DynamicQuery returnValue = ImageServiceUtil.dynamicQuery();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.bryoag.image.model.ImageSoap[] dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws RemoteException {
		try {
			java.util.List<com.bryoag.image.model.Image> returnValue = ImageServiceUtil.dynamicQuery(dynamicQuery);

			return com.bryoag.image.model.ImageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.bryoag.image.model.ImageSoap updateImage(
		com.bryoag.image.model.ImageSoap image) throws RemoteException {
		try {
			com.bryoag.image.model.Image returnValue = ImageServiceUtil.updateImage(com.bryoag.image.model.impl.ImageModelImpl.toModel(
						image));

			return com.bryoag.image.model.ImageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ImageServiceSoap.class);
}
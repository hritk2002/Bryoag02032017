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

package com.bryoag.image.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ImageService}.
 *
 * @author deepakgupta02
 * @see ImageService
 * @generated
 */
public class ImageServiceWrapper implements ImageService,
	ServiceWrapper<ImageService> {
	public ImageServiceWrapper(ImageService imageService) {
		_imageService = imageService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _imageService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_imageService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _imageService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.bryoag.image.model.Image> getImagesByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _imageService.getImagesByCategory(categoryId);
	}

	@Override
	public com.bryoag.image.model.Image createImage(long imageId) {
		return _imageService.createImage(imageId);
	}

	@Override
	public com.bryoag.image.model.Image deleteImage(long imageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _imageService.deleteImage(imageId);
	}

	@Override
	public com.bryoag.image.model.Image deleteImage(
		com.bryoag.image.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _imageService.deleteImage(image);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _imageService.dynamicQuery();
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List<com.bryoag.image.model.Image> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _imageService.dynamicQuery(dynamicQuery);
	}

	@Override
	public com.bryoag.image.model.Image updateImage(
		com.bryoag.image.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _imageService.updateImage(image);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ImageService getWrappedImageService() {
		return _imageService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedImageService(ImageService imageService) {
		_imageService = imageService;
	}

	@Override
	public ImageService getWrappedService() {
		return _imageService;
	}

	@Override
	public void setWrappedService(ImageService imageService) {
		_imageService = imageService;
	}

	private ImageService _imageService;
}
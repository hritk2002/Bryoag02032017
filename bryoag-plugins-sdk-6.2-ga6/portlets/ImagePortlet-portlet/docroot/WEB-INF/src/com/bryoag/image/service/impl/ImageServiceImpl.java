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

package com.bryoag.image.service.impl;

import com.bryoag.image.model.Image;
import com.bryoag.image.service.ImageLocalServiceUtil;
import com.bryoag.image.service.base.ImageServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the image remote service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.bryoag.image.service.ImageService} interface.
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based
 * on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author deepakgupta02
 * @see com.bryoag.image.service.base.ImageServiceBaseImpl
 * @see com.bryoag.image.service.ImageServiceUtil
 */
public class ImageServiceImpl extends ImageServiceBaseImpl {

	public List<Image> getImagesByCategory(long categoryId) throws SystemException {

		return imagePersistence.findByCategory(categoryId);

	}

	public Image createImage(long imageId) {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.createImage(imageId);
	}

	public Image deleteImage(long imageId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.deleteImage(imageId);
	}

	public Image deleteImage(Image image) throws SystemException {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.deleteImage(image);
	}

	public DynamicQuery dynamicQuery() {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.dynamicQuery();
	}

	@SuppressWarnings("unchecked")
	public List<Image> dynamicQuery(DynamicQuery dynamicQuery) throws SystemException {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.dynamicQuery(dynamicQuery);
	}

	public Image updateImage(Image image) throws SystemException {
		// TODO Auto-generated method stub
		return ImageLocalServiceUtil.updateImage(image);
	}
}

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
import com.bryoag.image.service.base.ImageLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the image local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.bryoag.image.service.ImageLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same
 * VM.
 * </p>
 *
 * @author deepakgupta02
 * @see com.bryoag.image.service.base.ImageLocalServiceBaseImpl
 * @see com.bryoag.image.service.ImageLocalServiceUtil
 */
public class ImageLocalServiceImpl extends ImageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * com.bryoag.image.service.ImageLocalServiceUtil} to access the image local service.
	 */

	public List<Image> getImagesByCategory(long categoryId) throws SystemException {

		return imagePersistence.findByCategory(categoryId);

	}

	public Image createImage() throws SystemException {
		long counter = 0;

		counter = CounterLocalServiceUtil.increment();

		return createImage(counter);
	}

	@Override
	public Image createImage(long imageId) {

		return super.createImage(imageId);
	}

	@Override
	public Image deleteImage(long imageId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.deleteImage(imageId);
	}

	@Override
	public Image deleteImage(Image image) throws SystemException {
		// TODO Auto-generated method stub
		return super.deleteImage(image);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		// TODO Auto-generated method stub
		return super.dynamicQuery();
	}

	@Override
	public List dynamicQuery(DynamicQuery dynamicQuery) throws SystemException {
		// TODO Auto-generated method stub
		return super.dynamicQuery(dynamicQuery);
	}

	@Override
	public Image updateImage(Image image) throws SystemException {
		// TODO Auto-generated method stub
		return super.updateImage(image);
	}

}

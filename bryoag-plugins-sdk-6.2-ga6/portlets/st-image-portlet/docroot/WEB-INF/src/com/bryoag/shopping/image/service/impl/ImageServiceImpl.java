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

package com.bryoag.shopping.image.service.impl;

import com.bryoag.shopping.image.model.Image;
import com.bryoag.shopping.image.service.base.ImageServiceBaseImpl;

/**
 * The implementation of the image remote service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.bryoag.shopping.image.service.ImageService} interface.
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based
 * on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author deepakgupta02
 * @see com.bryoag.shopping.image.service.base.ImageServiceBaseImpl
 * @see com.bryoag.shopping.image.service.ImageServiceUtil
 */
public class ImageServiceImpl extends ImageServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * com.bryoag.shopping.image.service.ImageServiceUtil} to access the image remote service.
	 */

	public Image createImage(long imageId) {
		return imageLocalService.createImage(imageId);
	}
}

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

package com.bryoag.shopping.image.model.impl;

import com.bryoag.shopping.image.model.Image;
import com.bryoag.shopping.image.service.ImageLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Image service. Represents a row in the &quot;skilltailor_Image&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ImageImpl}.
 * </p>
 *
 * @author deepakgupta02
 * @see ImageImpl
 * @see com.bryoag.shopping.image.model.Image
 * @generated
 */
public abstract class ImageBaseImpl extends ImageModelImpl implements Image {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a image model instance should use the {@link Image} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ImageLocalServiceUtil.addImage(this);
		}
		else {
			ImageLocalServiceUtil.updateImage(this);
		}
	}
}
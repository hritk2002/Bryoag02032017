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

package com.bryoag.image.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Image}.
 * </p>
 *
 * @author deepakgupta02
 * @see Image
 * @generated
 */
public class ImageWrapper implements Image, ModelWrapper<Image> {
	public ImageWrapper(Image image) {
		_image = image;
	}

	@Override
	public Class<?> getModelClass() {
		return Image.class;
	}

	@Override
	public String getModelClassName() {
		return Image.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("imageId", getImageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("categoryId", getCategoryId());
		attributes.put("productId", getProductId());
		attributes.put("smallImagePath", getSmallImagePath());
		attributes.put("mediumImagePath", getMediumImagePath());
		attributes.put("largeImagePath", getLargeImagePath());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String smallImagePath = (String)attributes.get("smallImagePath");

		if (smallImagePath != null) {
			setSmallImagePath(smallImagePath);
		}

		String mediumImagePath = (String)attributes.get("mediumImagePath");

		if (mediumImagePath != null) {
			setMediumImagePath(mediumImagePath);
		}

		String largeImagePath = (String)attributes.get("largeImagePath");

		if (largeImagePath != null) {
			setLargeImagePath(largeImagePath);
		}
	}

	/**
	* Returns the primary key of this image.
	*
	* @return the primary key of this image
	*/
	@Override
	public long getPrimaryKey() {
		return _image.getPrimaryKey();
	}

	/**
	* Sets the primary key of this image.
	*
	* @param primaryKey the primary key of this image
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_image.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the image ID of this image.
	*
	* @return the image ID of this image
	*/
	@Override
	public long getImageId() {
		return _image.getImageId();
	}

	/**
	* Sets the image ID of this image.
	*
	* @param imageId the image ID of this image
	*/
	@Override
	public void setImageId(long imageId) {
		_image.setImageId(imageId);
	}

	/**
	* Returns the group ID of this image.
	*
	* @return the group ID of this image
	*/
	@Override
	public long getGroupId() {
		return _image.getGroupId();
	}

	/**
	* Sets the group ID of this image.
	*
	* @param groupId the group ID of this image
	*/
	@Override
	public void setGroupId(long groupId) {
		_image.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this image.
	*
	* @return the company ID of this image
	*/
	@Override
	public long getCompanyId() {
		return _image.getCompanyId();
	}

	/**
	* Sets the company ID of this image.
	*
	* @param companyId the company ID of this image
	*/
	@Override
	public void setCompanyId(long companyId) {
		_image.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this image.
	*
	* @return the user ID of this image
	*/
	@Override
	public long getUserId() {
		return _image.getUserId();
	}

	/**
	* Sets the user ID of this image.
	*
	* @param userId the user ID of this image
	*/
	@Override
	public void setUserId(long userId) {
		_image.setUserId(userId);
	}

	/**
	* Returns the user uuid of this image.
	*
	* @return the user uuid of this image
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _image.getUserUuid();
	}

	/**
	* Sets the user uuid of this image.
	*
	* @param userUuid the user uuid of this image
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_image.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this image.
	*
	* @return the user name of this image
	*/
	@Override
	public java.lang.String getUserName() {
		return _image.getUserName();
	}

	/**
	* Sets the user name of this image.
	*
	* @param userName the user name of this image
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_image.setUserName(userName);
	}

	/**
	* Returns the create date of this image.
	*
	* @return the create date of this image
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _image.getCreateDate();
	}

	/**
	* Sets the create date of this image.
	*
	* @param createDate the create date of this image
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_image.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this image.
	*
	* @return the modified date of this image
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _image.getModifiedDate();
	}

	/**
	* Sets the modified date of this image.
	*
	* @param modifiedDate the modified date of this image
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_image.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the category ID of this image.
	*
	* @return the category ID of this image
	*/
	@Override
	public long getCategoryId() {
		return _image.getCategoryId();
	}

	/**
	* Sets the category ID of this image.
	*
	* @param categoryId the category ID of this image
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_image.setCategoryId(categoryId);
	}

	/**
	* Returns the product ID of this image.
	*
	* @return the product ID of this image
	*/
	@Override
	public long getProductId() {
		return _image.getProductId();
	}

	/**
	* Sets the product ID of this image.
	*
	* @param productId the product ID of this image
	*/
	@Override
	public void setProductId(long productId) {
		_image.setProductId(productId);
	}

	/**
	* Returns the small image path of this image.
	*
	* @return the small image path of this image
	*/
	@Override
	public java.lang.String getSmallImagePath() {
		return _image.getSmallImagePath();
	}

	/**
	* Sets the small image path of this image.
	*
	* @param smallImagePath the small image path of this image
	*/
	@Override
	public void setSmallImagePath(java.lang.String smallImagePath) {
		_image.setSmallImagePath(smallImagePath);
	}

	/**
	* Returns the medium image path of this image.
	*
	* @return the medium image path of this image
	*/
	@Override
	public java.lang.String getMediumImagePath() {
		return _image.getMediumImagePath();
	}

	/**
	* Sets the medium image path of this image.
	*
	* @param mediumImagePath the medium image path of this image
	*/
	@Override
	public void setMediumImagePath(java.lang.String mediumImagePath) {
		_image.setMediumImagePath(mediumImagePath);
	}

	/**
	* Returns the large image path of this image.
	*
	* @return the large image path of this image
	*/
	@Override
	public java.lang.String getLargeImagePath() {
		return _image.getLargeImagePath();
	}

	/**
	* Sets the large image path of this image.
	*
	* @param largeImagePath the large image path of this image
	*/
	@Override
	public void setLargeImagePath(java.lang.String largeImagePath) {
		_image.setLargeImagePath(largeImagePath);
	}

	@Override
	public boolean isNew() {
		return _image.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_image.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _image.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_image.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _image.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _image.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_image.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _image.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_image.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_image.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_image.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ImageWrapper((Image)_image.clone());
	}

	@Override
	public int compareTo(com.bryoag.image.model.Image image) {
		return _image.compareTo(image);
	}

	@Override
	public int hashCode() {
		return _image.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.bryoag.image.model.Image> toCacheModel() {
		return _image.toCacheModel();
	}

	@Override
	public com.bryoag.image.model.Image toEscapedModel() {
		return new ImageWrapper(_image.toEscapedModel());
	}

	@Override
	public com.bryoag.image.model.Image toUnescapedModel() {
		return new ImageWrapper(_image.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _image.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _image.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_image.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImageWrapper)) {
			return false;
		}

		ImageWrapper imageWrapper = (ImageWrapper)obj;

		if (Validator.equals(_image, imageWrapper._image)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Image getWrappedImage() {
		return _image;
	}

	@Override
	public Image getWrappedModel() {
		return _image;
	}

	@Override
	public void resetOriginalValues() {
		_image.resetOriginalValues();
	}

	private Image _image;
}
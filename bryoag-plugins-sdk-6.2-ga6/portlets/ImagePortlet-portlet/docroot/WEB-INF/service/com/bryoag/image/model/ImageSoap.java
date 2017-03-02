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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bryoag.image.service.http.ImageServiceSoap}.
 *
 * @author deepakgupta02
 * @see com.bryoag.image.service.http.ImageServiceSoap
 * @generated
 */
public class ImageSoap implements Serializable {
	public static ImageSoap toSoapModel(Image model) {
		ImageSoap soapModel = new ImageSoap();

		soapModel.setImageId(model.getImageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setProductId(model.getProductId());
		soapModel.setSmallImagePath(model.getSmallImagePath());
		soapModel.setMediumImagePath(model.getMediumImagePath());
		soapModel.setLargeImagePath(model.getLargeImagePath());

		return soapModel;
	}

	public static ImageSoap[] toSoapModels(Image[] models) {
		ImageSoap[] soapModels = new ImageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ImageSoap[][] toSoapModels(Image[][] models) {
		ImageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ImageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ImageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ImageSoap[] toSoapModels(List<Image> models) {
		List<ImageSoap> soapModels = new ArrayList<ImageSoap>(models.size());

		for (Image model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ImageSoap[soapModels.size()]);
	}

	public ImageSoap() {
	}

	public long getPrimaryKey() {
		return _imageId;
	}

	public void setPrimaryKey(long pk) {
		setImageId(pk);
	}

	public long getImageId() {
		return _imageId;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public String getSmallImagePath() {
		return _smallImagePath;
	}

	public void setSmallImagePath(String smallImagePath) {
		_smallImagePath = smallImagePath;
	}

	public String getMediumImagePath() {
		return _mediumImagePath;
	}

	public void setMediumImagePath(String mediumImagePath) {
		_mediumImagePath = mediumImagePath;
	}

	public String getLargeImagePath() {
		return _largeImagePath;
	}

	public void setLargeImagePath(String largeImagePath) {
		_largeImagePath = largeImagePath;
	}

	private long _imageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _categoryId;
	private long _productId;
	private String _smallImagePath;
	private String _mediumImagePath;
	private String _largeImagePath;
}
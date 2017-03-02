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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Image in entity cache.
 *
 * @author deepakgupta02
 * @see Image
 * @generated
 */
public class ImageCacheModel implements CacheModel<Image>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{imageId=");
		sb.append(imageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", assetType=");
		sb.append(assetType);
		sb.append(", smallImagePath=");
		sb.append(smallImagePath);
		sb.append(", mediumImagePath=");
		sb.append(mediumImagePath);
		sb.append(", largeImagePath=");
		sb.append(largeImagePath);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Image toEntityModel() {
		ImageImpl imageImpl = new ImageImpl();

		imageImpl.setImageId(imageId);
		imageImpl.setGroupId(groupId);
		imageImpl.setCompanyId(companyId);
		imageImpl.setUserId(userId);

		if (userName == null) {
			imageImpl.setUserName(StringPool.BLANK);
		}
		else {
			imageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			imageImpl.setCreateDate(null);
		}
		else {
			imageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			imageImpl.setModifiedDate(null);
		}
		else {
			imageImpl.setModifiedDate(new Date(modifiedDate));
		}

		imageImpl.setAssetId(assetId);

		if (assetType == null) {
			imageImpl.setAssetType(StringPool.BLANK);
		}
		else {
			imageImpl.setAssetType(assetType);
		}

		if (smallImagePath == null) {
			imageImpl.setSmallImagePath(StringPool.BLANK);
		}
		else {
			imageImpl.setSmallImagePath(smallImagePath);
		}

		if (mediumImagePath == null) {
			imageImpl.setMediumImagePath(StringPool.BLANK);
		}
		else {
			imageImpl.setMediumImagePath(mediumImagePath);
		}

		if (largeImagePath == null) {
			imageImpl.setLargeImagePath(StringPool.BLANK);
		}
		else {
			imageImpl.setLargeImagePath(largeImagePath);
		}

		imageImpl.resetOriginalValues();

		return imageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		imageId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assetId = objectInput.readLong();
		assetType = objectInput.readUTF();
		smallImagePath = objectInput.readUTF();
		mediumImagePath = objectInput.readUTF();
		largeImagePath = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(imageId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(assetId);

		if (assetType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assetType);
		}

		if (smallImagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(smallImagePath);
		}

		if (mediumImagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mediumImagePath);
		}

		if (largeImagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(largeImagePath);
		}
	}

	public long imageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long assetId;
	public String assetType;
	public String smallImagePath;
	public String mediumImagePath;
	public String largeImagePath;
}
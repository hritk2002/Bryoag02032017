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

package com.bryoag.shopping.model.impl;

import com.bryoag.shopping.model.EshoppingCategory;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EshoppingCategory in entity cache.
 *
 * @author deepakgupta02
 * @see EshoppingCategory
 * @generated
 */
public class EshoppingCategoryCacheModel implements CacheModel<EshoppingCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{categoryId=");
		sb.append(categoryId);
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
		sb.append(", parentCategoryId=");
		sb.append(parentCategoryId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EshoppingCategory toEntityModel() {
		EshoppingCategoryImpl eshoppingCategoryImpl = new EshoppingCategoryImpl();

		eshoppingCategoryImpl.setCategoryId(categoryId);
		eshoppingCategoryImpl.setGroupId(groupId);
		eshoppingCategoryImpl.setCompanyId(companyId);
		eshoppingCategoryImpl.setUserId(userId);

		if (userName == null) {
			eshoppingCategoryImpl.setUserName(StringPool.BLANK);
		}
		else {
			eshoppingCategoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			eshoppingCategoryImpl.setCreateDate(null);
		}
		else {
			eshoppingCategoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			eshoppingCategoryImpl.setModifiedDate(null);
		}
		else {
			eshoppingCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		eshoppingCategoryImpl.setParentCategoryId(parentCategoryId);

		if (name == null) {
			eshoppingCategoryImpl.setName(StringPool.BLANK);
		}
		else {
			eshoppingCategoryImpl.setName(name);
		}

		if (description == null) {
			eshoppingCategoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			eshoppingCategoryImpl.setDescription(description);
		}

		eshoppingCategoryImpl.resetOriginalValues();

		return eshoppingCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		parentCategoryId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(categoryId);
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
		objectOutput.writeLong(parentCategoryId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long categoryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long parentCategoryId;
	public String name;
	public String description;
}
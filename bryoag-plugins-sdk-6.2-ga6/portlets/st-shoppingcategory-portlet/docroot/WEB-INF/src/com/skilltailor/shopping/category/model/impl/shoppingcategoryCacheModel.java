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

package com.skilltailor.shopping.category.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.skilltailor.shopping.category.model.shoppingcategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing shoppingcategory in entity cache.
 *
 * @author deepakgupta02
 * @see shoppingcategory
 * @generated
 */
public class shoppingcategoryCacheModel implements CacheModel<shoppingcategory>,
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public shoppingcategory toEntityModel() {
		shoppingcategoryImpl shoppingcategoryImpl = new shoppingcategoryImpl();

		shoppingcategoryImpl.setCategoryId(categoryId);
		shoppingcategoryImpl.setGroupId(groupId);
		shoppingcategoryImpl.setCompanyId(companyId);
		shoppingcategoryImpl.setUserId(userId);

		if (userName == null) {
			shoppingcategoryImpl.setUserName(StringPool.BLANK);
		}
		else {
			shoppingcategoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			shoppingcategoryImpl.setCreateDate(null);
		}
		else {
			shoppingcategoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			shoppingcategoryImpl.setModifiedDate(null);
		}
		else {
			shoppingcategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			shoppingcategoryImpl.setName(StringPool.BLANK);
		}
		else {
			shoppingcategoryImpl.setName(name);
		}

		if (description == null) {
			shoppingcategoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			shoppingcategoryImpl.setDescription(description);
		}

		shoppingcategoryImpl.setParentId(parentId);

		shoppingcategoryImpl.resetOriginalValues();

		return shoppingcategoryImpl;
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
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		parentId = objectInput.readLong();
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

		objectOutput.writeLong(parentId);
	}

	public long categoryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
	public long parentId;
}
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

package com.skilltailor.shopping.product.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.skilltailor.shopping.product.model.Product;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Product in entity cache.
 *
 * @author deepakgupta02
 * @see Product
 * @generated
 */
public class ProductCacheModel implements CacheModel<Product>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{productId=");
		sb.append(productId);
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
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append(", sku=");
		sb.append(sku);
		sb.append(", productName=");
		sb.append(productName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", basicCost=");
		sb.append(basicCost);
		sb.append(", shippingCost=");
		sb.append(shippingCost);
		sb.append(", totalQuantity=");
		sb.append(totalQuantity);
		sb.append(", minQuantity=");
		sb.append(minQuantity);
		sb.append(", maxQuantity=");
		sb.append(maxQuantity);
		sb.append(", taxable=");
		sb.append(taxable);
		sb.append(", stockChecking=");
		sb.append(stockChecking);
		sb.append(", discount=");
		sb.append(discount);
		sb.append(", imageId=");
		sb.append(imageId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Product toEntityModel() {
		ProductImpl productImpl = new ProductImpl();

		productImpl.setProductId(productId);
		productImpl.setGroupId(groupId);
		productImpl.setCompanyId(companyId);
		productImpl.setUserId(userId);

		if (userName == null) {
			productImpl.setUserName(StringPool.BLANK);
		}
		else {
			productImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productImpl.setCreateDate(null);
		}
		else {
			productImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productImpl.setModifiedDate(null);
		}
		else {
			productImpl.setModifiedDate(new Date(modifiedDate));
		}

		productImpl.setCategoryId(categoryId);

		if (sku == null) {
			productImpl.setSku(StringPool.BLANK);
		}
		else {
			productImpl.setSku(sku);
		}

		if (productName == null) {
			productImpl.setProductName(StringPool.BLANK);
		}
		else {
			productImpl.setProductName(productName);
		}

		if (description == null) {
			productImpl.setDescription(StringPool.BLANK);
		}
		else {
			productImpl.setDescription(description);
		}

		productImpl.setBasicCost(basicCost);
		productImpl.setShippingCost(shippingCost);
		productImpl.setTotalQuantity(totalQuantity);
		productImpl.setMinQuantity(minQuantity);
		productImpl.setMaxQuantity(maxQuantity);
		productImpl.setTaxable(taxable);
		productImpl.setStockChecking(stockChecking);
		productImpl.setDiscount(discount);
		productImpl.setImageId(imageId);

		productImpl.resetOriginalValues();

		return productImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		categoryId = objectInput.readLong();
		sku = objectInput.readUTF();
		productName = objectInput.readUTF();
		description = objectInput.readUTF();
		basicCost = objectInput.readInt();
		shippingCost = objectInput.readInt();
		totalQuantity = objectInput.readInt();
		minQuantity = objectInput.readInt();
		maxQuantity = objectInput.readInt();
		taxable = objectInput.readBoolean();
		stockChecking = objectInput.readBoolean();
		discount = objectInput.readDouble();
		imageId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(productId);
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
		objectOutput.writeLong(categoryId);

		if (sku == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sku);
		}

		if (productName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(basicCost);
		objectOutput.writeInt(shippingCost);
		objectOutput.writeInt(totalQuantity);
		objectOutput.writeInt(minQuantity);
		objectOutput.writeInt(maxQuantity);
		objectOutput.writeBoolean(taxable);
		objectOutput.writeBoolean(stockChecking);
		objectOutput.writeDouble(discount);
		objectOutput.writeLong(imageId);
	}

	public long productId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long categoryId;
	public String sku;
	public String productName;
	public String description;
	public int basicCost;
	public int shippingCost;
	public int totalQuantity;
	public int minQuantity;
	public int maxQuantity;
	public Boolean taxable;
	public Boolean stockChecking;
	public double discount;
	public long imageId;
}
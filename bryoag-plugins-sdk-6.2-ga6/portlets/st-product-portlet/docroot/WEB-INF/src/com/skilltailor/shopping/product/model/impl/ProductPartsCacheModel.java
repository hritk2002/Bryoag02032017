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

import com.skilltailor.shopping.product.model.ProductParts;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProductParts in entity cache.
 *
 * @author deepakgupta02
 * @see ProductParts
 * @generated
 */
public class ProductPartsCacheModel implements CacheModel<ProductParts>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{partId=");
		sb.append(partId);
		sb.append(", productId=");
		sb.append(productId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", values=");
		sb.append(values);
		sb.append(", description=");
		sb.append(description);
		sb.append(", hasAdditionalCost=");
		sb.append(hasAdditionalCost);
		sb.append(", additionalCost=");
		sb.append(additionalCost);
		sb.append(", isCommon=");
		sb.append(isCommon);
		sb.append(", sequence=");
		sb.append(sequence);
		sb.append(", tagName=");
		sb.append(tagName);
		sb.append(", compatibleTag=");
		sb.append(compatibleTag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductParts toEntityModel() {
		ProductPartsImpl productPartsImpl = new ProductPartsImpl();

		productPartsImpl.setPartId(partId);
		productPartsImpl.setProductId(productId);

		if (name == null) {
			productPartsImpl.setName(StringPool.BLANK);
		}
		else {
			productPartsImpl.setName(name);
		}

		if (values == null) {
			productPartsImpl.setValues(StringPool.BLANK);
		}
		else {
			productPartsImpl.setValues(values);
		}

		if (description == null) {
			productPartsImpl.setDescription(StringPool.BLANK);
		}
		else {
			productPartsImpl.setDescription(description);
		}

		productPartsImpl.setHasAdditionalCost(hasAdditionalCost);
		productPartsImpl.setAdditionalCost(additionalCost);
		productPartsImpl.setIsCommon(isCommon);
		productPartsImpl.setSequence(sequence);

		if (tagName == null) {
			productPartsImpl.setTagName(StringPool.BLANK);
		}
		else {
			productPartsImpl.setTagName(tagName);
		}

		if (compatibleTag == null) {
			productPartsImpl.setCompatibleTag(StringPool.BLANK);
		}
		else {
			productPartsImpl.setCompatibleTag(compatibleTag);
		}

		productPartsImpl.resetOriginalValues();

		return productPartsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		partId = objectInput.readLong();
		productId = objectInput.readLong();
		name = objectInput.readUTF();
		values = objectInput.readUTF();
		description = objectInput.readUTF();
		hasAdditionalCost = objectInput.readBoolean();
		additionalCost = objectInput.readInt();
		isCommon = objectInput.readBoolean();
		sequence = objectInput.readInt();
		tagName = objectInput.readUTF();
		compatibleTag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(partId);
		objectOutput.writeLong(productId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (values == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(values);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeBoolean(hasAdditionalCost);
		objectOutput.writeInt(additionalCost);
		objectOutput.writeBoolean(isCommon);
		objectOutput.writeInt(sequence);

		if (tagName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagName);
		}

		if (compatibleTag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compatibleTag);
		}
	}

	public long partId;
	public long productId;
	public String name;
	public String values;
	public String description;
	public Boolean hasAdditionalCost;
	public int additionalCost;
	public Boolean isCommon;
	public int sequence;
	public String tagName;
	public String compatibleTag;
}
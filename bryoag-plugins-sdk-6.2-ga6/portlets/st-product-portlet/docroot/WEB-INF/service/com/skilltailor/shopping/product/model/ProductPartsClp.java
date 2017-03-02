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

package com.skilltailor.shopping.product.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.skilltailor.shopping.product.service.ClpSerializer;
import com.skilltailor.shopping.product.service.ProductPartsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author deepakgupta02
 */
public class ProductPartsClp extends BaseModelImpl<ProductParts>
	implements ProductParts {
	public ProductPartsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ProductParts.class;
	}

	@Override
	public String getModelClassName() {
		return ProductParts.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _partId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPartId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _partId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("partId", getPartId());
		attributes.put("productId", getProductId());
		attributes.put("name", getName());
		attributes.put("values", getValues());
		attributes.put("description", getDescription());
		attributes.put("hasAdditionalCost", getHasAdditionalCost());
		attributes.put("additionalCost", getAdditionalCost());
		attributes.put("isCommon", getIsCommon());
		attributes.put("sequence", getSequence());
		attributes.put("tagName", getTagName());
		attributes.put("compatibleTag", getCompatibleTag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long partId = (Long)attributes.get("partId");

		if (partId != null) {
			setPartId(partId);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String values = (String)attributes.get("values");

		if (values != null) {
			setValues(values);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean hasAdditionalCost = (Boolean)attributes.get("hasAdditionalCost");

		if (hasAdditionalCost != null) {
			setHasAdditionalCost(hasAdditionalCost);
		}

		Integer additionalCost = (Integer)attributes.get("additionalCost");

		if (additionalCost != null) {
			setAdditionalCost(additionalCost);
		}

		Boolean isCommon = (Boolean)attributes.get("isCommon");

		if (isCommon != null) {
			setIsCommon(isCommon);
		}

		Integer sequence = (Integer)attributes.get("sequence");

		if (sequence != null) {
			setSequence(sequence);
		}

		String tagName = (String)attributes.get("tagName");

		if (tagName != null) {
			setTagName(tagName);
		}

		String compatibleTag = (String)attributes.get("compatibleTag");

		if (compatibleTag != null) {
			setCompatibleTag(compatibleTag);
		}
	}

	@Override
	public long getPartId() {
		return _partId;
	}

	@Override
	public void setPartId(long partId) {
		_partId = partId;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setPartId", long.class);

				method.invoke(_productPartsRemoteModel, partId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_productId = productId;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", long.class);

				method.invoke(_productPartsRemoteModel, productId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_productPartsRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValues() {
		return _values;
	}

	@Override
	public void setValues(String values) {
		_values = values;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setValues", String.class);

				method.invoke(_productPartsRemoteModel, values);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_productPartsRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Boolean getHasAdditionalCost() {
		return _hasAdditionalCost;
	}

	@Override
	public void setHasAdditionalCost(Boolean hasAdditionalCost) {
		_hasAdditionalCost = hasAdditionalCost;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setHasAdditionalCost",
						Boolean.class);

				method.invoke(_productPartsRemoteModel, hasAdditionalCost);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAdditionalCost() {
		return _additionalCost;
	}

	@Override
	public void setAdditionalCost(int additionalCost) {
		_additionalCost = additionalCost;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setAdditionalCost", int.class);

				method.invoke(_productPartsRemoteModel, additionalCost);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Boolean getIsCommon() {
		return _isCommon;
	}

	@Override
	public void setIsCommon(Boolean isCommon) {
		_isCommon = isCommon;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setIsCommon", Boolean.class);

				method.invoke(_productPartsRemoteModel, isCommon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSequence() {
		return _sequence;
	}

	@Override
	public void setSequence(int sequence) {
		_sequence = sequence;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setSequence", int.class);

				method.invoke(_productPartsRemoteModel, sequence);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTagName() {
		return _tagName;
	}

	@Override
	public void setTagName(String tagName) {
		_tagName = tagName;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setTagName", String.class);

				method.invoke(_productPartsRemoteModel, tagName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompatibleTag() {
		return _compatibleTag;
	}

	@Override
	public void setCompatibleTag(String compatibleTag) {
		_compatibleTag = compatibleTag;

		if (_productPartsRemoteModel != null) {
			try {
				Class<?> clazz = _productPartsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompatibleTag", String.class);

				method.invoke(_productPartsRemoteModel, compatibleTag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getProductPartsRemoteModel() {
		return _productPartsRemoteModel;
	}

	public void setProductPartsRemoteModel(BaseModel<?> productPartsRemoteModel) {
		_productPartsRemoteModel = productPartsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _productPartsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_productPartsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProductPartsLocalServiceUtil.addProductParts(this);
		}
		else {
			ProductPartsLocalServiceUtil.updateProductParts(this);
		}
	}

	@Override
	public ProductParts toEscapedModel() {
		return (ProductParts)ProxyUtil.newProxyInstance(ProductParts.class.getClassLoader(),
			new Class[] { ProductParts.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProductPartsClp clone = new ProductPartsClp();

		clone.setPartId(getPartId());
		clone.setProductId(getProductId());
		clone.setName(getName());
		clone.setValues(getValues());
		clone.setDescription(getDescription());
		clone.setHasAdditionalCost(getHasAdditionalCost());
		clone.setAdditionalCost(getAdditionalCost());
		clone.setIsCommon(getIsCommon());
		clone.setSequence(getSequence());
		clone.setTagName(getTagName());
		clone.setCompatibleTag(getCompatibleTag());

		return clone;
	}

	@Override
	public int compareTo(ProductParts productParts) {
		long primaryKey = productParts.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductPartsClp)) {
			return false;
		}

		ProductPartsClp productParts = (ProductPartsClp)obj;

		long primaryKey = productParts.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{partId=");
		sb.append(getPartId());
		sb.append(", productId=");
		sb.append(getProductId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", values=");
		sb.append(getValues());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", hasAdditionalCost=");
		sb.append(getHasAdditionalCost());
		sb.append(", additionalCost=");
		sb.append(getAdditionalCost());
		sb.append(", isCommon=");
		sb.append(getIsCommon());
		sb.append(", sequence=");
		sb.append(getSequence());
		sb.append(", tagName=");
		sb.append(getTagName());
		sb.append(", compatibleTag=");
		sb.append(getCompatibleTag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.skilltailor.shopping.product.model.ProductParts");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>partId</column-name><column-value><![CDATA[");
		sb.append(getPartId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>values</column-name><column-value><![CDATA[");
		sb.append(getValues());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAdditionalCost</column-name><column-value><![CDATA[");
		sb.append(getHasAdditionalCost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalCost</column-name><column-value><![CDATA[");
		sb.append(getAdditionalCost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCommon</column-name><column-value><![CDATA[");
		sb.append(getIsCommon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequence</column-name><column-value><![CDATA[");
		sb.append(getSequence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagName</column-name><column-value><![CDATA[");
		sb.append(getTagName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compatibleTag</column-name><column-value><![CDATA[");
		sb.append(getCompatibleTag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _partId;
	private long _productId;
	private String _name;
	private String _values;
	private String _description;
	private Boolean _hasAdditionalCost;
	private int _additionalCost;
	private Boolean _isCommon;
	private int _sequence;
	private String _tagName;
	private String _compatibleTag;
	private BaseModel<?> _productPartsRemoteModel;
	private Class<?> _clpSerializerClass = com.skilltailor.shopping.product.service.ClpSerializer.class;
}
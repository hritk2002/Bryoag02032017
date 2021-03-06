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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.model.ProductPartsModel;
import com.skilltailor.shopping.product.model.ProductPartsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ProductParts service. Represents a row in the &quot;skilltailor_ProductParts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.skilltailor.shopping.product.model.ProductPartsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProductPartsImpl}.
 * </p>
 *
 * @author deepakgupta02
 * @see ProductPartsImpl
 * @see com.skilltailor.shopping.product.model.ProductParts
 * @see com.skilltailor.shopping.product.model.ProductPartsModel
 * @generated
 */
@JSON(strict = true)
public class ProductPartsModelImpl extends BaseModelImpl<ProductParts>
	implements ProductPartsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a product parts model instance should use the {@link com.skilltailor.shopping.product.model.ProductParts} interface instead.
	 */
	public static final String TABLE_NAME = "skilltailor_ProductParts";
	public static final Object[][] TABLE_COLUMNS = {
			{ "partId", Types.BIGINT },
			{ "productId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "values_", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "hasAdditionalCost", Types.BOOLEAN },
			{ "additionalCost", Types.INTEGER },
			{ "isCommon", Types.BOOLEAN },
			{ "sequence", Types.INTEGER },
			{ "tagName", Types.VARCHAR },
			{ "compatibleTag", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table skilltailor_ProductParts (partId LONG not null primary key,productId LONG,name VARCHAR(75) null,values_ VARCHAR(75) null,description VARCHAR(75) null,hasAdditionalCost BOOLEAN,additionalCost INTEGER,isCommon BOOLEAN,sequence INTEGER,tagName VARCHAR(75) null,compatibleTag VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table skilltailor_ProductParts";
	public static final String ORDER_BY_JPQL = " ORDER BY productParts.partId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY skilltailor_ProductParts.partId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.skilltailor.shopping.product.model.ProductParts"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.skilltailor.shopping.product.model.ProductParts"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.skilltailor.shopping.product.model.ProductParts"),
			true);
	public static long COMPATIBLETAG_COLUMN_BITMASK = 1L;
	public static long ISCOMMON_COLUMN_BITMASK = 2L;
	public static long NAME_COLUMN_BITMASK = 4L;
	public static long PARTID_COLUMN_BITMASK = 8L;
	public static long PRODUCTID_COLUMN_BITMASK = 16L;
	public static long TAGNAME_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ProductParts toModel(ProductPartsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ProductParts model = new ProductPartsImpl();

		model.setPartId(soapModel.getPartId());
		model.setProductId(soapModel.getProductId());
		model.setName(soapModel.getName());
		model.setValues(soapModel.getValues());
		model.setDescription(soapModel.getDescription());
		model.setHasAdditionalCost(soapModel.getHasAdditionalCost());
		model.setAdditionalCost(soapModel.getAdditionalCost());
		model.setIsCommon(soapModel.getIsCommon());
		model.setSequence(soapModel.getSequence());
		model.setTagName(soapModel.getTagName());
		model.setCompatibleTag(soapModel.getCompatibleTag());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ProductParts> toModels(ProductPartsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ProductParts> models = new ArrayList<ProductParts>(soapModels.length);

		for (ProductPartsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.skilltailor.shopping.product.model.ProductParts"));

	public ProductPartsModelImpl() {
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
	public Class<?> getModelClass() {
		return ProductParts.class;
	}

	@Override
	public String getModelClassName() {
		return ProductParts.class.getName();
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

	@JSON
	@Override
	public long getPartId() {
		return _partId;
	}

	@Override
	public void setPartId(long partId) {
		_columnBitmask |= PARTID_COLUMN_BITMASK;

		if (!_setOriginalPartId) {
			_setOriginalPartId = true;

			_originalPartId = _partId;
		}

		_partId = partId;
	}

	public long getOriginalPartId() {
		return _originalPartId;
	}

	@JSON
	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_columnBitmask |= PRODUCTID_COLUMN_BITMASK;

		if (!_setOriginalProductId) {
			_setOriginalProductId = true;

			_originalProductId = _productId;
		}

		_productId = productId;
	}

	public long getOriginalProductId() {
		return _originalProductId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getValues() {
		if (_values == null) {
			return StringPool.BLANK;
		}
		else {
			return _values;
		}
	}

	@Override
	public void setValues(String values) {
		_values = values;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public Boolean getHasAdditionalCost() {
		return _hasAdditionalCost;
	}

	@Override
	public void setHasAdditionalCost(Boolean hasAdditionalCost) {
		_hasAdditionalCost = hasAdditionalCost;
	}

	@JSON
	@Override
	public int getAdditionalCost() {
		return _additionalCost;
	}

	@Override
	public void setAdditionalCost(int additionalCost) {
		_additionalCost = additionalCost;
	}

	@JSON
	@Override
	public Boolean getIsCommon() {
		return _isCommon;
	}

	@Override
	public void setIsCommon(Boolean isCommon) {
		_columnBitmask |= ISCOMMON_COLUMN_BITMASK;

		if (!_setOriginalIsCommon) {
			_setOriginalIsCommon = true;

			_originalIsCommon = _isCommon;
		}

		_isCommon = isCommon;
	}

	public Boolean getOriginalIsCommon() {
		return _originalIsCommon;
	}

	@JSON
	@Override
	public int getSequence() {
		return _sequence;
	}

	@Override
	public void setSequence(int sequence) {
		_sequence = sequence;
	}

	@JSON
	@Override
	public String getTagName() {
		if (_tagName == null) {
			return StringPool.BLANK;
		}
		else {
			return _tagName;
		}
	}

	@Override
	public void setTagName(String tagName) {
		_columnBitmask |= TAGNAME_COLUMN_BITMASK;

		if (_originalTagName == null) {
			_originalTagName = _tagName;
		}

		_tagName = tagName;
	}

	public String getOriginalTagName() {
		return GetterUtil.getString(_originalTagName);
	}

	@JSON
	@Override
	public String getCompatibleTag() {
		if (_compatibleTag == null) {
			return StringPool.BLANK;
		}
		else {
			return _compatibleTag;
		}
	}

	@Override
	public void setCompatibleTag(String compatibleTag) {
		_columnBitmask |= COMPATIBLETAG_COLUMN_BITMASK;

		if (_originalCompatibleTag == null) {
			_originalCompatibleTag = _compatibleTag;
		}

		_compatibleTag = compatibleTag;
	}

	public String getOriginalCompatibleTag() {
		return GetterUtil.getString(_originalCompatibleTag);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ProductParts.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ProductParts toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProductParts)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProductPartsImpl productPartsImpl = new ProductPartsImpl();

		productPartsImpl.setPartId(getPartId());
		productPartsImpl.setProductId(getProductId());
		productPartsImpl.setName(getName());
		productPartsImpl.setValues(getValues());
		productPartsImpl.setDescription(getDescription());
		productPartsImpl.setHasAdditionalCost(getHasAdditionalCost());
		productPartsImpl.setAdditionalCost(getAdditionalCost());
		productPartsImpl.setIsCommon(getIsCommon());
		productPartsImpl.setSequence(getSequence());
		productPartsImpl.setTagName(getTagName());
		productPartsImpl.setCompatibleTag(getCompatibleTag());

		productPartsImpl.resetOriginalValues();

		return productPartsImpl;
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

		if (!(obj instanceof ProductParts)) {
			return false;
		}

		ProductParts productParts = (ProductParts)obj;

		long primaryKey = productParts.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ProductPartsModelImpl productPartsModelImpl = this;

		productPartsModelImpl._originalPartId = productPartsModelImpl._partId;

		productPartsModelImpl._setOriginalPartId = false;

		productPartsModelImpl._originalProductId = productPartsModelImpl._productId;

		productPartsModelImpl._setOriginalProductId = false;

		productPartsModelImpl._originalName = productPartsModelImpl._name;

		productPartsModelImpl._originalIsCommon = productPartsModelImpl._isCommon;

		productPartsModelImpl._setOriginalIsCommon = false;

		productPartsModelImpl._originalTagName = productPartsModelImpl._tagName;

		productPartsModelImpl._originalCompatibleTag = productPartsModelImpl._compatibleTag;

		productPartsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ProductParts> toCacheModel() {
		ProductPartsCacheModel productPartsCacheModel = new ProductPartsCacheModel();

		productPartsCacheModel.partId = getPartId();

		productPartsCacheModel.productId = getProductId();

		productPartsCacheModel.name = getName();

		String name = productPartsCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			productPartsCacheModel.name = null;
		}

		productPartsCacheModel.values = getValues();

		String values = productPartsCacheModel.values;

		if ((values != null) && (values.length() == 0)) {
			productPartsCacheModel.values = null;
		}

		productPartsCacheModel.description = getDescription();

		String description = productPartsCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			productPartsCacheModel.description = null;
		}

		productPartsCacheModel.hasAdditionalCost = getHasAdditionalCost();

		productPartsCacheModel.additionalCost = getAdditionalCost();

		productPartsCacheModel.isCommon = getIsCommon();

		productPartsCacheModel.sequence = getSequence();

		productPartsCacheModel.tagName = getTagName();

		String tagName = productPartsCacheModel.tagName;

		if ((tagName != null) && (tagName.length() == 0)) {
			productPartsCacheModel.tagName = null;
		}

		productPartsCacheModel.compatibleTag = getCompatibleTag();

		String compatibleTag = productPartsCacheModel.compatibleTag;

		if ((compatibleTag != null) && (compatibleTag.length() == 0)) {
			productPartsCacheModel.compatibleTag = null;
		}

		return productPartsCacheModel;
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

	private static ClassLoader _classLoader = ProductParts.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ProductParts.class
		};
	private long _partId;
	private long _originalPartId;
	private boolean _setOriginalPartId;
	private long _productId;
	private long _originalProductId;
	private boolean _setOriginalProductId;
	private String _name;
	private String _originalName;
	private String _values;
	private String _description;
	private Boolean _hasAdditionalCost;
	private int _additionalCost;
	private Boolean _isCommon;
	private Boolean _originalIsCommon;
	private boolean _setOriginalIsCommon;
	private int _sequence;
	private String _tagName;
	private String _originalTagName;
	private String _compatibleTag;
	private String _originalCompatibleTag;
	private long _columnBitmask;
	private ProductParts _escapedModel;
}
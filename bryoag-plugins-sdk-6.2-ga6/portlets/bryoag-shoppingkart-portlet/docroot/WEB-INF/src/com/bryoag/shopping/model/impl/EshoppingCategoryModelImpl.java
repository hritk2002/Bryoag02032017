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
import com.bryoag.shopping.model.EshoppingCategoryModel;
import com.bryoag.shopping.model.EshoppingCategorySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EshoppingCategory service. Represents a row in the &quot;bryoag__EshoppingCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.bryoag.shopping.model.EshoppingCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EshoppingCategoryImpl}.
 * </p>
 *
 * @author deepakgupta02
 * @see EshoppingCategoryImpl
 * @see com.bryoag.shopping.model.EshoppingCategory
 * @see com.bryoag.shopping.model.EshoppingCategoryModel
 * @generated
 */
@JSON(strict = true)
public class EshoppingCategoryModelImpl extends BaseModelImpl<EshoppingCategory>
	implements EshoppingCategoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a eshopping category model instance should use the {@link com.bryoag.shopping.model.EshoppingCategory} interface instead.
	 */
	public static final String TABLE_NAME = "bryoag__EshoppingCategory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "categoryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "parentCategoryId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table bryoag__EshoppingCategory (categoryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,parentCategoryId LONG,name VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table bryoag__EshoppingCategory";
	public static final String ORDER_BY_JPQL = " ORDER BY eshoppingCategory.companyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY bryoag__EshoppingCategory.companyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bryoag.shopping.model.EshoppingCategory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bryoag.shopping.model.EshoppingCategory"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.bryoag.shopping.model.EshoppingCategory"),
			true);
	public static long CATEGORYID_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long NAME_COLUMN_BITMASK = 8L;
	public static long PARENTCATEGORYID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EshoppingCategory toModel(EshoppingCategorySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EshoppingCategory model = new EshoppingCategoryImpl();

		model.setCategoryId(soapModel.getCategoryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setParentCategoryId(soapModel.getParentCategoryId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EshoppingCategory> toModels(
		EshoppingCategorySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EshoppingCategory> models = new ArrayList<EshoppingCategory>(soapModels.length);

		for (EshoppingCategorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.bryoag.shopping.model.EshoppingCategory"));

	public EshoppingCategoryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _categoryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCategoryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _categoryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EshoppingCategory.class;
	}

	@Override
	public String getModelClassName() {
		return EshoppingCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryId", getCategoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("parentCategoryId", getParentCategoryId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
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

		Long parentCategoryId = (Long)attributes.get("parentCategoryId");

		if (parentCategoryId != null) {
			setParentCategoryId(parentCategoryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@JSON
	@Override
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask = -1L;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getParentCategoryId() {
		return _parentCategoryId;
	}

	@Override
	public void setParentCategoryId(long parentCategoryId) {
		_columnBitmask |= PARENTCATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalParentCategoryId) {
			_setOriginalParentCategoryId = true;

			_originalParentCategoryId = _parentCategoryId;
		}

		_parentCategoryId = parentCategoryId;
	}

	public long getOriginalParentCategoryId() {
		return _originalParentCategoryId;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EshoppingCategory.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EshoppingCategory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EshoppingCategory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EshoppingCategoryImpl eshoppingCategoryImpl = new EshoppingCategoryImpl();

		eshoppingCategoryImpl.setCategoryId(getCategoryId());
		eshoppingCategoryImpl.setGroupId(getGroupId());
		eshoppingCategoryImpl.setCompanyId(getCompanyId());
		eshoppingCategoryImpl.setUserId(getUserId());
		eshoppingCategoryImpl.setUserName(getUserName());
		eshoppingCategoryImpl.setCreateDate(getCreateDate());
		eshoppingCategoryImpl.setModifiedDate(getModifiedDate());
		eshoppingCategoryImpl.setParentCategoryId(getParentCategoryId());
		eshoppingCategoryImpl.setName(getName());
		eshoppingCategoryImpl.setDescription(getDescription());

		eshoppingCategoryImpl.resetOriginalValues();

		return eshoppingCategoryImpl;
	}

	@Override
	public int compareTo(EshoppingCategory eshoppingCategory) {
		int value = 0;

		if (getCompanyId() < eshoppingCategory.getCompanyId()) {
			value = -1;
		}
		else if (getCompanyId() > eshoppingCategory.getCompanyId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EshoppingCategory)) {
			return false;
		}

		EshoppingCategory eshoppingCategory = (EshoppingCategory)obj;

		long primaryKey = eshoppingCategory.getPrimaryKey();

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
		EshoppingCategoryModelImpl eshoppingCategoryModelImpl = this;

		eshoppingCategoryModelImpl._originalCategoryId = eshoppingCategoryModelImpl._categoryId;

		eshoppingCategoryModelImpl._setOriginalCategoryId = false;

		eshoppingCategoryModelImpl._originalGroupId = eshoppingCategoryModelImpl._groupId;

		eshoppingCategoryModelImpl._setOriginalGroupId = false;

		eshoppingCategoryModelImpl._originalCompanyId = eshoppingCategoryModelImpl._companyId;

		eshoppingCategoryModelImpl._setOriginalCompanyId = false;

		eshoppingCategoryModelImpl._originalParentCategoryId = eshoppingCategoryModelImpl._parentCategoryId;

		eshoppingCategoryModelImpl._setOriginalParentCategoryId = false;

		eshoppingCategoryModelImpl._originalName = eshoppingCategoryModelImpl._name;

		eshoppingCategoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EshoppingCategory> toCacheModel() {
		EshoppingCategoryCacheModel eshoppingCategoryCacheModel = new EshoppingCategoryCacheModel();

		eshoppingCategoryCacheModel.categoryId = getCategoryId();

		eshoppingCategoryCacheModel.groupId = getGroupId();

		eshoppingCategoryCacheModel.companyId = getCompanyId();

		eshoppingCategoryCacheModel.userId = getUserId();

		eshoppingCategoryCacheModel.userName = getUserName();

		String userName = eshoppingCategoryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			eshoppingCategoryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			eshoppingCategoryCacheModel.createDate = createDate.getTime();
		}
		else {
			eshoppingCategoryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			eshoppingCategoryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			eshoppingCategoryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		eshoppingCategoryCacheModel.parentCategoryId = getParentCategoryId();

		eshoppingCategoryCacheModel.name = getName();

		String name = eshoppingCategoryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			eshoppingCategoryCacheModel.name = null;
		}

		eshoppingCategoryCacheModel.description = getDescription();

		String description = eshoppingCategoryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			eshoppingCategoryCacheModel.description = null;
		}

		return eshoppingCategoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{categoryId=");
		sb.append(getCategoryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", parentCategoryId=");
		sb.append(getParentCategoryId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.bryoag.shopping.model.EshoppingCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentCategoryId</column-name><column-value><![CDATA[");
		sb.append(getParentCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EshoppingCategory.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EshoppingCategory.class
		};
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _parentCategoryId;
	private long _originalParentCategoryId;
	private boolean _setOriginalParentCategoryId;
	private String _name;
	private String _originalName;
	private String _description;
	private long _columnBitmask;
	private EshoppingCategory _escapedModel;
}
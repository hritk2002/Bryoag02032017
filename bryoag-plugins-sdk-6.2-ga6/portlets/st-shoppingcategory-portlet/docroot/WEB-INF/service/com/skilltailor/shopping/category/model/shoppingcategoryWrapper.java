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

package com.skilltailor.shopping.category.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link shoppingcategory}.
 * </p>
 *
 * @author deepakgupta02
 * @see shoppingcategory
 * @generated
 */
public class shoppingcategoryWrapper implements shoppingcategory,
	ModelWrapper<shoppingcategory> {
	public shoppingcategoryWrapper(shoppingcategory shoppingcategory) {
		_shoppingcategory = shoppingcategory;
	}

	@Override
	public Class<?> getModelClass() {
		return shoppingcategory.class;
	}

	@Override
	public String getModelClassName() {
		return shoppingcategory.class.getName();
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
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("parentId", getParentId());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}
	}

	/**
	* Returns the primary key of this shoppingcategory.
	*
	* @return the primary key of this shoppingcategory
	*/
	@Override
	public long getPrimaryKey() {
		return _shoppingcategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this shoppingcategory.
	*
	* @param primaryKey the primary key of this shoppingcategory
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_shoppingcategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the category ID of this shoppingcategory.
	*
	* @return the category ID of this shoppingcategory
	*/
	@Override
	public long getCategoryId() {
		return _shoppingcategory.getCategoryId();
	}

	/**
	* Sets the category ID of this shoppingcategory.
	*
	* @param categoryId the category ID of this shoppingcategory
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_shoppingcategory.setCategoryId(categoryId);
	}

	/**
	* Returns the group ID of this shoppingcategory.
	*
	* @return the group ID of this shoppingcategory
	*/
	@Override
	public long getGroupId() {
		return _shoppingcategory.getGroupId();
	}

	/**
	* Sets the group ID of this shoppingcategory.
	*
	* @param groupId the group ID of this shoppingcategory
	*/
	@Override
	public void setGroupId(long groupId) {
		_shoppingcategory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this shoppingcategory.
	*
	* @return the company ID of this shoppingcategory
	*/
	@Override
	public long getCompanyId() {
		return _shoppingcategory.getCompanyId();
	}

	/**
	* Sets the company ID of this shoppingcategory.
	*
	* @param companyId the company ID of this shoppingcategory
	*/
	@Override
	public void setCompanyId(long companyId) {
		_shoppingcategory.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this shoppingcategory.
	*
	* @return the user ID of this shoppingcategory
	*/
	@Override
	public long getUserId() {
		return _shoppingcategory.getUserId();
	}

	/**
	* Sets the user ID of this shoppingcategory.
	*
	* @param userId the user ID of this shoppingcategory
	*/
	@Override
	public void setUserId(long userId) {
		_shoppingcategory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this shoppingcategory.
	*
	* @return the user uuid of this shoppingcategory
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcategory.getUserUuid();
	}

	/**
	* Sets the user uuid of this shoppingcategory.
	*
	* @param userUuid the user uuid of this shoppingcategory
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_shoppingcategory.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this shoppingcategory.
	*
	* @return the user name of this shoppingcategory
	*/
	@Override
	public java.lang.String getUserName() {
		return _shoppingcategory.getUserName();
	}

	/**
	* Sets the user name of this shoppingcategory.
	*
	* @param userName the user name of this shoppingcategory
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_shoppingcategory.setUserName(userName);
	}

	/**
	* Returns the create date of this shoppingcategory.
	*
	* @return the create date of this shoppingcategory
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _shoppingcategory.getCreateDate();
	}

	/**
	* Sets the create date of this shoppingcategory.
	*
	* @param createDate the create date of this shoppingcategory
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_shoppingcategory.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this shoppingcategory.
	*
	* @return the modified date of this shoppingcategory
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _shoppingcategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this shoppingcategory.
	*
	* @param modifiedDate the modified date of this shoppingcategory
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_shoppingcategory.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this shoppingcategory.
	*
	* @return the name of this shoppingcategory
	*/
	@Override
	public java.lang.String getName() {
		return _shoppingcategory.getName();
	}

	/**
	* Sets the name of this shoppingcategory.
	*
	* @param name the name of this shoppingcategory
	*/
	@Override
	public void setName(java.lang.String name) {
		_shoppingcategory.setName(name);
	}

	/**
	* Returns the description of this shoppingcategory.
	*
	* @return the description of this shoppingcategory
	*/
	@Override
	public java.lang.String getDescription() {
		return _shoppingcategory.getDescription();
	}

	/**
	* Sets the description of this shoppingcategory.
	*
	* @param description the description of this shoppingcategory
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_shoppingcategory.setDescription(description);
	}

	/**
	* Returns the parent ID of this shoppingcategory.
	*
	* @return the parent ID of this shoppingcategory
	*/
	@Override
	public long getParentId() {
		return _shoppingcategory.getParentId();
	}

	/**
	* Sets the parent ID of this shoppingcategory.
	*
	* @param parentId the parent ID of this shoppingcategory
	*/
	@Override
	public void setParentId(long parentId) {
		_shoppingcategory.setParentId(parentId);
	}

	@Override
	public boolean isNew() {
		return _shoppingcategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_shoppingcategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _shoppingcategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_shoppingcategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _shoppingcategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _shoppingcategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_shoppingcategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _shoppingcategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_shoppingcategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_shoppingcategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_shoppingcategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new shoppingcategoryWrapper((shoppingcategory)_shoppingcategory.clone());
	}

	@Override
	public int compareTo(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory) {
		return _shoppingcategory.compareTo(shoppingcategory);
	}

	@Override
	public int hashCode() {
		return _shoppingcategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.skilltailor.shopping.category.model.shoppingcategory> toCacheModel() {
		return _shoppingcategory.toCacheModel();
	}

	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory toEscapedModel() {
		return new shoppingcategoryWrapper(_shoppingcategory.toEscapedModel());
	}

	@Override
	public com.skilltailor.shopping.category.model.shoppingcategory toUnescapedModel() {
		return new shoppingcategoryWrapper(_shoppingcategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _shoppingcategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _shoppingcategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_shoppingcategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof shoppingcategoryWrapper)) {
			return false;
		}

		shoppingcategoryWrapper shoppingcategoryWrapper = (shoppingcategoryWrapper)obj;

		if (Validator.equals(_shoppingcategory,
					shoppingcategoryWrapper._shoppingcategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public shoppingcategory getWrappedshoppingcategory() {
		return _shoppingcategory;
	}

	@Override
	public shoppingcategory getWrappedModel() {
		return _shoppingcategory;
	}

	@Override
	public void resetOriginalValues() {
		_shoppingcategory.resetOriginalValues();
	}

	private shoppingcategory _shoppingcategory;
}
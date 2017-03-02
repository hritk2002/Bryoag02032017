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

package com.bryoag.shopping.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EshoppingCategory}.
 * </p>
 *
 * @author deepakgupta02
 * @see EshoppingCategory
 * @generated
 */
public class EshoppingCategoryWrapper implements EshoppingCategory,
	ModelWrapper<EshoppingCategory> {
	public EshoppingCategoryWrapper(EshoppingCategory eshoppingCategory) {
		_eshoppingCategory = eshoppingCategory;
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

	/**
	* Returns the primary key of this eshopping category.
	*
	* @return the primary key of this eshopping category
	*/
	@Override
	public long getPrimaryKey() {
		return _eshoppingCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this eshopping category.
	*
	* @param primaryKey the primary key of this eshopping category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_eshoppingCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the category ID of this eshopping category.
	*
	* @return the category ID of this eshopping category
	*/
	@Override
	public long getCategoryId() {
		return _eshoppingCategory.getCategoryId();
	}

	/**
	* Sets the category ID of this eshopping category.
	*
	* @param categoryId the category ID of this eshopping category
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_eshoppingCategory.setCategoryId(categoryId);
	}

	/**
	* Returns the group ID of this eshopping category.
	*
	* @return the group ID of this eshopping category
	*/
	@Override
	public long getGroupId() {
		return _eshoppingCategory.getGroupId();
	}

	/**
	* Sets the group ID of this eshopping category.
	*
	* @param groupId the group ID of this eshopping category
	*/
	@Override
	public void setGroupId(long groupId) {
		_eshoppingCategory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this eshopping category.
	*
	* @return the company ID of this eshopping category
	*/
	@Override
	public long getCompanyId() {
		return _eshoppingCategory.getCompanyId();
	}

	/**
	* Sets the company ID of this eshopping category.
	*
	* @param companyId the company ID of this eshopping category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_eshoppingCategory.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this eshopping category.
	*
	* @return the user ID of this eshopping category
	*/
	@Override
	public long getUserId() {
		return _eshoppingCategory.getUserId();
	}

	/**
	* Sets the user ID of this eshopping category.
	*
	* @param userId the user ID of this eshopping category
	*/
	@Override
	public void setUserId(long userId) {
		_eshoppingCategory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this eshopping category.
	*
	* @return the user uuid of this eshopping category
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eshoppingCategory.getUserUuid();
	}

	/**
	* Sets the user uuid of this eshopping category.
	*
	* @param userUuid the user uuid of this eshopping category
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_eshoppingCategory.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this eshopping category.
	*
	* @return the user name of this eshopping category
	*/
	@Override
	public java.lang.String getUserName() {
		return _eshoppingCategory.getUserName();
	}

	/**
	* Sets the user name of this eshopping category.
	*
	* @param userName the user name of this eshopping category
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_eshoppingCategory.setUserName(userName);
	}

	/**
	* Returns the create date of this eshopping category.
	*
	* @return the create date of this eshopping category
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _eshoppingCategory.getCreateDate();
	}

	/**
	* Sets the create date of this eshopping category.
	*
	* @param createDate the create date of this eshopping category
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_eshoppingCategory.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this eshopping category.
	*
	* @return the modified date of this eshopping category
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _eshoppingCategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this eshopping category.
	*
	* @param modifiedDate the modified date of this eshopping category
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_eshoppingCategory.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the parent category ID of this eshopping category.
	*
	* @return the parent category ID of this eshopping category
	*/
	@Override
	public long getParentCategoryId() {
		return _eshoppingCategory.getParentCategoryId();
	}

	/**
	* Sets the parent category ID of this eshopping category.
	*
	* @param parentCategoryId the parent category ID of this eshopping category
	*/
	@Override
	public void setParentCategoryId(long parentCategoryId) {
		_eshoppingCategory.setParentCategoryId(parentCategoryId);
	}

	/**
	* Returns the name of this eshopping category.
	*
	* @return the name of this eshopping category
	*/
	@Override
	public java.lang.String getName() {
		return _eshoppingCategory.getName();
	}

	/**
	* Sets the name of this eshopping category.
	*
	* @param name the name of this eshopping category
	*/
	@Override
	public void setName(java.lang.String name) {
		_eshoppingCategory.setName(name);
	}

	/**
	* Returns the description of this eshopping category.
	*
	* @return the description of this eshopping category
	*/
	@Override
	public java.lang.String getDescription() {
		return _eshoppingCategory.getDescription();
	}

	/**
	* Sets the description of this eshopping category.
	*
	* @param description the description of this eshopping category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_eshoppingCategory.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _eshoppingCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_eshoppingCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _eshoppingCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_eshoppingCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _eshoppingCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _eshoppingCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_eshoppingCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _eshoppingCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_eshoppingCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_eshoppingCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_eshoppingCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EshoppingCategoryWrapper((EshoppingCategory)_eshoppingCategory.clone());
	}

	@Override
	public int compareTo(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory) {
		return _eshoppingCategory.compareTo(eshoppingCategory);
	}

	@Override
	public int hashCode() {
		return _eshoppingCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.bryoag.shopping.model.EshoppingCategory> toCacheModel() {
		return _eshoppingCategory.toCacheModel();
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory toEscapedModel() {
		return new EshoppingCategoryWrapper(_eshoppingCategory.toEscapedModel());
	}

	@Override
	public com.bryoag.shopping.model.EshoppingCategory toUnescapedModel() {
		return new EshoppingCategoryWrapper(_eshoppingCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _eshoppingCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _eshoppingCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_eshoppingCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EshoppingCategoryWrapper)) {
			return false;
		}

		EshoppingCategoryWrapper eshoppingCategoryWrapper = (EshoppingCategoryWrapper)obj;

		if (Validator.equals(_eshoppingCategory,
					eshoppingCategoryWrapper._eshoppingCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EshoppingCategory getWrappedEshoppingCategory() {
		return _eshoppingCategory;
	}

	@Override
	public EshoppingCategory getWrappedModel() {
		return _eshoppingCategory;
	}

	@Override
	public void resetOriginalValues() {
		_eshoppingCategory.resetOriginalValues();
	}

	private EshoppingCategory _eshoppingCategory;
}
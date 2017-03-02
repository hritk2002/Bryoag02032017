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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProductParts}.
 * </p>
 *
 * @author deepakgupta02
 * @see ProductParts
 * @generated
 */
public class ProductPartsWrapper implements ProductParts,
	ModelWrapper<ProductParts> {
	public ProductPartsWrapper(ProductParts productParts) {
		_productParts = productParts;
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

	/**
	* Returns the primary key of this product parts.
	*
	* @return the primary key of this product parts
	*/
	@Override
	public long getPrimaryKey() {
		return _productParts.getPrimaryKey();
	}

	/**
	* Sets the primary key of this product parts.
	*
	* @param primaryKey the primary key of this product parts
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_productParts.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the part ID of this product parts.
	*
	* @return the part ID of this product parts
	*/
	@Override
	public long getPartId() {
		return _productParts.getPartId();
	}

	/**
	* Sets the part ID of this product parts.
	*
	* @param partId the part ID of this product parts
	*/
	@Override
	public void setPartId(long partId) {
		_productParts.setPartId(partId);
	}

	/**
	* Returns the product ID of this product parts.
	*
	* @return the product ID of this product parts
	*/
	@Override
	public long getProductId() {
		return _productParts.getProductId();
	}

	/**
	* Sets the product ID of this product parts.
	*
	* @param productId the product ID of this product parts
	*/
	@Override
	public void setProductId(long productId) {
		_productParts.setProductId(productId);
	}

	/**
	* Returns the name of this product parts.
	*
	* @return the name of this product parts
	*/
	@Override
	public java.lang.String getName() {
		return _productParts.getName();
	}

	/**
	* Sets the name of this product parts.
	*
	* @param name the name of this product parts
	*/
	@Override
	public void setName(java.lang.String name) {
		_productParts.setName(name);
	}

	/**
	* Returns the values of this product parts.
	*
	* @return the values of this product parts
	*/
	@Override
	public java.lang.String getValues() {
		return _productParts.getValues();
	}

	/**
	* Sets the values of this product parts.
	*
	* @param values the values of this product parts
	*/
	@Override
	public void setValues(java.lang.String values) {
		_productParts.setValues(values);
	}

	/**
	* Returns the description of this product parts.
	*
	* @return the description of this product parts
	*/
	@Override
	public java.lang.String getDescription() {
		return _productParts.getDescription();
	}

	/**
	* Sets the description of this product parts.
	*
	* @param description the description of this product parts
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_productParts.setDescription(description);
	}

	/**
	* Returns the has additional cost of this product parts.
	*
	* @return the has additional cost of this product parts
	*/
	@Override
	public java.lang.Boolean getHasAdditionalCost() {
		return _productParts.getHasAdditionalCost();
	}

	/**
	* Sets the has additional cost of this product parts.
	*
	* @param hasAdditionalCost the has additional cost of this product parts
	*/
	@Override
	public void setHasAdditionalCost(java.lang.Boolean hasAdditionalCost) {
		_productParts.setHasAdditionalCost(hasAdditionalCost);
	}

	/**
	* Returns the additional cost of this product parts.
	*
	* @return the additional cost of this product parts
	*/
	@Override
	public int getAdditionalCost() {
		return _productParts.getAdditionalCost();
	}

	/**
	* Sets the additional cost of this product parts.
	*
	* @param additionalCost the additional cost of this product parts
	*/
	@Override
	public void setAdditionalCost(int additionalCost) {
		_productParts.setAdditionalCost(additionalCost);
	}

	/**
	* Returns the is common of this product parts.
	*
	* @return the is common of this product parts
	*/
	@Override
	public java.lang.Boolean getIsCommon() {
		return _productParts.getIsCommon();
	}

	/**
	* Sets the is common of this product parts.
	*
	* @param isCommon the is common of this product parts
	*/
	@Override
	public void setIsCommon(java.lang.Boolean isCommon) {
		_productParts.setIsCommon(isCommon);
	}

	/**
	* Returns the sequence of this product parts.
	*
	* @return the sequence of this product parts
	*/
	@Override
	public int getSequence() {
		return _productParts.getSequence();
	}

	/**
	* Sets the sequence of this product parts.
	*
	* @param sequence the sequence of this product parts
	*/
	@Override
	public void setSequence(int sequence) {
		_productParts.setSequence(sequence);
	}

	/**
	* Returns the tag name of this product parts.
	*
	* @return the tag name of this product parts
	*/
	@Override
	public java.lang.String getTagName() {
		return _productParts.getTagName();
	}

	/**
	* Sets the tag name of this product parts.
	*
	* @param tagName the tag name of this product parts
	*/
	@Override
	public void setTagName(java.lang.String tagName) {
		_productParts.setTagName(tagName);
	}

	/**
	* Returns the compatible tag of this product parts.
	*
	* @return the compatible tag of this product parts
	*/
	@Override
	public java.lang.String getCompatibleTag() {
		return _productParts.getCompatibleTag();
	}

	/**
	* Sets the compatible tag of this product parts.
	*
	* @param compatibleTag the compatible tag of this product parts
	*/
	@Override
	public void setCompatibleTag(java.lang.String compatibleTag) {
		_productParts.setCompatibleTag(compatibleTag);
	}

	@Override
	public boolean isNew() {
		return _productParts.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_productParts.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _productParts.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_productParts.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _productParts.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _productParts.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_productParts.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _productParts.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_productParts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_productParts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_productParts.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProductPartsWrapper((ProductParts)_productParts.clone());
	}

	@Override
	public int compareTo(
		com.skilltailor.shopping.product.model.ProductParts productParts) {
		return _productParts.compareTo(productParts);
	}

	@Override
	public int hashCode() {
		return _productParts.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.skilltailor.shopping.product.model.ProductParts> toCacheModel() {
		return _productParts.toCacheModel();
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts toEscapedModel() {
		return new ProductPartsWrapper(_productParts.toEscapedModel());
	}

	@Override
	public com.skilltailor.shopping.product.model.ProductParts toUnescapedModel() {
		return new ProductPartsWrapper(_productParts.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _productParts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _productParts.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_productParts.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductPartsWrapper)) {
			return false;
		}

		ProductPartsWrapper productPartsWrapper = (ProductPartsWrapper)obj;

		if (Validator.equals(_productParts, productPartsWrapper._productParts)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ProductParts getWrappedProductParts() {
		return _productParts;
	}

	@Override
	public ProductParts getWrappedModel() {
		return _productParts;
	}

	@Override
	public void resetOriginalValues() {
		_productParts.resetOriginalValues();
	}

	private ProductParts _productParts;
}
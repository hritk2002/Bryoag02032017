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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ProductParts service. Represents a row in the &quot;skilltailor_ProductParts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.skilltailor.shopping.product.model.impl.ProductPartsImpl}.
 * </p>
 *
 * @author deepakgupta02
 * @see ProductParts
 * @see com.skilltailor.shopping.product.model.impl.ProductPartsImpl
 * @see com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl
 * @generated
 */
public interface ProductPartsModel extends BaseModel<ProductParts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a product parts model instance should use the {@link ProductParts} interface instead.
	 */

	/**
	 * Returns the primary key of this product parts.
	 *
	 * @return the primary key of this product parts
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this product parts.
	 *
	 * @param primaryKey the primary key of this product parts
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the part ID of this product parts.
	 *
	 * @return the part ID of this product parts
	 */
	public long getPartId();

	/**
	 * Sets the part ID of this product parts.
	 *
	 * @param partId the part ID of this product parts
	 */
	public void setPartId(long partId);

	/**
	 * Returns the product ID of this product parts.
	 *
	 * @return the product ID of this product parts
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this product parts.
	 *
	 * @param productId the product ID of this product parts
	 */
	public void setProductId(long productId);

	/**
	 * Returns the name of this product parts.
	 *
	 * @return the name of this product parts
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this product parts.
	 *
	 * @param name the name of this product parts
	 */
	public void setName(String name);

	/**
	 * Returns the values of this product parts.
	 *
	 * @return the values of this product parts
	 */
	@AutoEscape
	public String getValues();

	/**
	 * Sets the values of this product parts.
	 *
	 * @param values the values of this product parts
	 */
	public void setValues(String values);

	/**
	 * Returns the description of this product parts.
	 *
	 * @return the description of this product parts
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this product parts.
	 *
	 * @param description the description of this product parts
	 */
	public void setDescription(String description);

	/**
	 * Returns the has additional cost of this product parts.
	 *
	 * @return the has additional cost of this product parts
	 */
	public Boolean getHasAdditionalCost();

	/**
	 * Sets the has additional cost of this product parts.
	 *
	 * @param hasAdditionalCost the has additional cost of this product parts
	 */
	public void setHasAdditionalCost(Boolean hasAdditionalCost);

	/**
	 * Returns the additional cost of this product parts.
	 *
	 * @return the additional cost of this product parts
	 */
	public int getAdditionalCost();

	/**
	 * Sets the additional cost of this product parts.
	 *
	 * @param additionalCost the additional cost of this product parts
	 */
	public void setAdditionalCost(int additionalCost);

	/**
	 * Returns the is common of this product parts.
	 *
	 * @return the is common of this product parts
	 */
	public Boolean getIsCommon();

	/**
	 * Sets the is common of this product parts.
	 *
	 * @param isCommon the is common of this product parts
	 */
	public void setIsCommon(Boolean isCommon);

	/**
	 * Returns the sequence of this product parts.
	 *
	 * @return the sequence of this product parts
	 */
	public int getSequence();

	/**
	 * Sets the sequence of this product parts.
	 *
	 * @param sequence the sequence of this product parts
	 */
	public void setSequence(int sequence);

	/**
	 * Returns the tag name of this product parts.
	 *
	 * @return the tag name of this product parts
	 */
	@AutoEscape
	public String getTagName();

	/**
	 * Sets the tag name of this product parts.
	 *
	 * @param tagName the tag name of this product parts
	 */
	public void setTagName(String tagName);

	/**
	 * Returns the compatible tag of this product parts.
	 *
	 * @return the compatible tag of this product parts
	 */
	@AutoEscape
	public String getCompatibleTag();

	/**
	 * Sets the compatible tag of this product parts.
	 *
	 * @param compatibleTag the compatible tag of this product parts
	 */
	public void setCompatibleTag(String compatibleTag);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.skilltailor.shopping.product.model.ProductParts productParts);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.skilltailor.shopping.product.model.ProductParts> toCacheModel();

	@Override
	public com.skilltailor.shopping.product.model.ProductParts toEscapedModel();

	@Override
	public com.skilltailor.shopping.product.model.ProductParts toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
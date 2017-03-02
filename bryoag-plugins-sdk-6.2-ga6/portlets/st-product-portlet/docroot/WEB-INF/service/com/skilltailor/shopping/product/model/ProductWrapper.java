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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Product}.
 * </p>
 *
 * @author deepakgupta02
 * @see Product
 * @generated
 */
public class ProductWrapper implements Product, ModelWrapper<Product> {
	public ProductWrapper(Product product) {
		_product = product;
	}

	@Override
	public Class<?> getModelClass() {
		return Product.class;
	}

	@Override
	public String getModelClassName() {
		return Product.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("categoryId", getCategoryId());
		attributes.put("sku", getSku());
		attributes.put("productName", getProductName());
		attributes.put("description", getDescription());
		attributes.put("basicCost", getBasicCost());
		attributes.put("shippingCost", getShippingCost());
		attributes.put("totalQuantity", getTotalQuantity());
		attributes.put("minQuantity", getMinQuantity());
		attributes.put("maxQuantity", getMaxQuantity());
		attributes.put("taxable", getTaxable());
		attributes.put("stockChecking", getStockChecking());
		attributes.put("discount", getDiscount());
		attributes.put("imageId", getImageId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
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

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String sku = (String)attributes.get("sku");

		if (sku != null) {
			setSku(sku);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer basicCost = (Integer)attributes.get("basicCost");

		if (basicCost != null) {
			setBasicCost(basicCost);
		}

		Integer shippingCost = (Integer)attributes.get("shippingCost");

		if (shippingCost != null) {
			setShippingCost(shippingCost);
		}

		Integer totalQuantity = (Integer)attributes.get("totalQuantity");

		if (totalQuantity != null) {
			setTotalQuantity(totalQuantity);
		}

		Integer minQuantity = (Integer)attributes.get("minQuantity");

		if (minQuantity != null) {
			setMinQuantity(minQuantity);
		}

		Integer maxQuantity = (Integer)attributes.get("maxQuantity");

		if (maxQuantity != null) {
			setMaxQuantity(maxQuantity);
		}

		Boolean taxable = (Boolean)attributes.get("taxable");

		if (taxable != null) {
			setTaxable(taxable);
		}

		Boolean stockChecking = (Boolean)attributes.get("stockChecking");

		if (stockChecking != null) {
			setStockChecking(stockChecking);
		}

		Double discount = (Double)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}
	}

	/**
	* Returns the primary key of this product.
	*
	* @return the primary key of this product
	*/
	@Override
	public long getPrimaryKey() {
		return _product.getPrimaryKey();
	}

	/**
	* Sets the primary key of this product.
	*
	* @param primaryKey the primary key of this product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_product.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the product ID of this product.
	*
	* @return the product ID of this product
	*/
	@Override
	public long getProductId() {
		return _product.getProductId();
	}

	/**
	* Sets the product ID of this product.
	*
	* @param productId the product ID of this product
	*/
	@Override
	public void setProductId(long productId) {
		_product.setProductId(productId);
	}

	/**
	* Returns the group ID of this product.
	*
	* @return the group ID of this product
	*/
	@Override
	public long getGroupId() {
		return _product.getGroupId();
	}

	/**
	* Sets the group ID of this product.
	*
	* @param groupId the group ID of this product
	*/
	@Override
	public void setGroupId(long groupId) {
		_product.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this product.
	*
	* @return the company ID of this product
	*/
	@Override
	public long getCompanyId() {
		return _product.getCompanyId();
	}

	/**
	* Sets the company ID of this product.
	*
	* @param companyId the company ID of this product
	*/
	@Override
	public void setCompanyId(long companyId) {
		_product.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this product.
	*
	* @return the user ID of this product
	*/
	@Override
	public long getUserId() {
		return _product.getUserId();
	}

	/**
	* Sets the user ID of this product.
	*
	* @param userId the user ID of this product
	*/
	@Override
	public void setUserId(long userId) {
		_product.setUserId(userId);
	}

	/**
	* Returns the user uuid of this product.
	*
	* @return the user uuid of this product
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _product.getUserUuid();
	}

	/**
	* Sets the user uuid of this product.
	*
	* @param userUuid the user uuid of this product
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_product.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this product.
	*
	* @return the user name of this product
	*/
	@Override
	public java.lang.String getUserName() {
		return _product.getUserName();
	}

	/**
	* Sets the user name of this product.
	*
	* @param userName the user name of this product
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_product.setUserName(userName);
	}

	/**
	* Returns the create date of this product.
	*
	* @return the create date of this product
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _product.getCreateDate();
	}

	/**
	* Sets the create date of this product.
	*
	* @param createDate the create date of this product
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_product.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this product.
	*
	* @return the modified date of this product
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _product.getModifiedDate();
	}

	/**
	* Sets the modified date of this product.
	*
	* @param modifiedDate the modified date of this product
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_product.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the category ID of this product.
	*
	* @return the category ID of this product
	*/
	@Override
	public long getCategoryId() {
		return _product.getCategoryId();
	}

	/**
	* Sets the category ID of this product.
	*
	* @param categoryId the category ID of this product
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_product.setCategoryId(categoryId);
	}

	/**
	* Returns the sku of this product.
	*
	* @return the sku of this product
	*/
	@Override
	public java.lang.String getSku() {
		return _product.getSku();
	}

	/**
	* Sets the sku of this product.
	*
	* @param sku the sku of this product
	*/
	@Override
	public void setSku(java.lang.String sku) {
		_product.setSku(sku);
	}

	/**
	* Returns the product name of this product.
	*
	* @return the product name of this product
	*/
	@Override
	public java.lang.String getProductName() {
		return _product.getProductName();
	}

	/**
	* Sets the product name of this product.
	*
	* @param productName the product name of this product
	*/
	@Override
	public void setProductName(java.lang.String productName) {
		_product.setProductName(productName);
	}

	/**
	* Returns the description of this product.
	*
	* @return the description of this product
	*/
	@Override
	public java.lang.String getDescription() {
		return _product.getDescription();
	}

	/**
	* Sets the description of this product.
	*
	* @param description the description of this product
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_product.setDescription(description);
	}

	/**
	* Returns the basic cost of this product.
	*
	* @return the basic cost of this product
	*/
	@Override
	public int getBasicCost() {
		return _product.getBasicCost();
	}

	/**
	* Sets the basic cost of this product.
	*
	* @param basicCost the basic cost of this product
	*/
	@Override
	public void setBasicCost(int basicCost) {
		_product.setBasicCost(basicCost);
	}

	/**
	* Returns the shipping cost of this product.
	*
	* @return the shipping cost of this product
	*/
	@Override
	public int getShippingCost() {
		return _product.getShippingCost();
	}

	/**
	* Sets the shipping cost of this product.
	*
	* @param shippingCost the shipping cost of this product
	*/
	@Override
	public void setShippingCost(int shippingCost) {
		_product.setShippingCost(shippingCost);
	}

	/**
	* Returns the total quantity of this product.
	*
	* @return the total quantity of this product
	*/
	@Override
	public int getTotalQuantity() {
		return _product.getTotalQuantity();
	}

	/**
	* Sets the total quantity of this product.
	*
	* @param totalQuantity the total quantity of this product
	*/
	@Override
	public void setTotalQuantity(int totalQuantity) {
		_product.setTotalQuantity(totalQuantity);
	}

	/**
	* Returns the min quantity of this product.
	*
	* @return the min quantity of this product
	*/
	@Override
	public int getMinQuantity() {
		return _product.getMinQuantity();
	}

	/**
	* Sets the min quantity of this product.
	*
	* @param minQuantity the min quantity of this product
	*/
	@Override
	public void setMinQuantity(int minQuantity) {
		_product.setMinQuantity(minQuantity);
	}

	/**
	* Returns the max quantity of this product.
	*
	* @return the max quantity of this product
	*/
	@Override
	public int getMaxQuantity() {
		return _product.getMaxQuantity();
	}

	/**
	* Sets the max quantity of this product.
	*
	* @param maxQuantity the max quantity of this product
	*/
	@Override
	public void setMaxQuantity(int maxQuantity) {
		_product.setMaxQuantity(maxQuantity);
	}

	/**
	* Returns the taxable of this product.
	*
	* @return the taxable of this product
	*/
	@Override
	public java.lang.Boolean getTaxable() {
		return _product.getTaxable();
	}

	/**
	* Sets the taxable of this product.
	*
	* @param taxable the taxable of this product
	*/
	@Override
	public void setTaxable(java.lang.Boolean taxable) {
		_product.setTaxable(taxable);
	}

	/**
	* Returns the stock checking of this product.
	*
	* @return the stock checking of this product
	*/
	@Override
	public java.lang.Boolean getStockChecking() {
		return _product.getStockChecking();
	}

	/**
	* Sets the stock checking of this product.
	*
	* @param stockChecking the stock checking of this product
	*/
	@Override
	public void setStockChecking(java.lang.Boolean stockChecking) {
		_product.setStockChecking(stockChecking);
	}

	/**
	* Returns the discount of this product.
	*
	* @return the discount of this product
	*/
	@Override
	public double getDiscount() {
		return _product.getDiscount();
	}

	/**
	* Sets the discount of this product.
	*
	* @param discount the discount of this product
	*/
	@Override
	public void setDiscount(double discount) {
		_product.setDiscount(discount);
	}

	/**
	* Returns the image ID of this product.
	*
	* @return the image ID of this product
	*/
	@Override
	public long getImageId() {
		return _product.getImageId();
	}

	/**
	* Sets the image ID of this product.
	*
	* @param imageId the image ID of this product
	*/
	@Override
	public void setImageId(long imageId) {
		_product.setImageId(imageId);
	}

	@Override
	public boolean isNew() {
		return _product.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_product.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _product.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_product.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _product.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _product.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_product.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _product.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_product.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_product.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_product.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProductWrapper((Product)_product.clone());
	}

	@Override
	public int compareTo(com.skilltailor.shopping.product.model.Product product) {
		return _product.compareTo(product);
	}

	@Override
	public int hashCode() {
		return _product.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.skilltailor.shopping.product.model.Product> toCacheModel() {
		return _product.toCacheModel();
	}

	@Override
	public com.skilltailor.shopping.product.model.Product toEscapedModel() {
		return new ProductWrapper(_product.toEscapedModel());
	}

	@Override
	public com.skilltailor.shopping.product.model.Product toUnescapedModel() {
		return new ProductWrapper(_product.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _product.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _product.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_product.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductWrapper)) {
			return false;
		}

		ProductWrapper productWrapper = (ProductWrapper)obj;

		if (Validator.equals(_product, productWrapper._product)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Product getWrappedProduct() {
		return _product;
	}

	@Override
	public Product getWrappedModel() {
		return _product;
	}

	@Override
	public void resetOriginalValues() {
		_product.resetOriginalValues();
	}

	private Product _product;
}
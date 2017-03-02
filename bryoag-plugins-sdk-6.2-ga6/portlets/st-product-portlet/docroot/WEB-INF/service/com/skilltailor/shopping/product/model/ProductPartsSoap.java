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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.skilltailor.shopping.product.service.http.ProductPartsServiceSoap}.
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.product.service.http.ProductPartsServiceSoap
 * @generated
 */
public class ProductPartsSoap implements Serializable {
	public static ProductPartsSoap toSoapModel(ProductParts model) {
		ProductPartsSoap soapModel = new ProductPartsSoap();

		soapModel.setPartId(model.getPartId());
		soapModel.setProductId(model.getProductId());
		soapModel.setName(model.getName());
		soapModel.setValues(model.getValues());
		soapModel.setDescription(model.getDescription());
		soapModel.setHasAdditionalCost(model.getHasAdditionalCost());
		soapModel.setAdditionalCost(model.getAdditionalCost());
		soapModel.setIsCommon(model.getIsCommon());
		soapModel.setSequence(model.getSequence());
		soapModel.setTagName(model.getTagName());
		soapModel.setCompatibleTag(model.getCompatibleTag());

		return soapModel;
	}

	public static ProductPartsSoap[] toSoapModels(ProductParts[] models) {
		ProductPartsSoap[] soapModels = new ProductPartsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProductPartsSoap[][] toSoapModels(ProductParts[][] models) {
		ProductPartsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProductPartsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProductPartsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProductPartsSoap[] toSoapModels(List<ProductParts> models) {
		List<ProductPartsSoap> soapModels = new ArrayList<ProductPartsSoap>(models.size());

		for (ProductParts model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProductPartsSoap[soapModels.size()]);
	}

	public ProductPartsSoap() {
	}

	public long getPrimaryKey() {
		return _partId;
	}

	public void setPrimaryKey(long pk) {
		setPartId(pk);
	}

	public long getPartId() {
		return _partId;
	}

	public void setPartId(long partId) {
		_partId = partId;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getValues() {
		return _values;
	}

	public void setValues(String values) {
		_values = values;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Boolean getHasAdditionalCost() {
		return _hasAdditionalCost;
	}

	public void setHasAdditionalCost(Boolean hasAdditionalCost) {
		_hasAdditionalCost = hasAdditionalCost;
	}

	public int getAdditionalCost() {
		return _additionalCost;
	}

	public void setAdditionalCost(int additionalCost) {
		_additionalCost = additionalCost;
	}

	public Boolean getIsCommon() {
		return _isCommon;
	}

	public void setIsCommon(Boolean isCommon) {
		_isCommon = isCommon;
	}

	public int getSequence() {
		return _sequence;
	}

	public void setSequence(int sequence) {
		_sequence = sequence;
	}

	public String getTagName() {
		return _tagName;
	}

	public void setTagName(String tagName) {
		_tagName = tagName;
	}

	public String getCompatibleTag() {
		return _compatibleTag;
	}

	public void setCompatibleTag(String compatibleTag) {
		_compatibleTag = compatibleTag;
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
}
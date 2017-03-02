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

package com.skilltailor.shopping.product.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.skilltailor.shopping.product.NoSuchProductException;
import com.skilltailor.shopping.product.model.Product;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.service.ProductLocalServiceUtil;
import com.skilltailor.shopping.product.service.base.ProductServiceBaseImpl;

import java.io.File;
import java.util.List;

/**
 * The implementation of the product remote service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.skilltailor.shopping.product.service.ProductService} interface.
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based
 * on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author deepakgupta02
 * @see com.skilltailor.shopping.product.service.base.ProductServiceBaseImpl
 * @see com.skilltailor.shopping.product.service.ProductServiceUtil
 */
public class ProductServiceImpl extends ProductServiceBaseImpl {

	public Product addproduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.addProduct(product);
	}

	public Product createproduct(long productId) {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.createProduct(productId);
	}

	public Product deleteProduct(long productId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.deleteProduct(productId);
	}

	public Product deleteproduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.deleteProduct(product);
	}

	public int getProductsCount() throws SystemException {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.getProductsCount();
	}

	public Product updateproduct(Product product) throws SystemException {
		// TODO Auto-generated method stub
		return ProductLocalServiceUtil.updateProduct(product);
	}

	public List<Product> findByGroupId(long groupId) throws SystemException {
		return ProductLocalServiceUtil.findByGroupId(groupId);
	}

	public List<Product> findByCategory(long categoryId) throws SystemException {
		return ProductLocalServiceUtil.findByCategory(categoryId);
	}

	public List<Product> findByC_G(long companyId, long groupId) throws SystemException {
		return ProductLocalServiceUtil.findByC_G(companyId, groupId);
	}

	public Product findByProductId(long productId) throws SystemException, NoSuchProductException {
		return ProductLocalServiceUtil.findByProductId(productId);
	}

	public Product addProduct(long userId, long groupId, long categoryId, String sku, String name, String description,
			int stockQuantity, File smallImageFile, File mediumImageFile, File largeImageFile, long smallImageSize,
			long mediumImageSize, long largeImageSize, List<ProductParts> itemFields, double discount, int basiccost,
			int shippingcost, int totalQuantity, boolean stockchecking, int minQuantity, int maxQuantity,
			boolean istaxable, ServiceContext serviceContext) throws PortalException, SystemException {

		return ProductLocalServiceUtil.addProduct(userId, groupId, categoryId, sku, name, description, stockQuantity,
				smallImageFile, mediumImageFile, largeImageFile, smallImageSize, mediumImageSize, largeImageSize,
				itemFields, discount, basiccost, shippingcost, totalQuantity, stockchecking, minQuantity, maxQuantity,
				istaxable, serviceContext);

	}

}

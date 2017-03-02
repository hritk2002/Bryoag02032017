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

package com.skilltailor.shopping.product.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductLocalService}.
 *
 * @author deepakgupta02
 * @see ProductLocalService
 * @generated
 */
public class ProductLocalServiceWrapper implements ProductLocalService,
	ServiceWrapper<ProductLocalService> {
	public ProductLocalServiceWrapper(ProductLocalService productLocalService) {
		_productLocalService = productLocalService;
	}

	/**
	* Adds the product to the database. Also notifies the appropriate model listeners.
	*
	* @param product the product
	* @return the product that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product addProduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.addProduct(product);
	}

	/**
	* Creates a new product with the primary key. Does not add the product to the database.
	*
	* @param productId the primary key for the new product
	* @return the new product
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product createProduct(
		long productId) {
		return _productLocalService.createProduct(productId);
	}

	/**
	* Deletes the product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param productId the primary key of the product
	* @return the product that was removed
	* @throws PortalException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product deleteProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.deleteProduct(productId);
	}

	/**
	* Deletes the product from the database. Also notifies the appropriate model listeners.
	*
	* @param product the product
	* @return the product that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product deleteProduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.deleteProduct(product);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product fetchProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.fetchProduct(productId);
	}

	/**
	* Returns the product with the primary key.
	*
	* @param productId the primary key of the product
	* @return the product
	* @throws PortalException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product getProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.getProduct(productId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of products
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> getProducts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.getProducts(start, end);
	}

	/**
	* Returns the number of products.
	*
	* @return the number of products
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.getProductsCount();
	}

	/**
	* Updates the product in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param product the product
	* @return the product that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.skilltailor.shopping.product.model.Product updateProduct(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.updateProduct(product);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _productLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_productLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _productLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product addProduct(
		long userId, long groupId, long categoryId, java.lang.String sku,
		java.lang.String name, java.lang.String description, int stockQuantity,
		java.io.File smallImageFile, java.io.File mediumImageFile,
		java.io.File largeImageFile, long smallImageSize, long mediumImageSize,
		long largeImageSize,
		java.util.List<com.skilltailor.shopping.product.model.ProductParts> itemFields,
		double discount, int basiccost, int shippingcost, int totalQuantity,
		boolean stockchecking, int minQuantity, int maxQuantity,
		boolean isTaxable,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.addProduct(userId, groupId, categoryId,
			sku, name, description, stockQuantity, smallImageFile,
			mediumImageFile, largeImageFile, smallImageSize, mediumImageSize,
			largeImageSize, itemFields, discount, basiccost, shippingcost,
			totalQuantity, stockchecking, minQuantity, maxQuantity, isTaxable,
			serviceContext);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product createProduct()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.createProduct();
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.findByGroupId(groupId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.findByCategory(categoryId);
	}

	@Override
	public java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.findByC_G(companyId, groupId);
	}

	@Override
	public com.skilltailor.shopping.product.model.Product findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return _productLocalService.findByProductId(productId);
	}

	@Override
	public com.bryoag.shopping.image.model.Image updateImage(
		com.bryoag.shopping.image.model.Image image,
		com.skilltailor.shopping.product.model.Product product,
		com.liferay.portal.service.ServiceContext serviceContext,
		java.io.File smallImageFile, java.io.File mediumImageFile,
		java.io.File largeImageFile, java.lang.String cmd)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		return _productLocalService.updateImage(image, product, serviceContext,
			smallImageFile, mediumImageFile, largeImageFile, cmd);
	}

	@Override
	public void uploadImage(javax.portlet.PortletRequest actionRequest,
		com.liferay.portal.kernel.upload.UploadPortletRequest aUploadrequest,
		java.lang.String foldername, java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_productLocalService.uploadImage(actionRequest, aUploadrequest,
			foldername, imageName);
	}

	@Override
	public void updateImage(javax.portlet.PortletRequest actionRequest,
		com.liferay.portal.kernel.upload.UploadPortletRequest aUploadrequest,
		java.lang.String foldername, java.lang.String imageName,
		java.lang.String cmd)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException {
		_productLocalService.updateImage(actionRequest, aUploadrequest,
			foldername, imageName, cmd);
	}

	@Override
	public java.lang.String createPath(
		com.skilltailor.shopping.product.model.Product product,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _productLocalService.createPath(product, fileName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProductLocalService getWrappedProductLocalService() {
		return _productLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProductLocalService(
		ProductLocalService productLocalService) {
		_productLocalService = productLocalService;
	}

	@Override
	public ProductLocalService getWrappedService() {
		return _productLocalService;
	}

	@Override
	public void setWrappedService(ProductLocalService productLocalService) {
		_productLocalService = productLocalService;
	}

	private ProductLocalService _productLocalService;
}
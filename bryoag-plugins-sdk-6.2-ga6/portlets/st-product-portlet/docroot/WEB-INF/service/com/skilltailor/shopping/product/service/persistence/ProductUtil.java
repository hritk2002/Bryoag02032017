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

package com.skilltailor.shopping.product.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.skilltailor.shopping.product.model.Product;

import java.util.List;

/**
 * The persistence utility for the product service. This utility wraps {@link ProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see ProductPersistence
 * @see ProductPersistenceImpl
 * @generated
 */
public class ProductUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Product product) {
		getPersistence().clearCache(product);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Product> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Product update(Product product) throws SystemException {
		return getPersistence().update(product);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Product update(Product product, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(product, serviceContext);
	}

	/**
	* Returns all the products where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the products where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the products where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where groupId = &#63;.
	*
	* @param productId the primary key of the current product
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product[] findByGroupId_PrevAndNext(
		long productId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(productId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the products where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of products where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the products where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategory(categoryId);
	}

	/**
	* Returns a range of all the products where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategory(categoryId, start, end);
	}

	/**
	* Returns an ordered range of all the products where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByCategory(
		long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCategory(categoryId, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByCategory_First(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByCategory_First(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByCategory_Last(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByCategory_Last(
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where categoryId = &#63;.
	*
	* @param productId the primary key of the current product
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product[] findByCategory_PrevAndNext(
		long productId, long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByCategory_PrevAndNext(productId, categoryId,
			orderByComparator);
	}

	/**
	* Removes all the products where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCategory(categoryId);
	}

	/**
	* Returns the number of products where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategory(categoryId);
	}

	/**
	* Returns the product where productId = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductException} if it could not be found.
	*
	* @param productId the product ID
	* @return the matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findByProductId(productId);
	}

	/**
	* Returns the product where productId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productId the product ID
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByProductId(productId);
	}

	/**
	* Returns the product where productId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productId the product ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByProductId(
		long productId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByProductId(productId, retrieveFromCache);
	}

	/**
	* Removes the product where productId = &#63; from the database.
	*
	* @param productId the product ID
	* @return the product that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product removeByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().removeByProductId(productId);
	}

	/**
	* Returns the number of products where productId = &#63;.
	*
	* @param productId the product ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductId(long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductId(productId);
	}

	/**
	* Returns the product where sku = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductException} if it could not be found.
	*
	* @param sku the sku
	* @return the matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findBysku(
		java.lang.String sku)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findBysku(sku);
	}

	/**
	* Returns the product where sku = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param sku the sku
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchBysku(
		java.lang.String sku)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysku(sku);
	}

	/**
	* Returns the product where sku = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param sku the sku
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchBysku(
		java.lang.String sku, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBysku(sku, retrieveFromCache);
	}

	/**
	* Removes the product where sku = &#63; from the database.
	*
	* @param sku the sku
	* @return the product that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product removeBysku(
		java.lang.String sku)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().removeBysku(sku);
	}

	/**
	* Returns the number of products where sku = &#63;.
	*
	* @param sku the sku
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countBysku(java.lang.String sku)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBysku(sku);
	}

	/**
	* Returns the product where sku = &#63; and companyId = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductException} if it could not be found.
	*
	* @param sku the sku
	* @param companyId the company ID
	* @return the matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByCompanySku(
		java.lang.String sku, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findByCompanySku(sku, companyId);
	}

	/**
	* Returns the product where sku = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param sku the sku
	* @param companyId the company ID
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByCompanySku(
		java.lang.String sku, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCompanySku(sku, companyId);
	}

	/**
	* Returns the product where sku = &#63; and companyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param sku the sku
	* @param companyId the company ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByCompanySku(
		java.lang.String sku, long companyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanySku(sku, companyId, retrieveFromCache);
	}

	/**
	* Removes the product where sku = &#63; and companyId = &#63; from the database.
	*
	* @param sku the sku
	* @param companyId the company ID
	* @return the product that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product removeByCompanySku(
		java.lang.String sku, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().removeByCompanySku(sku, companyId);
	}

	/**
	* Returns the number of products where sku = &#63; and companyId = &#63;.
	*
	* @param sku the sku
	* @param companyId the company ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanySku(java.lang.String sku, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanySku(sku, companyId);
	}

	/**
	* Returns all the products where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the products where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the products where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param productId the primary key of the current product
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product[] findByC_G_PrevAndNext(
		long productId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findByC_G_PrevAndNext(productId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the products where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of products where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the products where discount = &#63;.
	*
	* @param discount the discount
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findBydiscount(
		double discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydiscount(discount);
	}

	/**
	* Returns a range of all the products where discount = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param discount the discount
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findBydiscount(
		double discount, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydiscount(discount, start, end);
	}

	/**
	* Returns an ordered range of all the products where discount = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param discount the discount
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findBydiscount(
		double discount, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydiscount(discount, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where discount = &#63;.
	*
	* @param discount the discount
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findBydiscount_First(
		double discount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findBydiscount_First(discount, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where discount = &#63;.
	*
	* @param discount the discount
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchBydiscount_First(
		double discount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydiscount_First(discount, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where discount = &#63;.
	*
	* @param discount the discount
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findBydiscount_Last(
		double discount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findBydiscount_Last(discount, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where discount = &#63;.
	*
	* @param discount the discount
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchBydiscount_Last(
		double discount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydiscount_Last(discount, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where discount = &#63;.
	*
	* @param productId the primary key of the current product
	* @param discount the discount
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product[] findBydiscount_PrevAndNext(
		long productId, double discount,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence()
				   .findBydiscount_PrevAndNext(productId, discount,
			orderByComparator);
	}

	/**
	* Removes all the products where discount = &#63; from the database.
	*
	* @param discount the discount
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydiscount(double discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydiscount(discount);
	}

	/**
	* Returns the number of products where discount = &#63;.
	*
	* @param discount the discount
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydiscount(double discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydiscount(discount);
	}

	/**
	* Caches the product in the entity cache if it is enabled.
	*
	* @param product the product
	*/
	public static void cacheResult(
		com.skilltailor.shopping.product.model.Product product) {
		getPersistence().cacheResult(product);
	}

	/**
	* Caches the products in the entity cache if it is enabled.
	*
	* @param products the products
	*/
	public static void cacheResult(
		java.util.List<com.skilltailor.shopping.product.model.Product> products) {
		getPersistence().cacheResult(products);
	}

	/**
	* Creates a new product with the primary key. Does not add the product to the database.
	*
	* @param productId the primary key for the new product
	* @return the new product
	*/
	public static com.skilltailor.shopping.product.model.Product create(
		long productId) {
		return getPersistence().create(productId);
	}

	/**
	* Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param productId the primary key of the product
	* @return the product that was removed
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product remove(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().remove(productId);
	}

	public static com.skilltailor.shopping.product.model.Product updateImpl(
		com.skilltailor.shopping.product.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(product);
	}

	/**
	* Returns the product with the primary key or throws a {@link com.skilltailor.shopping.product.NoSuchProductException} if it could not be found.
	*
	* @param productId the primary key of the product
	* @return the product
	* @throws com.skilltailor.shopping.product.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product findByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductException {
		return getPersistence().findByPrimaryKey(productId);
	}

	/**
	* Returns the product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param productId the primary key of the product
	* @return the product, or <code>null</code> if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.Product fetchByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(productId);
	}

	/**
	* Returns all the products.
	*
	* @return the products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.Product> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of products.
	*
	* @return the number of products
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProductPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProductPersistence)PortletBeanLocatorUtil.locate(com.skilltailor.shopping.product.service.ClpSerializer.getServletContextName(),
					ProductPersistence.class.getName());

			ReferenceRegistry.registerReference(ProductUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProductPersistence persistence) {
	}

	private static ProductPersistence _persistence;
}
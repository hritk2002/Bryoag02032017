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

import com.skilltailor.shopping.product.model.ProductParts;

import java.util.List;

/**
 * The persistence utility for the product parts service. This utility wraps {@link ProductPartsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see ProductPartsPersistence
 * @see ProductPartsPersistenceImpl
 * @generated
 */
public class ProductPartsUtil {
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
	public static void clearCache(ProductParts productParts) {
		getPersistence().clearCache(productParts);
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
	public static List<ProductParts> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductParts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductParts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ProductParts update(ProductParts productParts)
		throws SystemException {
		return getPersistence().update(productParts);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ProductParts update(ProductParts productParts,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(productParts, serviceContext);
	}

	/**
	* Returns all the product partses where productId = &#63;.
	*
	* @param productId the product ID
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductId(productId);
	}

	/**
	* Returns a range of all the product partses where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductId(productId, start, end);
	}

	/**
	* Returns an ordered range of all the product partses where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductId(
		long productId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductId(productId, start, end, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductId_First(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductId_First(productId, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductId_First(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductId_First(productId, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductId_Last(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductId_Last(productId, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductId_Last(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductId_Last(productId, orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where productId = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByProductId_PrevAndNext(
		long partId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductId_PrevAndNext(partId, productId,
			orderByComparator);
	}

	/**
	* Removes all the product partses where productId = &#63; from the database.
	*
	* @param productId the product ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductId(long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByProductId(productId);
	}

	/**
	* Returns the number of product partses where productId = &#63;.
	*
	* @param productId the product ID
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductId(long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductId(productId);
	}

	/**
	* Returns all the product partses where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCompatibility(productId, compatibleTag);
	}

	/**
	* Returns a range of all the product partses where productId = &#63; and compatibleTag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibleTag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCompatibility(productId, compatibleTag, start,
			end);
	}

	/**
	* Returns an ordered range of all the product partses where productId = &#63; and compatibleTag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByProductCompatibility(
		long productId, java.lang.String compatibleTag, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCompatibility(productId, compatibleTag, start,
			end, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductCompatibility_First(
		long productId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductCompatibility_First(productId, compatibleTag,
			orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductCompatibility_First(
		long productId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCompatibility_First(productId, compatibleTag,
			orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductCompatibility_Last(
		long productId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductCompatibility_Last(productId, compatibleTag,
			orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductCompatibility_Last(
		long productId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCompatibility_Last(productId, compatibleTag,
			orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByProductCompatibility_PrevAndNext(
		long partId, long productId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByProductCompatibility_PrevAndNext(partId, productId,
			compatibleTag, orderByComparator);
	}

	/**
	* Removes all the product partses where productId = &#63; and compatibleTag = &#63; from the database.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductCompatibility(long productId,
		java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByProductCompatibility(productId, compatibleTag);
	}

	/**
	* Returns the number of product partses where productId = &#63; and compatibleTag = &#63;.
	*
	* @param productId the product ID
	* @param compatibleTag the compatible tag
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductCompatibility(long productId,
		java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductCompatibility(productId, compatibleTag);
	}

	/**
	* Returns the product parts where productId = &#63; and tagName = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	*
	* @param productId the product ID
	* @param tagName the tag name
	* @return the matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductTag(
		long productId, java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByProductTag(productId, tagName);
	}

	/**
	* Returns the product parts where productId = &#63; and tagName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productId the product ID
	* @param tagName the tag name
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductTag(
		long productId, java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByProductTag(productId, tagName);
	}

	/**
	* Returns the product parts where productId = &#63; and tagName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productId the product ID
	* @param tagName the tag name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductTag(
		long productId, java.lang.String tagName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductTag(productId, tagName, retrieveFromCache);
	}

	/**
	* Removes the product parts where productId = &#63; and tagName = &#63; from the database.
	*
	* @param productId the product ID
	* @param tagName the tag name
	* @return the product parts that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts removeByProductTag(
		long productId, java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().removeByProductTag(productId, tagName);
	}

	/**
	* Returns the number of product partses where productId = &#63; and tagName = &#63;.
	*
	* @param productId the product ID
	* @param tagName the tag name
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductTag(long productId, java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductTag(productId, tagName);
	}

	/**
	* Returns the product parts where productId = &#63; and name = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	*
	* @param productId the product ID
	* @param name the name
	* @return the matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByProductName(productId, name);
	}

	/**
	* Returns the product parts where productId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productId the product ID
	* @param name the name
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByProductName(productId, name);
	}

	/**
	* Returns the product parts where productId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productId the product ID
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByProductName(
		long productId, java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductName(productId, name, retrieveFromCache);
	}

	/**
	* Removes the product parts where productId = &#63; and name = &#63; from the database.
	*
	* @param productId the product ID
	* @param name the name
	* @return the product parts that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts removeByProductName(
		long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().removeByProductName(productId, name);
	}

	/**
	* Returns the number of product partses where productId = &#63; and name = &#63;.
	*
	* @param productId the product ID
	* @param name the name
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductName(long productId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductName(productId, name);
	}

	/**
	* Returns all the product partses where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCommon(
		java.lang.Boolean isCommon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommon(isCommon);
	}

	/**
	* Returns a range of all the product partses where isCommon = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isCommon the is common
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCommon(
		java.lang.Boolean isCommon, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCommon(isCommon, start, end);
	}

	/**
	* Returns an ordered range of all the product partses where isCommon = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isCommon the is common
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCommon(
		java.lang.Boolean isCommon, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCommon(isCommon, start, end, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByCommon_First(
		java.lang.Boolean isCommon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByCommon_First(isCommon, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByCommon_First(
		java.lang.Boolean isCommon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCommon_First(isCommon, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByCommon_Last(
		java.lang.Boolean isCommon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByCommon_Last(isCommon, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByCommon_Last(
		java.lang.Boolean isCommon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCommon_Last(isCommon, orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where isCommon = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param isCommon the is common
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByCommon_PrevAndNext(
		long partId, java.lang.Boolean isCommon,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByCommon_PrevAndNext(partId, isCommon, orderByComparator);
	}

	/**
	* Removes all the product partses where isCommon = &#63; from the database.
	*
	* @param isCommon the is common
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCommon(java.lang.Boolean isCommon)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCommon(isCommon);
	}

	/**
	* Returns the number of product partses where isCommon = &#63;.
	*
	* @param isCommon the is common
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCommon(java.lang.Boolean isCommon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCommon(isCommon);
	}

	/**
	* Returns all the product partses where name = &#63;.
	*
	* @param name the name
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the product partses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the product partses where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where name = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByName_PrevAndNext(
		long partId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByName_PrevAndNext(partId, name, orderByComparator);
	}

	/**
	* Removes all the product partses where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of product partses where name = &#63;.
	*
	* @param name the name
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Returns all the product partses where tagName = &#63;.
	*
	* @param tagName the tag name
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagName(tagName);
	}

	/**
	* Returns a range of all the product partses where tagName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagName the tag name
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagName(tagName, start, end);
	}

	/**
	* Returns an ordered range of all the product partses where tagName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagName the tag name
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByTagName(
		java.lang.String tagName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTagName(tagName, start, end, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where tagName = &#63;.
	*
	* @param tagName the tag name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByTagName_First(
		java.lang.String tagName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByTagName_First(tagName, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where tagName = &#63;.
	*
	* @param tagName the tag name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByTagName_First(
		java.lang.String tagName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagName_First(tagName, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where tagName = &#63;.
	*
	* @param tagName the tag name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByTagName_Last(
		java.lang.String tagName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByTagName_Last(tagName, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where tagName = &#63;.
	*
	* @param tagName the tag name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByTagName_Last(
		java.lang.String tagName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagName_Last(tagName, orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where tagName = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param tagName the tag name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByTagName_PrevAndNext(
		long partId, java.lang.String tagName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByTagName_PrevAndNext(partId, tagName, orderByComparator);
	}

	/**
	* Removes all the product partses where tagName = &#63; from the database.
	*
	* @param tagName the tag name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTagName(java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTagName(tagName);
	}

	/**
	* Returns the number of product partses where tagName = &#63;.
	*
	* @param tagName the tag name
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTagName(java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTagName(tagName);
	}

	/**
	* Returns all the product partses where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @return the matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompatibleTag(compatibleTag);
	}

	/**
	* Returns a range of all the product partses where compatibleTag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compatibleTag the compatible tag
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibleTag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompatibleTag(compatibleTag, start, end);
	}

	/**
	* Returns an ordered range of all the product partses where compatibleTag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compatibleTag the compatible tag
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findByCompatibleTag(
		java.lang.String compatibleTag, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompatibleTag(compatibleTag, start, end,
			orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByCompatibleTag_First(
		java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByCompatibleTag_First(compatibleTag, orderByComparator);
	}

	/**
	* Returns the first product parts in the ordered set where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByCompatibleTag_First(
		java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompatibleTag_First(compatibleTag, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByCompatibleTag_Last(
		java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByCompatibleTag_Last(compatibleTag, orderByComparator);
	}

	/**
	* Returns the last product parts in the ordered set where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByCompatibleTag_Last(
		java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompatibleTag_Last(compatibleTag, orderByComparator);
	}

	/**
	* Returns the product partses before and after the current product parts in the ordered set where compatibleTag = &#63;.
	*
	* @param partId the primary key of the current product parts
	* @param compatibleTag the compatible tag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts[] findByCompatibleTag_PrevAndNext(
		long partId, java.lang.String compatibleTag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence()
				   .findByCompatibleTag_PrevAndNext(partId, compatibleTag,
			orderByComparator);
	}

	/**
	* Removes all the product partses where compatibleTag = &#63; from the database.
	*
	* @param compatibleTag the compatible tag
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompatibleTag(java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompatibleTag(compatibleTag);
	}

	/**
	* Returns the number of product partses where compatibleTag = &#63;.
	*
	* @param compatibleTag the compatible tag
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompatibleTag(java.lang.String compatibleTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompatibleTag(compatibleTag);
	}

	/**
	* Returns the product parts where partId = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	*
	* @param partId the part ID
	* @return the matching product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByPartId(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByPartId(partId);
	}

	/**
	* Returns the product parts where partId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param partId the part ID
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByPartId(
		long partId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPartId(partId);
	}

	/**
	* Returns the product parts where partId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param partId the part ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByPartId(
		long partId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPartId(partId, retrieveFromCache);
	}

	/**
	* Removes the product parts where partId = &#63; from the database.
	*
	* @param partId the part ID
	* @return the product parts that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts removeByPartId(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().removeByPartId(partId);
	}

	/**
	* Returns the number of product partses where partId = &#63;.
	*
	* @param partId the part ID
	* @return the number of matching product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPartId(long partId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPartId(partId);
	}

	/**
	* Caches the product parts in the entity cache if it is enabled.
	*
	* @param productParts the product parts
	*/
	public static void cacheResult(
		com.skilltailor.shopping.product.model.ProductParts productParts) {
		getPersistence().cacheResult(productParts);
	}

	/**
	* Caches the product partses in the entity cache if it is enabled.
	*
	* @param productPartses the product partses
	*/
	public static void cacheResult(
		java.util.List<com.skilltailor.shopping.product.model.ProductParts> productPartses) {
		getPersistence().cacheResult(productPartses);
	}

	/**
	* Creates a new product parts with the primary key. Does not add the product parts to the database.
	*
	* @param partId the primary key for the new product parts
	* @return the new product parts
	*/
	public static com.skilltailor.shopping.product.model.ProductParts create(
		long partId) {
		return getPersistence().create(partId);
	}

	/**
	* Removes the product parts with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param partId the primary key of the product parts
	* @return the product parts that was removed
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts remove(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().remove(partId);
	}

	public static com.skilltailor.shopping.product.model.ProductParts updateImpl(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(productParts);
	}

	/**
	* Returns the product parts with the primary key or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	*
	* @param partId the primary key of the product parts
	* @return the product parts
	* @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts findByPrimaryKey(
		long partId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.product.NoSuchProductPartsException {
		return getPersistence().findByPrimaryKey(partId);
	}

	/**
	* Returns the product parts with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param partId the primary key of the product parts
	* @return the product parts, or <code>null</code> if a product parts with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.product.model.ProductParts fetchByPrimaryKey(
		long partId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(partId);
	}

	/**
	* Returns all the product partses.
	*
	* @return the product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the product partses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @return the range of product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the product partses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of product partses
	* @param end the upper bound of the range of product partses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of product partses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.product.model.ProductParts> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the product partses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of product partses.
	*
	* @return the number of product partses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProductPartsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProductPartsPersistence)PortletBeanLocatorUtil.locate(com.skilltailor.shopping.product.service.ClpSerializer.getServletContextName(),
					ProductPartsPersistence.class.getName());

			ReferenceRegistry.registerReference(ProductPartsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProductPartsPersistence persistence) {
	}

	private static ProductPartsPersistence _persistence;
}
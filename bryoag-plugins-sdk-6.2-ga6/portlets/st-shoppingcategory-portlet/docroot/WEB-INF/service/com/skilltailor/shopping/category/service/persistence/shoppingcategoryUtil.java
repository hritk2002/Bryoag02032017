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

package com.skilltailor.shopping.category.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.skilltailor.shopping.category.model.shoppingcategory;

import java.util.List;

/**
 * The persistence utility for the shoppingcategory service. This utility wraps {@link shoppingcategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see shoppingcategoryPersistence
 * @see shoppingcategoryPersistenceImpl
 * @generated
 */
public class shoppingcategoryUtil {
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
	public static void clearCache(shoppingcategory shoppingcategory) {
		getPersistence().clearCache(shoppingcategory);
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
	public static List<shoppingcategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<shoppingcategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<shoppingcategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static shoppingcategory update(shoppingcategory shoppingcategory)
		throws SystemException {
		return getPersistence().update(shoppingcategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static shoppingcategory update(shoppingcategory shoppingcategory,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(shoppingcategory, serviceContext);
	}

	/**
	* Returns all the shoppingcategories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the shoppingcategories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @return the range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the shoppingcategories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the shoppingcategories before and after the current shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param categoryId the primary key of the current shoppingcategory
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory[] findByGroupId_PrevAndNext(
		long categoryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(categoryId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the shoppingcategories where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of shoppingcategories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the shoppingcategory where categoryId = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param categoryId the category ID
	* @return the matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().findByCategoryId(categoryId);
	}

	/**
	* Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param categoryId the category ID
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategoryId(categoryId);
	}

	/**
	* Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param categoryId the category ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryId(
		long categoryId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategoryId(categoryId, retrieveFromCache);
	}

	/**
	* Removes the shoppingcategory where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @return the shoppingcategory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory removeByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().removeByCategoryId(categoryId);
	}

	/**
	* Returns the number of shoppingcategories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategoryId(categoryId);
	}

	/**
	* Returns all the shoppingcategories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByComapnyId(companyId);
	}

	/**
	* Returns a range of all the shoppingcategories where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @return the range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByComapnyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the shoppingcategories where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByComapnyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByComapnyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByComapnyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByComapnyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByComapnyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByComapnyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByComapnyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByComapnyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByComapnyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the shoppingcategories before and after the current shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param categoryId the primary key of the current shoppingcategory
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory[] findByComapnyId_PrevAndNext(
		long categoryId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByComapnyId_PrevAndNext(categoryId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the shoppingcategories where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByComapnyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByComapnyId(companyId);
	}

	/**
	* Returns the number of shoppingcategories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByComapnyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByComapnyId(companyId);
	}

	/**
	* Returns all the shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @return the range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the shoppingcategories before and after the current shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param categoryId the primary key of the current shoppingcategory
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory[] findByC_G_PrevAndNext(
		long categoryId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence()
				   .findByC_G_PrevAndNext(categoryId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the shoppingcategories where companyId = &#63; and groupId = &#63; from the database.
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
	* Returns the number of shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns the shoppingcategory where name = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param name the name
	* @return the matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().findByCategoryName(name);
	}

	/**
	* Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategoryName(name);
	}

	/**
	* Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryName(
		java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategoryName(name, retrieveFromCache);
	}

	/**
	* Removes the shoppingcategory where name = &#63; from the database.
	*
	* @param name the name
	* @return the shoppingcategory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory removeByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().removeByCategoryName(name);
	}

	/**
	* Returns the number of shoppingcategories where name = &#63;.
	*
	* @param name the name
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategoryName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategoryName(name);
	}

	/**
	* Caches the shoppingcategory in the entity cache if it is enabled.
	*
	* @param shoppingcategory the shoppingcategory
	*/
	public static void cacheResult(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory) {
		getPersistence().cacheResult(shoppingcategory);
	}

	/**
	* Caches the shoppingcategories in the entity cache if it is enabled.
	*
	* @param shoppingcategories the shoppingcategories
	*/
	public static void cacheResult(
		java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> shoppingcategories) {
		getPersistence().cacheResult(shoppingcategories);
	}

	/**
	* Creates a new shoppingcategory with the primary key. Does not add the shoppingcategory to the database.
	*
	* @param categoryId the primary key for the new shoppingcategory
	* @return the new shoppingcategory
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory create(
		long categoryId) {
		return getPersistence().create(categoryId);
	}

	/**
	* Removes the shoppingcategory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory that was removed
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory remove(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().remove(categoryId);
	}

	public static com.skilltailor.shopping.category.model.shoppingcategory updateImpl(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(shoppingcategory);
	}

	/**
	* Returns the shoppingcategory with the primary key or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory findByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException {
		return getPersistence().findByPrimaryKey(categoryId);
	}

	/**
	* Returns the shoppingcategory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory, or <code>null</code> if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.skilltailor.shopping.category.model.shoppingcategory fetchByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoryId);
	}

	/**
	* Returns all the shoppingcategories.
	*
	* @return the shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the shoppingcategories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @return the range of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the shoppingcategories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shoppingcategories
	* @param end the upper bound of the range of shoppingcategories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the shoppingcategories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shoppingcategories.
	*
	* @return the number of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static shoppingcategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (shoppingcategoryPersistence)PortletBeanLocatorUtil.locate(com.skilltailor.shopping.category.service.ClpSerializer.getServletContextName(),
					shoppingcategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(shoppingcategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(shoppingcategoryPersistence persistence) {
	}

	private static shoppingcategoryPersistence _persistence;
}
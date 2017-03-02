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

import com.liferay.portal.service.persistence.BasePersistence;

import com.skilltailor.shopping.category.model.shoppingcategory;

/**
 * The persistence interface for the shoppingcategory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see shoppingcategoryPersistenceImpl
 * @see shoppingcategoryUtil
 * @generated
 */
public interface shoppingcategoryPersistence extends BasePersistence<shoppingcategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link shoppingcategoryUtil} to access the shoppingcategory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the shoppingcategories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the last shoppingcategory in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.skilltailor.shopping.category.model.shoppingcategory[] findByGroupId_PrevAndNext(
		long categoryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Removes all the shoppingcategories where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shoppingcategories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcategory where categoryId = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param categoryId the category ID
	* @return the matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param categoryId the category ID
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param categoryId the category ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryId(
		long categoryId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the shoppingcategory where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @return the shoppingcategory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory removeByCategoryId(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the number of shoppingcategories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the shoppingcategories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByComapnyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByComapnyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByComapnyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByComapnyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByComapnyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.skilltailor.shopping.category.model.shoppingcategory[] findByComapnyId_PrevAndNext(
		long categoryId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Removes all the shoppingcategories where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByComapnyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shoppingcategories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countByComapnyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.skilltailor.shopping.category.model.shoppingcategory findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the first shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.skilltailor.shopping.category.model.shoppingcategory findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the last shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.skilltailor.shopping.category.model.shoppingcategory[] findByC_G_PrevAndNext(
		long categoryId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Removes all the shoppingcategories where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shoppingcategories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcategory where name = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param name the name
	* @return the matching shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByCategoryName(
		java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the shoppingcategory where name = &#63; from the database.
	*
	* @param name the name
	* @return the shoppingcategory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory removeByCategoryName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the number of shoppingcategories where name = &#63;.
	*
	* @param name the name
	* @return the number of matching shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategoryName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the shoppingcategory in the entity cache if it is enabled.
	*
	* @param shoppingcategory the shoppingcategory
	*/
	public void cacheResult(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory);

	/**
	* Caches the shoppingcategories in the entity cache if it is enabled.
	*
	* @param shoppingcategories the shoppingcategories
	*/
	public void cacheResult(
		java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> shoppingcategories);

	/**
	* Creates a new shoppingcategory with the primary key. Does not add the shoppingcategory to the database.
	*
	* @param categoryId the primary key for the new shoppingcategory
	* @return the new shoppingcategory
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory create(
		long categoryId);

	/**
	* Removes the shoppingcategory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory that was removed
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory remove(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	public com.skilltailor.shopping.category.model.shoppingcategory updateImpl(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcategory with the primary key or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory
	* @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory findByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.skilltailor.shopping.category.NoSuchshoppingcategoryException;

	/**
	* Returns the shoppingcategory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the shoppingcategory
	* @return the shoppingcategory, or <code>null</code> if a shoppingcategory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.skilltailor.shopping.category.model.shoppingcategory fetchByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the shoppingcategories.
	*
	* @return the shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.skilltailor.shopping.category.model.shoppingcategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the shoppingcategories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shoppingcategories.
	*
	* @return the number of shoppingcategories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
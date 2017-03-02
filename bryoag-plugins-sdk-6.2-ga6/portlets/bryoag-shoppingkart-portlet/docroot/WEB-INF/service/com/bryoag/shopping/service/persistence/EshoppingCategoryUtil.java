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

package com.bryoag.shopping.service.persistence;

import com.bryoag.shopping.model.EshoppingCategory;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the eshopping category service. This utility wraps {@link EshoppingCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see EshoppingCategoryPersistence
 * @see EshoppingCategoryPersistenceImpl
 * @generated
 */
public class EshoppingCategoryUtil {
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
	public static void clearCache(EshoppingCategory eshoppingCategory) {
		getPersistence().clearCache(eshoppingCategory);
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
	public static List<EshoppingCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EshoppingCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EshoppingCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EshoppingCategory update(EshoppingCategory eshoppingCategory)
		throws SystemException {
		return getPersistence().update(eshoppingCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EshoppingCategory update(
		EshoppingCategory eshoppingCategory, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(eshoppingCategory, serviceContext);
	}

	/**
	* Returns all the eshopping categories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByCompanyId(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, groupId);
	}

	/**
	* Returns a range of all the eshopping categories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @return the range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByCompanyId(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the eshopping categories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByCompanyId(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByCompanyId_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByCompanyId_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByCompanyId_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByCompanyId_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the eshopping categories before and after the current eshopping category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param categoryId the primary key of the current eshopping category
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory[] findByCompanyId_PrevAndNext(
		long categoryId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(categoryId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the eshopping categories where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId, groupId);
	}

	/**
	* Returns the number of eshopping categories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId, groupId);
	}

	/**
	* Returns the eshopping category where categoryId = &#63; and groupId = &#63; or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	*
	* @param categoryId the category ID
	* @param groupId the group ID
	* @return the matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findBycategoryId(
		long categoryId, long groupId)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycategoryId(categoryId, groupId);
	}

	/**
	* Returns the eshopping category where categoryId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param categoryId the category ID
	* @param groupId the group ID
	* @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchBycategoryId(
		long categoryId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBycategoryId(categoryId, groupId);
	}

	/**
	* Returns the eshopping category where categoryId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param categoryId the category ID
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchBycategoryId(
		long categoryId, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycategoryId(categoryId, groupId, retrieveFromCache);
	}

	/**
	* Removes the eshopping category where categoryId = &#63; and groupId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @param groupId the group ID
	* @return the eshopping category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory removeBycategoryId(
		long categoryId, long groupId)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBycategoryId(categoryId, groupId);
	}

	/**
	* Returns the number of eshopping categories where categoryId = &#63; and groupId = &#63;.
	*
	* @param categoryId the category ID
	* @param groupId the group ID
	* @return the number of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycategoryId(long categoryId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycategoryId(categoryId, groupId);
	}

	/**
	* Returns all the eshopping categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the eshopping categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @return the range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the eshopping categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the eshopping categories before and after the current eshopping category in the ordered set where groupId = &#63;.
	*
	* @param categoryId the primary key of the current eshopping category
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory[] findByGroupId_PrevAndNext(
		long categoryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(categoryId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the eshopping categories where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of eshopping categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the eshopping category where groupId = &#63; and name = &#63; or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByCategoryName(
		long groupId, java.lang.String name)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategoryName(groupId, name);
	}

	/**
	* Returns the eshopping category where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByCategoryName(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategoryName(groupId, name);
	}

	/**
	* Returns the eshopping category where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param name the name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByCategoryName(
		long groupId, java.lang.String name, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCategoryName(groupId, name, retrieveFromCache);
	}

	/**
	* Removes the eshopping category where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the eshopping category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory removeByCategoryName(
		long groupId, java.lang.String name)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCategoryName(groupId, name);
	}

	/**
	* Returns the number of eshopping categories where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategoryName(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategoryName(groupId, name);
	}

	/**
	* Returns all the eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @return the matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByG_P(
		long groupId, long parentCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, parentCategoryId);
	}

	/**
	* Returns a range of all the eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @return the range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByG_P(
		long groupId, long parentCategoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, parentCategoryId, start, end);
	}

	/**
	* Returns an ordered range of all the eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findByG_P(
		long groupId, long parentCategoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P(groupId, parentCategoryId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByG_P_First(
		long groupId, long parentCategoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_First(groupId, parentCategoryId, orderByComparator);
	}

	/**
	* Returns the first eshopping category in the ordered set where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByG_P_First(
		long groupId, long parentCategoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_First(groupId, parentCategoryId,
			orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByG_P_Last(
		long groupId, long parentCategoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_Last(groupId, parentCategoryId, orderByComparator);
	}

	/**
	* Returns the last eshopping category in the ordered set where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByG_P_Last(
		long groupId, long parentCategoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_P_Last(groupId, parentCategoryId, orderByComparator);
	}

	/**
	* Returns the eshopping categories before and after the current eshopping category in the ordered set where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param categoryId the primary key of the current eshopping category
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory[] findByG_P_PrevAndNext(
		long categoryId, long groupId, long parentCategoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P_PrevAndNext(categoryId, groupId,
			parentCategoryId, orderByComparator);
	}

	/**
	* Removes all the eshopping categories where groupId = &#63; and parentCategoryId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P(long groupId, long parentCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_P(groupId, parentCategoryId);
	}

	/**
	* Returns the number of eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	*
	* @param groupId the group ID
	* @param parentCategoryId the parent category ID
	* @return the number of matching eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_P(long groupId, long parentCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_P(groupId, parentCategoryId);
	}

	/**
	* Caches the eshopping category in the entity cache if it is enabled.
	*
	* @param eshoppingCategory the eshopping category
	*/
	public static void cacheResult(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory) {
		getPersistence().cacheResult(eshoppingCategory);
	}

	/**
	* Caches the eshopping categories in the entity cache if it is enabled.
	*
	* @param eshoppingCategories the eshopping categories
	*/
	public static void cacheResult(
		java.util.List<com.bryoag.shopping.model.EshoppingCategory> eshoppingCategories) {
		getPersistence().cacheResult(eshoppingCategories);
	}

	/**
	* Creates a new eshopping category with the primary key. Does not add the eshopping category to the database.
	*
	* @param categoryId the primary key for the new eshopping category
	* @return the new eshopping category
	*/
	public static com.bryoag.shopping.model.EshoppingCategory create(
		long categoryId) {
		return getPersistence().create(categoryId);
	}

	/**
	* Removes the eshopping category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category that was removed
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory remove(
		long categoryId)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(categoryId);
	}

	public static com.bryoag.shopping.model.EshoppingCategory updateImpl(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(eshoppingCategory);
	}

	/**
	* Returns the eshopping category with the primary key or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category
	* @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory findByPrimaryKey(
		long categoryId)
		throws com.bryoag.shopping.NoSuchEshoppingCategoryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(categoryId);
	}

	/**
	* Returns the eshopping category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the eshopping category
	* @return the eshopping category, or <code>null</code> if a eshopping category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.model.EshoppingCategory fetchByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoryId);
	}

	/**
	* Returns all the eshopping categories.
	*
	* @return the eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the eshopping categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @return the range of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the eshopping categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eshopping categories
	* @param end the upper bound of the range of eshopping categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.model.EshoppingCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the eshopping categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of eshopping categories.
	*
	* @return the number of eshopping categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EshoppingCategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EshoppingCategoryPersistence)PortletBeanLocatorUtil.locate(com.bryoag.shopping.service.ClpSerializer.getServletContextName(),
					EshoppingCategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(EshoppingCategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EshoppingCategoryPersistence persistence) {
	}

	private static EshoppingCategoryPersistence _persistence;
}
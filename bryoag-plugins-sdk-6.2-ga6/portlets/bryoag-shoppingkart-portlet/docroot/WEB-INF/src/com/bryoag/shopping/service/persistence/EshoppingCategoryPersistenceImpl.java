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

import com.bryoag.shopping.NoSuchEshoppingCategoryException;
import com.bryoag.shopping.model.EshoppingCategory;
import com.bryoag.shopping.model.impl.EshoppingCategoryImpl;
import com.bryoag.shopping.model.impl.EshoppingCategoryModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the eshopping category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see EshoppingCategoryPersistence
 * @see EshoppingCategoryUtil
 * @generated
 */
public class EshoppingCategoryPersistenceImpl extends BasePersistenceImpl<EshoppingCategory>
	implements EshoppingCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EshoppingCategoryUtil} to access the eshopping category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EshoppingCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName(), Long.class.getName() },
			EshoppingCategoryModelImpl.COMPANYID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the eshopping categories where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EshoppingCategory> findByCompanyId(long companyId, long groupId)
		throws SystemException {
		return findByCompanyId(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<EshoppingCategory> findByCompanyId(long companyId,
		long groupId, int start, int end) throws SystemException {
		return findByCompanyId(companyId, groupId, start, end, null);
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
	@Override
	public List<EshoppingCategory> findByCompanyId(long companyId,
		long groupId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<EshoppingCategory> list = (List<EshoppingCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EshoppingCategory eshoppingCategory : list) {
				if ((companyId != eshoppingCategory.getCompanyId()) ||
						(groupId != eshoppingCategory.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EshoppingCategory>(list);
				}
				else {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public EshoppingCategory findByCompanyId_First(long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByCompanyId_First(companyId,
				groupId, orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
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
	@Override
	public EshoppingCategory fetchByCompanyId_First(long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws SystemException {
		List<EshoppingCategory> list = findByCompanyId(companyId, groupId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory findByCompanyId_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByCompanyId_Last(companyId,
				groupId, orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
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
	@Override
	public EshoppingCategory fetchByCompanyId_Last(long companyId,
		long groupId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompanyId(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<EshoppingCategory> list = findByCompanyId(companyId, groupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory[] findByCompanyId_PrevAndNext(long categoryId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			EshoppingCategory[] array = new EshoppingCategoryImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, eshoppingCategory,
					companyId, groupId, orderByComparator, true);

			array[1] = eshoppingCategory;

			array[2] = getByCompanyId_PrevAndNext(session, eshoppingCategory,
					companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EshoppingCategory getByCompanyId_PrevAndNext(Session session,
		EshoppingCategory eshoppingCategory, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(eshoppingCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EshoppingCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the eshopping categories where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId, long groupId)
		throws SystemException {
		for (EshoppingCategory eshoppingCategory : findByCompanyId(companyId,
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(eshoppingCategory);
		}
	}

	/**
	 * Returns the number of eshopping categories where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "eshoppingCategory.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYID_GROUPID_2 = "eshoppingCategory.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORYID = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycategoryId",
			new String[] { Long.class.getName(), Long.class.getName() },
			EshoppingCategoryModelImpl.CATEGORYID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYID = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycategoryId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the eshopping category where categoryId = &#63; and groupId = &#63; or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	 *
	 * @param categoryId the category ID
	 * @param groupId the group ID
	 * @return the matching eshopping category
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory findBycategoryId(long categoryId, long groupId)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchBycategoryId(categoryId,
				groupId);

		if (eshoppingCategory == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("categoryId=");
			msg.append(categoryId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEshoppingCategoryException(msg.toString());
		}

		return eshoppingCategory;
	}

	/**
	 * Returns the eshopping category where categoryId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param categoryId the category ID
	 * @param groupId the group ID
	 * @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchBycategoryId(long categoryId, long groupId)
		throws SystemException {
		return fetchBycategoryId(categoryId, groupId, true);
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
	@Override
	public EshoppingCategory fetchBycategoryId(long categoryId, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { categoryId, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CATEGORYID,
					finderArgs, this);
		}

		if (result instanceof EshoppingCategory) {
			EshoppingCategory eshoppingCategory = (EshoppingCategory)result;

			if ((categoryId != eshoppingCategory.getCategoryId()) ||
					(groupId != eshoppingCategory.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			query.append(_FINDER_COLUMN_CATEGORYID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

				qPos.add(groupId);

				List<EshoppingCategory> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EshoppingCategoryPersistenceImpl.fetchBycategoryId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EshoppingCategory eshoppingCategory = list.get(0);

					result = eshoppingCategory;

					cacheResult(eshoppingCategory);

					if ((eshoppingCategory.getCategoryId() != categoryId) ||
							(eshoppingCategory.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
							finderArgs, eshoppingCategory);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EshoppingCategory)result;
		}
	}

	/**
	 * Removes the eshopping category where categoryId = &#63; and groupId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 * @param groupId the group ID
	 * @return the eshopping category that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory removeBycategoryId(long categoryId, long groupId)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = findBycategoryId(categoryId,
				groupId);

		return remove(eshoppingCategory);
	}

	/**
	 * Returns the number of eshopping categories where categoryId = &#63; and groupId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @param groupId the group ID
	 * @return the number of matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycategoryId(long categoryId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYID;

		Object[] finderArgs = new Object[] { categoryId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			query.append(_FINDER_COLUMN_CATEGORYID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CATEGORYID_CATEGORYID_2 = "eshoppingCategory.categoryId = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYID_GROUPID_2 = "eshoppingCategory.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			EshoppingCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the eshopping categories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EshoppingCategory> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EshoppingCategory> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<EshoppingCategory> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<EshoppingCategory> list = (List<EshoppingCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EshoppingCategory eshoppingCategory : list) {
				if ((groupId != eshoppingCategory.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EshoppingCategory>(list);
				}
				else {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public EshoppingCategory findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByGroupId_First(groupId,
				orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
	}

	/**
	 * Returns the first eshopping category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<EshoppingCategory> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
	}

	/**
	 * Returns the last eshopping category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<EshoppingCategory> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory[] findByGroupId_PrevAndNext(long categoryId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			EshoppingCategory[] array = new EshoppingCategoryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, eshoppingCategory,
					groupId, orderByComparator, true);

			array[1] = eshoppingCategory;

			array[2] = getByGroupId_PrevAndNext(session, eshoppingCategory,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EshoppingCategory getByGroupId_PrevAndNext(Session session,
		EshoppingCategory eshoppingCategory, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(eshoppingCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EshoppingCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the eshopping categories where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (EshoppingCategory eshoppingCategory : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(eshoppingCategory);
		}
	}

	/**
	 * Returns the number of eshopping categories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "eshoppingCategory.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORYNAME = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCategoryName",
			new String[] { Long.class.getName(), String.class.getName() },
			EshoppingCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYNAME = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategoryName",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the eshopping category where groupId = &#63; and name = &#63; or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching eshopping category
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory findByCategoryName(long groupId, String name)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByCategoryName(groupId, name);

		if (eshoppingCategory == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEshoppingCategoryException(msg.toString());
		}

		return eshoppingCategory;
	}

	/**
	 * Returns the eshopping category where groupId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching eshopping category, or <code>null</code> if a matching eshopping category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchByCategoryName(long groupId, String name)
		throws SystemException {
		return fetchByCategoryName(groupId, name, true);
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
	@Override
	public EshoppingCategory fetchByCategoryName(long groupId, String name,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
					finderArgs, this);
		}

		if (result instanceof EshoppingCategory) {
			EshoppingCategory eshoppingCategory = (EshoppingCategory)result;

			if ((groupId != eshoppingCategory.getGroupId()) ||
					!Validator.equals(name, eshoppingCategory.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYNAME_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				List<EshoppingCategory> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"EshoppingCategoryPersistenceImpl.fetchByCategoryName(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					EshoppingCategory eshoppingCategory = list.get(0);

					result = eshoppingCategory;

					cacheResult(eshoppingCategory);

					if ((eshoppingCategory.getGroupId() != groupId) ||
							(eshoppingCategory.getName() == null) ||
							!eshoppingCategory.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
							finderArgs, eshoppingCategory);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EshoppingCategory)result;
		}
	}

	/**
	 * Removes the eshopping category where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the eshopping category that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory removeByCategoryName(long groupId, String name)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = findByCategoryName(groupId, name);

		return remove(eshoppingCategory);
	}

	/**
	 * Returns the number of eshopping categories where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCategoryName(long groupId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYNAME;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYNAME_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_CATEGORYNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CATEGORYNAME_GROUPID_2 = "eshoppingCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_1 = "eshoppingCategory.name IS NULL";
	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_2 = "eshoppingCategory.name = ?";
	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_3 = "(eshoppingCategory.name IS NULL OR eshoppingCategory.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED,
			EshoppingCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_P",
			new String[] { Long.class.getName(), Long.class.getName() },
			EshoppingCategoryModelImpl.GROUPID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.PARENTCATEGORYID_COLUMN_BITMASK |
			EshoppingCategoryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_P = new FinderPath(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_P",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentCategoryId the parent category ID
	 * @return the matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EshoppingCategory> findByG_P(long groupId, long parentCategoryId)
		throws SystemException {
		return findByG_P(groupId, parentCategoryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<EshoppingCategory> findByG_P(long groupId,
		long parentCategoryId, int start, int end) throws SystemException {
		return findByG_P(groupId, parentCategoryId, start, end, null);
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
	@Override
	public List<EshoppingCategory> findByG_P(long groupId,
		long parentCategoryId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P;
			finderArgs = new Object[] { groupId, parentCategoryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_P;
			finderArgs = new Object[] {
					groupId, parentCategoryId,
					
					start, end, orderByComparator
				};
		}

		List<EshoppingCategory> list = (List<EshoppingCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (EshoppingCategory eshoppingCategory : list) {
				if ((groupId != eshoppingCategory.getGroupId()) ||
						(parentCategoryId != eshoppingCategory.getParentCategoryId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_P_PARENTCATEGORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(parentCategoryId);

				if (!pagination) {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EshoppingCategory>(list);
				}
				else {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public EshoppingCategory findByG_P_First(long groupId,
		long parentCategoryId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByG_P_First(groupId,
				parentCategoryId, orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", parentCategoryId=");
		msg.append(parentCategoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
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
	@Override
	public EshoppingCategory fetchByG_P_First(long groupId,
		long parentCategoryId, OrderByComparator orderByComparator)
		throws SystemException {
		List<EshoppingCategory> list = findByG_P(groupId, parentCategoryId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory findByG_P_Last(long groupId,
		long parentCategoryId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByG_P_Last(groupId,
				parentCategoryId, orderByComparator);

		if (eshoppingCategory != null) {
			return eshoppingCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", parentCategoryId=");
		msg.append(parentCategoryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEshoppingCategoryException(msg.toString());
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
	@Override
	public EshoppingCategory fetchByG_P_Last(long groupId,
		long parentCategoryId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByG_P(groupId, parentCategoryId);

		if (count == 0) {
			return null;
		}

		List<EshoppingCategory> list = findByG_P(groupId, parentCategoryId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EshoppingCategory[] findByG_P_PrevAndNext(long categoryId,
		long groupId, long parentCategoryId, OrderByComparator orderByComparator)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			EshoppingCategory[] array = new EshoppingCategoryImpl[3];

			array[0] = getByG_P_PrevAndNext(session, eshoppingCategory,
					groupId, parentCategoryId, orderByComparator, true);

			array[1] = eshoppingCategory;

			array[2] = getByG_P_PrevAndNext(session, eshoppingCategory,
					groupId, parentCategoryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EshoppingCategory getByG_P_PrevAndNext(Session session,
		EshoppingCategory eshoppingCategory, long groupId,
		long parentCategoryId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ESHOPPINGCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_G_P_GROUPID_2);

		query.append(_FINDER_COLUMN_G_P_PARENTCATEGORYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(parentCategoryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(eshoppingCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EshoppingCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the eshopping categories where groupId = &#63; and parentCategoryId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param parentCategoryId the parent category ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_P(long groupId, long parentCategoryId)
		throws SystemException {
		for (EshoppingCategory eshoppingCategory : findByG_P(groupId,
				parentCategoryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(eshoppingCategory);
		}
	}

	/**
	 * Returns the number of eshopping categories where groupId = &#63; and parentCategoryId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param parentCategoryId the parent category ID
	 * @return the number of matching eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_P(long groupId, long parentCategoryId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_P;

		Object[] finderArgs = new Object[] { groupId, parentCategoryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ESHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_G_P_GROUPID_2);

			query.append(_FINDER_COLUMN_G_P_PARENTCATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(parentCategoryId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_P_GROUPID_2 = "eshoppingCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_P_PARENTCATEGORYID_2 = "eshoppingCategory.parentCategoryId = ?";

	public EshoppingCategoryPersistenceImpl() {
		setModelClass(EshoppingCategory.class);
	}

	/**
	 * Caches the eshopping category in the entity cache if it is enabled.
	 *
	 * @param eshoppingCategory the eshopping category
	 */
	@Override
	public void cacheResult(EshoppingCategory eshoppingCategory) {
		EntityCacheUtil.putResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryImpl.class, eshoppingCategory.getPrimaryKey(),
			eshoppingCategory);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
			new Object[] {
				eshoppingCategory.getCategoryId(),
				eshoppingCategory.getGroupId()
			}, eshoppingCategory);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
			new Object[] {
				eshoppingCategory.getGroupId(), eshoppingCategory.getName()
			}, eshoppingCategory);

		eshoppingCategory.resetOriginalValues();
	}

	/**
	 * Caches the eshopping categories in the entity cache if it is enabled.
	 *
	 * @param eshoppingCategories the eshopping categories
	 */
	@Override
	public void cacheResult(List<EshoppingCategory> eshoppingCategories) {
		for (EshoppingCategory eshoppingCategory : eshoppingCategories) {
			if (EntityCacheUtil.getResult(
						EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
						EshoppingCategoryImpl.class,
						eshoppingCategory.getPrimaryKey()) == null) {
				cacheResult(eshoppingCategory);
			}
			else {
				eshoppingCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all eshopping categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EshoppingCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EshoppingCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the eshopping category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EshoppingCategory eshoppingCategory) {
		EntityCacheUtil.removeResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryImpl.class, eshoppingCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(eshoppingCategory);
	}

	@Override
	public void clearCache(List<EshoppingCategory> eshoppingCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EshoppingCategory eshoppingCategory : eshoppingCategories) {
			EntityCacheUtil.removeResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
				EshoppingCategoryImpl.class, eshoppingCategory.getPrimaryKey());

			clearUniqueFindersCache(eshoppingCategory);
		}
	}

	protected void cacheUniqueFindersCache(EshoppingCategory eshoppingCategory) {
		if (eshoppingCategory.isNew()) {
			Object[] args = new Object[] {
					eshoppingCategory.getCategoryId(),
					eshoppingCategory.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID, args,
				eshoppingCategory);

			args = new Object[] {
					eshoppingCategory.getGroupId(), eshoppingCategory.getName()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args,
				eshoppingCategory);
		}
		else {
			EshoppingCategoryModelImpl eshoppingCategoryModelImpl = (EshoppingCategoryModelImpl)eshoppingCategory;

			if ((eshoppingCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CATEGORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eshoppingCategory.getCategoryId(),
						eshoppingCategory.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
					args, eshoppingCategory);
			}

			if ((eshoppingCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CATEGORYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eshoppingCategory.getGroupId(),
						eshoppingCategory.getName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
					args, eshoppingCategory);
			}
		}
	}

	protected void clearUniqueFindersCache(EshoppingCategory eshoppingCategory) {
		EshoppingCategoryModelImpl eshoppingCategoryModelImpl = (EshoppingCategoryModelImpl)eshoppingCategory;

		Object[] args = new Object[] {
				eshoppingCategory.getCategoryId(),
				eshoppingCategory.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYID, args);

		if ((eshoppingCategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CATEGORYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					eshoppingCategoryModelImpl.getOriginalCategoryId(),
					eshoppingCategoryModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYID, args);
		}

		args = new Object[] {
				eshoppingCategory.getGroupId(), eshoppingCategory.getName()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args);

		if ((eshoppingCategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CATEGORYNAME.getColumnBitmask()) != 0) {
			args = new Object[] {
					eshoppingCategoryModelImpl.getOriginalGroupId(),
					eshoppingCategoryModelImpl.getOriginalName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args);
		}
	}

	/**
	 * Creates a new eshopping category with the primary key. Does not add the eshopping category to the database.
	 *
	 * @param categoryId the primary key for the new eshopping category
	 * @return the new eshopping category
	 */
	@Override
	public EshoppingCategory create(long categoryId) {
		EshoppingCategory eshoppingCategory = new EshoppingCategoryImpl();

		eshoppingCategory.setNew(true);
		eshoppingCategory.setPrimaryKey(categoryId);

		return eshoppingCategory;
	}

	/**
	 * Removes the eshopping category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the eshopping category
	 * @return the eshopping category that was removed
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory remove(long categoryId)
		throws NoSuchEshoppingCategoryException, SystemException {
		return remove((Serializable)categoryId);
	}

	/**
	 * Removes the eshopping category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the eshopping category
	 * @return the eshopping category that was removed
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory remove(Serializable primaryKey)
		throws NoSuchEshoppingCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EshoppingCategory eshoppingCategory = (EshoppingCategory)session.get(EshoppingCategoryImpl.class,
					primaryKey);

			if (eshoppingCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEshoppingCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(eshoppingCategory);
		}
		catch (NoSuchEshoppingCategoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EshoppingCategory removeImpl(EshoppingCategory eshoppingCategory)
		throws SystemException {
		eshoppingCategory = toUnwrappedModel(eshoppingCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(eshoppingCategory)) {
				eshoppingCategory = (EshoppingCategory)session.get(EshoppingCategoryImpl.class,
						eshoppingCategory.getPrimaryKeyObj());
			}

			if (eshoppingCategory != null) {
				session.delete(eshoppingCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (eshoppingCategory != null) {
			clearCache(eshoppingCategory);
		}

		return eshoppingCategory;
	}

	@Override
	public EshoppingCategory updateImpl(
		com.bryoag.shopping.model.EshoppingCategory eshoppingCategory)
		throws SystemException {
		eshoppingCategory = toUnwrappedModel(eshoppingCategory);

		boolean isNew = eshoppingCategory.isNew();

		EshoppingCategoryModelImpl eshoppingCategoryModelImpl = (EshoppingCategoryModelImpl)eshoppingCategory;

		Session session = null;

		try {
			session = openSession();

			if (eshoppingCategory.isNew()) {
				session.save(eshoppingCategory);

				eshoppingCategory.setNew(false);
			}
			else {
				session.merge(eshoppingCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EshoppingCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((eshoppingCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eshoppingCategoryModelImpl.getOriginalCompanyId(),
						eshoppingCategoryModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] {
						eshoppingCategoryModelImpl.getCompanyId(),
						eshoppingCategoryModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((eshoppingCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eshoppingCategoryModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { eshoppingCategoryModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((eshoppingCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eshoppingCategoryModelImpl.getOriginalGroupId(),
						eshoppingCategoryModelImpl.getOriginalParentCategoryId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P,
					args);

				args = new Object[] {
						eshoppingCategoryModelImpl.getGroupId(),
						eshoppingCategoryModelImpl.getParentCategoryId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_P,
					args);
			}
		}

		EntityCacheUtil.putResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
			EshoppingCategoryImpl.class, eshoppingCategory.getPrimaryKey(),
			eshoppingCategory);

		clearUniqueFindersCache(eshoppingCategory);
		cacheUniqueFindersCache(eshoppingCategory);

		return eshoppingCategory;
	}

	protected EshoppingCategory toUnwrappedModel(
		EshoppingCategory eshoppingCategory) {
		if (eshoppingCategory instanceof EshoppingCategoryImpl) {
			return eshoppingCategory;
		}

		EshoppingCategoryImpl eshoppingCategoryImpl = new EshoppingCategoryImpl();

		eshoppingCategoryImpl.setNew(eshoppingCategory.isNew());
		eshoppingCategoryImpl.setPrimaryKey(eshoppingCategory.getPrimaryKey());

		eshoppingCategoryImpl.setCategoryId(eshoppingCategory.getCategoryId());
		eshoppingCategoryImpl.setGroupId(eshoppingCategory.getGroupId());
		eshoppingCategoryImpl.setCompanyId(eshoppingCategory.getCompanyId());
		eshoppingCategoryImpl.setUserId(eshoppingCategory.getUserId());
		eshoppingCategoryImpl.setUserName(eshoppingCategory.getUserName());
		eshoppingCategoryImpl.setCreateDate(eshoppingCategory.getCreateDate());
		eshoppingCategoryImpl.setModifiedDate(eshoppingCategory.getModifiedDate());
		eshoppingCategoryImpl.setParentCategoryId(eshoppingCategory.getParentCategoryId());
		eshoppingCategoryImpl.setName(eshoppingCategory.getName());
		eshoppingCategoryImpl.setDescription(eshoppingCategory.getDescription());

		return eshoppingCategoryImpl;
	}

	/**
	 * Returns the eshopping category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the eshopping category
	 * @return the eshopping category
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEshoppingCategoryException, SystemException {
		EshoppingCategory eshoppingCategory = fetchByPrimaryKey(primaryKey);

		if (eshoppingCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEshoppingCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return eshoppingCategory;
	}

	/**
	 * Returns the eshopping category with the primary key or throws a {@link com.bryoag.shopping.NoSuchEshoppingCategoryException} if it could not be found.
	 *
	 * @param categoryId the primary key of the eshopping category
	 * @return the eshopping category
	 * @throws com.bryoag.shopping.NoSuchEshoppingCategoryException if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory findByPrimaryKey(long categoryId)
		throws NoSuchEshoppingCategoryException, SystemException {
		return findByPrimaryKey((Serializable)categoryId);
	}

	/**
	 * Returns the eshopping category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the eshopping category
	 * @return the eshopping category, or <code>null</code> if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EshoppingCategory eshoppingCategory = (EshoppingCategory)EntityCacheUtil.getResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
				EshoppingCategoryImpl.class, primaryKey);

		if (eshoppingCategory == _nullEshoppingCategory) {
			return null;
		}

		if (eshoppingCategory == null) {
			Session session = null;

			try {
				session = openSession();

				eshoppingCategory = (EshoppingCategory)session.get(EshoppingCategoryImpl.class,
						primaryKey);

				if (eshoppingCategory != null) {
					cacheResult(eshoppingCategory);
				}
				else {
					EntityCacheUtil.putResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
						EshoppingCategoryImpl.class, primaryKey,
						_nullEshoppingCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EshoppingCategoryModelImpl.ENTITY_CACHE_ENABLED,
					EshoppingCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return eshoppingCategory;
	}

	/**
	 * Returns the eshopping category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryId the primary key of the eshopping category
	 * @return the eshopping category, or <code>null</code> if a eshopping category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EshoppingCategory fetchByPrimaryKey(long categoryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)categoryId);
	}

	/**
	 * Returns all the eshopping categories.
	 *
	 * @return the eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EshoppingCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EshoppingCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<EshoppingCategory> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<EshoppingCategory> list = (List<EshoppingCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ESHOPPINGCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ESHOPPINGCATEGORY;

				if (pagination) {
					sql = sql.concat(EshoppingCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EshoppingCategory>(list);
				}
				else {
					list = (List<EshoppingCategory>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the eshopping categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EshoppingCategory eshoppingCategory : findAll()) {
			remove(eshoppingCategory);
		}
	}

	/**
	 * Returns the number of eshopping categories.
	 *
	 * @return the number of eshopping categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ESHOPPINGCATEGORY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the eshopping category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.bryoag.shopping.model.EshoppingCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EshoppingCategory>> listenersList = new ArrayList<ModelListener<EshoppingCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EshoppingCategory>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EshoppingCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ESHOPPINGCATEGORY = "SELECT eshoppingCategory FROM EshoppingCategory eshoppingCategory";
	private static final String _SQL_SELECT_ESHOPPINGCATEGORY_WHERE = "SELECT eshoppingCategory FROM EshoppingCategory eshoppingCategory WHERE ";
	private static final String _SQL_COUNT_ESHOPPINGCATEGORY = "SELECT COUNT(eshoppingCategory) FROM EshoppingCategory eshoppingCategory";
	private static final String _SQL_COUNT_ESHOPPINGCATEGORY_WHERE = "SELECT COUNT(eshoppingCategory) FROM EshoppingCategory eshoppingCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "eshoppingCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EshoppingCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EshoppingCategory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EshoppingCategoryPersistenceImpl.class);
	private static EshoppingCategory _nullEshoppingCategory = new EshoppingCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EshoppingCategory> toCacheModel() {
				return _nullEshoppingCategoryCacheModel;
			}
		};

	private static CacheModel<EshoppingCategory> _nullEshoppingCategoryCacheModel =
		new CacheModel<EshoppingCategory>() {
			@Override
			public EshoppingCategory toEntityModel() {
				return _nullEshoppingCategory;
			}
		};
}
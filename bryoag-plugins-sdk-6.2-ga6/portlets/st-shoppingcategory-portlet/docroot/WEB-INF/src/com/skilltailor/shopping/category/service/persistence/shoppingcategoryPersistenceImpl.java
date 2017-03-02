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

import com.skilltailor.shopping.category.NoSuchshoppingcategoryException;
import com.skilltailor.shopping.category.model.impl.shoppingcategoryImpl;
import com.skilltailor.shopping.category.model.impl.shoppingcategoryModelImpl;
import com.skilltailor.shopping.category.model.shoppingcategory;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the shoppingcategory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see shoppingcategoryPersistence
 * @see shoppingcategoryUtil
 * @generated
 */
public class shoppingcategoryPersistenceImpl extends BasePersistenceImpl<shoppingcategory>
	implements shoppingcategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link shoppingcategoryUtil} to access the shoppingcategory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = shoppingcategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			shoppingcategoryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the shoppingcategories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<shoppingcategory> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<shoppingcategory> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<shoppingcategory> findByGroupId(long groupId, int start,
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

		List<shoppingcategory> list = (List<shoppingcategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (shoppingcategory shoppingcategory : list) {
				if ((groupId != shoppingcategory.getGroupId())) {
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

			query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<shoppingcategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<shoppingcategory>(list);
				}
				else {
					list = (List<shoppingcategory>)QueryUtil.list(q,
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
	 * Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByGroupId_First(groupId,
				orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
	}

	/**
	 * Returns the first shoppingcategory in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<shoppingcategory> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
	}

	/**
	 * Returns the last shoppingcategory in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<shoppingcategory> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory[] findByGroupId_PrevAndNext(long categoryId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			shoppingcategory[] array = new shoppingcategoryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, shoppingcategory,
					groupId, orderByComparator, true);

			array[1] = shoppingcategory;

			array[2] = getByGroupId_PrevAndNext(session, shoppingcategory,
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

	protected shoppingcategory getByGroupId_PrevAndNext(Session session,
		shoppingcategory shoppingcategory, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

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
			query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shoppingcategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shoppingcategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shoppingcategories where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (shoppingcategory shoppingcategory : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shoppingcategory);
		}
	}

	/**
	 * Returns the number of shoppingcategories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching shoppingcategories
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

			query.append(_SQL_COUNT_SHOPPINGCATEGORY_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "shoppingcategory.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORYID = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCategoryId", new String[] { Long.class.getName() },
			shoppingcategoryModelImpl.CATEGORYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYID = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategoryId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the shoppingcategory where categoryId = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	 *
	 * @param categoryId the category ID
	 * @return the matching shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByCategoryId(long categoryId)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByCategoryId(categoryId);

		if (shoppingcategory == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("categoryId=");
			msg.append(categoryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchshoppingcategoryException(msg.toString());
		}

		return shoppingcategory;
	}

	/**
	 * Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param categoryId the category ID
	 * @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByCategoryId(long categoryId)
		throws SystemException {
		return fetchByCategoryId(categoryId, true);
	}

	/**
	 * Returns the shoppingcategory where categoryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param categoryId the category ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByCategoryId(long categoryId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { categoryId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CATEGORYID,
					finderArgs, this);
		}

		if (result instanceof shoppingcategory) {
			shoppingcategory shoppingcategory = (shoppingcategory)result;

			if ((categoryId != shoppingcategory.getCategoryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

				List<shoppingcategory> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"shoppingcategoryPersistenceImpl.fetchByCategoryId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					shoppingcategory shoppingcategory = list.get(0);

					result = shoppingcategory;

					cacheResult(shoppingcategory);

					if ((shoppingcategory.getCategoryId() != categoryId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
							finderArgs, shoppingcategory);
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
			return (shoppingcategory)result;
		}
	}

	/**
	 * Removes the shoppingcategory where categoryId = &#63; from the database.
	 *
	 * @param categoryId the category ID
	 * @return the shoppingcategory that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory removeByCategoryId(long categoryId)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = findByCategoryId(categoryId);

		return remove(shoppingcategory);
	}

	/**
	 * Returns the number of shoppingcategories where categoryId = &#63;.
	 *
	 * @param categoryId the category ID
	 * @return the number of matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCategoryId(long categoryId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYID;

		Object[] finderArgs = new Object[] { categoryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYID_CATEGORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(categoryId);

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

	private static final String _FINDER_COLUMN_CATEGORYID_CATEGORYID_2 = "shoppingcategory.categoryId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMAPNYID =
		new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByComapnyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMAPNYID =
		new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByComapnyId",
			new String[] { Long.class.getName() },
			shoppingcategoryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMAPNYID = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComapnyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the shoppingcategories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<shoppingcategory> findByComapnyId(long companyId)
		throws SystemException {
		return findByComapnyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<shoppingcategory> findByComapnyId(long companyId, int start,
		int end) throws SystemException {
		return findByComapnyId(companyId, start, end, null);
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
	@Override
	public List<shoppingcategory> findByComapnyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMAPNYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMAPNYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<shoppingcategory> list = (List<shoppingcategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (shoppingcategory shoppingcategory : list) {
				if ((companyId != shoppingcategory.getCompanyId())) {
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

			query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMAPNYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<shoppingcategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<shoppingcategory>(list);
				}
				else {
					list = (List<shoppingcategory>)QueryUtil.list(q,
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
	 * Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByComapnyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByComapnyId_First(companyId,
				orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
	}

	/**
	 * Returns the first shoppingcategory in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByComapnyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<shoppingcategory> list = findByComapnyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory findByComapnyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByComapnyId_Last(companyId,
				orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
	}

	/**
	 * Returns the last shoppingcategory in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByComapnyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByComapnyId(companyId);

		if (count == 0) {
			return null;
		}

		List<shoppingcategory> list = findByComapnyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory[] findByComapnyId_PrevAndNext(long categoryId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			shoppingcategory[] array = new shoppingcategoryImpl[3];

			array[0] = getByComapnyId_PrevAndNext(session, shoppingcategory,
					companyId, orderByComparator, true);

			array[1] = shoppingcategory;

			array[2] = getByComapnyId_PrevAndNext(session, shoppingcategory,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected shoppingcategory getByComapnyId_PrevAndNext(Session session,
		shoppingcategory shoppingcategory, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_COMAPNYID_COMPANYID_2);

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
			query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shoppingcategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shoppingcategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shoppingcategories where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByComapnyId(long companyId) throws SystemException {
		for (shoppingcategory shoppingcategory : findByComapnyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shoppingcategory);
		}
	}

	/**
	 * Returns the number of shoppingcategories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByComapnyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMAPNYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMAPNYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMAPNYID_COMPANYID_2 = "shoppingcategory.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			shoppingcategoryModelImpl.COMPANYID_COLUMN_BITMASK |
			shoppingcategoryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_G = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the shoppingcategories where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<shoppingcategory> findByC_G(long companyId, long groupId)
		throws SystemException {
		return findByC_G(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<shoppingcategory> findByC_G(long companyId, long groupId,
		int start, int end) throws SystemException {
		return findByC_G(companyId, groupId, start, end, null);
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
	@Override
	public List<shoppingcategory> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_G;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<shoppingcategory> list = (List<shoppingcategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (shoppingcategory shoppingcategory : list) {
				if ((companyId != shoppingcategory.getCompanyId()) ||
						(groupId != shoppingcategory.getGroupId())) {
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

			query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
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
					list = (List<shoppingcategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<shoppingcategory>(list);
				}
				else {
					list = (List<shoppingcategory>)QueryUtil.list(q,
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
	 * Returns the first shoppingcategory in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByC_G_First(companyId,
				groupId, orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
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
	@Override
	public shoppingcategory fetchByC_G_First(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<shoppingcategory> list = findByC_G(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory findByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByC_G_Last(companyId, groupId,
				orderByComparator);

		if (shoppingcategory != null) {
			return shoppingcategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshoppingcategoryException(msg.toString());
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
	@Override
	public shoppingcategory fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_G(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<shoppingcategory> list = findByC_G(companyId, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public shoppingcategory[] findByC_G_PrevAndNext(long categoryId,
		long companyId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			shoppingcategory[] array = new shoppingcategoryImpl[3];

			array[0] = getByC_G_PrevAndNext(session, shoppingcategory,
					companyId, groupId, orderByComparator, true);

			array[1] = shoppingcategory;

			array[2] = getByC_G_PrevAndNext(session, shoppingcategory,
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

	protected shoppingcategory getByC_G_PrevAndNext(Session session,
		shoppingcategory shoppingcategory, long companyId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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
			query.append(shoppingcategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shoppingcategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shoppingcategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shoppingcategories where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_G(long companyId, long groupId)
		throws SystemException {
		for (shoppingcategory shoppingcategory : findByC_G(companyId, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shoppingcategory);
		}
	}

	/**
	 * Returns the number of shoppingcategories where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_G(long companyId, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_G;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SHOPPINGCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_C_G_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_G_GROUPID_2);

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

	private static final String _FINDER_COLUMN_C_G_COMPANYID_2 = "shoppingcategory.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_G_GROUPID_2 = "shoppingcategory.groupId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CATEGORYNAME = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED,
			shoppingcategoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCategoryName", new String[] { String.class.getName() },
			shoppingcategoryModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYNAME = new FinderPath(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategoryName",
			new String[] { String.class.getName() });

	/**
	 * Returns the shoppingcategory where name = &#63; or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	 *
	 * @param name the name
	 * @return the matching shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByCategoryName(String name)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByCategoryName(name);

		if (shoppingcategory == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchshoppingcategoryException(msg.toString());
		}

		return shoppingcategory;
	}

	/**
	 * Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByCategoryName(String name)
		throws SystemException {
		return fetchByCategoryName(name, true);
	}

	/**
	 * Returns the shoppingcategory where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching shoppingcategory, or <code>null</code> if a matching shoppingcategory could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByCategoryName(String name,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
					finderArgs, this);
		}

		if (result instanceof shoppingcategory) {
			shoppingcategory shoppingcategory = (shoppingcategory)result;

			if (!Validator.equals(name, shoppingcategory.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SHOPPINGCATEGORY_WHERE);

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

				if (bindName) {
					qPos.add(name);
				}

				List<shoppingcategory> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"shoppingcategoryPersistenceImpl.fetchByCategoryName(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					shoppingcategory shoppingcategory = list.get(0);

					result = shoppingcategory;

					cacheResult(shoppingcategory);

					if ((shoppingcategory.getName() == null) ||
							!shoppingcategory.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
							finderArgs, shoppingcategory);
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
			return (shoppingcategory)result;
		}
	}

	/**
	 * Removes the shoppingcategory where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the shoppingcategory that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory removeByCategoryName(String name)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = findByCategoryName(name);

		return remove(shoppingcategory);
	}

	/**
	 * Returns the number of shoppingcategories where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCategoryName(String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYNAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHOPPINGCATEGORY_WHERE);

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

	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_1 = "shoppingcategory.name IS NULL";
	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_2 = "shoppingcategory.name = ?";
	private static final String _FINDER_COLUMN_CATEGORYNAME_NAME_3 = "(shoppingcategory.name IS NULL OR shoppingcategory.name = '')";

	public shoppingcategoryPersistenceImpl() {
		setModelClass(shoppingcategory.class);
	}

	/**
	 * Caches the shoppingcategory in the entity cache if it is enabled.
	 *
	 * @param shoppingcategory the shoppingcategory
	 */
	@Override
	public void cacheResult(shoppingcategory shoppingcategory) {
		EntityCacheUtil.putResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryImpl.class, shoppingcategory.getPrimaryKey(),
			shoppingcategory);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
			new Object[] { shoppingcategory.getCategoryId() }, shoppingcategory);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
			new Object[] { shoppingcategory.getName() }, shoppingcategory);

		shoppingcategory.resetOriginalValues();
	}

	/**
	 * Caches the shoppingcategories in the entity cache if it is enabled.
	 *
	 * @param shoppingcategories the shoppingcategories
	 */
	@Override
	public void cacheResult(List<shoppingcategory> shoppingcategories) {
		for (shoppingcategory shoppingcategory : shoppingcategories) {
			if (EntityCacheUtil.getResult(
						shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
						shoppingcategoryImpl.class,
						shoppingcategory.getPrimaryKey()) == null) {
				cacheResult(shoppingcategory);
			}
			else {
				shoppingcategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shoppingcategories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(shoppingcategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(shoppingcategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shoppingcategory.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(shoppingcategory shoppingcategory) {
		EntityCacheUtil.removeResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryImpl.class, shoppingcategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(shoppingcategory);
	}

	@Override
	public void clearCache(List<shoppingcategory> shoppingcategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (shoppingcategory shoppingcategory : shoppingcategories) {
			EntityCacheUtil.removeResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
				shoppingcategoryImpl.class, shoppingcategory.getPrimaryKey());

			clearUniqueFindersCache(shoppingcategory);
		}
	}

	protected void cacheUniqueFindersCache(shoppingcategory shoppingcategory) {
		if (shoppingcategory.isNew()) {
			Object[] args = new Object[] { shoppingcategory.getCategoryId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID, args,
				shoppingcategory);

			args = new Object[] { shoppingcategory.getName() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args,
				shoppingcategory);
		}
		else {
			shoppingcategoryModelImpl shoppingcategoryModelImpl = (shoppingcategoryModelImpl)shoppingcategory;

			if ((shoppingcategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CATEGORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { shoppingcategory.getCategoryId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYID,
					args, shoppingcategory);
			}

			if ((shoppingcategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CATEGORYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { shoppingcategory.getName() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CATEGORYNAME,
					args, shoppingcategory);
			}
		}
	}

	protected void clearUniqueFindersCache(shoppingcategory shoppingcategory) {
		shoppingcategoryModelImpl shoppingcategoryModelImpl = (shoppingcategoryModelImpl)shoppingcategory;

		Object[] args = new Object[] { shoppingcategory.getCategoryId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYID, args);

		if ((shoppingcategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CATEGORYID.getColumnBitmask()) != 0) {
			args = new Object[] {
					shoppingcategoryModelImpl.getOriginalCategoryId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYID, args);
		}

		args = new Object[] { shoppingcategory.getName() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args);

		if ((shoppingcategoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CATEGORYNAME.getColumnBitmask()) != 0) {
			args = new Object[] { shoppingcategoryModelImpl.getOriginalName() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CATEGORYNAME, args);
		}
	}

	/**
	 * Creates a new shoppingcategory with the primary key. Does not add the shoppingcategory to the database.
	 *
	 * @param categoryId the primary key for the new shoppingcategory
	 * @return the new shoppingcategory
	 */
	@Override
	public shoppingcategory create(long categoryId) {
		shoppingcategory shoppingcategory = new shoppingcategoryImpl();

		shoppingcategory.setNew(true);
		shoppingcategory.setPrimaryKey(categoryId);

		return shoppingcategory;
	}

	/**
	 * Removes the shoppingcategory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the shoppingcategory
	 * @return the shoppingcategory that was removed
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory remove(long categoryId)
		throws NoSuchshoppingcategoryException, SystemException {
		return remove((Serializable)categoryId);
	}

	/**
	 * Removes the shoppingcategory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shoppingcategory
	 * @return the shoppingcategory that was removed
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory remove(Serializable primaryKey)
		throws NoSuchshoppingcategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			shoppingcategory shoppingcategory = (shoppingcategory)session.get(shoppingcategoryImpl.class,
					primaryKey);

			if (shoppingcategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchshoppingcategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shoppingcategory);
		}
		catch (NoSuchshoppingcategoryException nsee) {
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
	protected shoppingcategory removeImpl(shoppingcategory shoppingcategory)
		throws SystemException {
		shoppingcategory = toUnwrappedModel(shoppingcategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shoppingcategory)) {
				shoppingcategory = (shoppingcategory)session.get(shoppingcategoryImpl.class,
						shoppingcategory.getPrimaryKeyObj());
			}

			if (shoppingcategory != null) {
				session.delete(shoppingcategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shoppingcategory != null) {
			clearCache(shoppingcategory);
		}

		return shoppingcategory;
	}

	@Override
	public shoppingcategory updateImpl(
		com.skilltailor.shopping.category.model.shoppingcategory shoppingcategory)
		throws SystemException {
		shoppingcategory = toUnwrappedModel(shoppingcategory);

		boolean isNew = shoppingcategory.isNew();

		shoppingcategoryModelImpl shoppingcategoryModelImpl = (shoppingcategoryModelImpl)shoppingcategory;

		Session session = null;

		try {
			session = openSession();

			if (shoppingcategory.isNew()) {
				session.save(shoppingcategory);

				shoppingcategory.setNew(false);
			}
			else {
				session.merge(shoppingcategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !shoppingcategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((shoppingcategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shoppingcategoryModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { shoppingcategoryModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((shoppingcategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMAPNYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shoppingcategoryModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMAPNYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMAPNYID,
					args);

				args = new Object[] { shoppingcategoryModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMAPNYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMAPNYID,
					args);
			}

			if ((shoppingcategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shoppingcategoryModelImpl.getOriginalCompanyId(),
						shoppingcategoryModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);

				args = new Object[] {
						shoppingcategoryModelImpl.getCompanyId(),
						shoppingcategoryModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_G, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_G,
					args);
			}
		}

		EntityCacheUtil.putResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
			shoppingcategoryImpl.class, shoppingcategory.getPrimaryKey(),
			shoppingcategory);

		clearUniqueFindersCache(shoppingcategory);
		cacheUniqueFindersCache(shoppingcategory);

		return shoppingcategory;
	}

	protected shoppingcategory toUnwrappedModel(
		shoppingcategory shoppingcategory) {
		if (shoppingcategory instanceof shoppingcategoryImpl) {
			return shoppingcategory;
		}

		shoppingcategoryImpl shoppingcategoryImpl = new shoppingcategoryImpl();

		shoppingcategoryImpl.setNew(shoppingcategory.isNew());
		shoppingcategoryImpl.setPrimaryKey(shoppingcategory.getPrimaryKey());

		shoppingcategoryImpl.setCategoryId(shoppingcategory.getCategoryId());
		shoppingcategoryImpl.setGroupId(shoppingcategory.getGroupId());
		shoppingcategoryImpl.setCompanyId(shoppingcategory.getCompanyId());
		shoppingcategoryImpl.setUserId(shoppingcategory.getUserId());
		shoppingcategoryImpl.setUserName(shoppingcategory.getUserName());
		shoppingcategoryImpl.setCreateDate(shoppingcategory.getCreateDate());
		shoppingcategoryImpl.setModifiedDate(shoppingcategory.getModifiedDate());
		shoppingcategoryImpl.setName(shoppingcategory.getName());
		shoppingcategoryImpl.setDescription(shoppingcategory.getDescription());
		shoppingcategoryImpl.setParentId(shoppingcategory.getParentId());

		return shoppingcategoryImpl;
	}

	/**
	 * Returns the shoppingcategory with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shoppingcategory
	 * @return the shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchshoppingcategoryException, SystemException {
		shoppingcategory shoppingcategory = fetchByPrimaryKey(primaryKey);

		if (shoppingcategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchshoppingcategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shoppingcategory;
	}

	/**
	 * Returns the shoppingcategory with the primary key or throws a {@link com.skilltailor.shopping.category.NoSuchshoppingcategoryException} if it could not be found.
	 *
	 * @param categoryId the primary key of the shoppingcategory
	 * @return the shoppingcategory
	 * @throws com.skilltailor.shopping.category.NoSuchshoppingcategoryException if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory findByPrimaryKey(long categoryId)
		throws NoSuchshoppingcategoryException, SystemException {
		return findByPrimaryKey((Serializable)categoryId);
	}

	/**
	 * Returns the shoppingcategory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shoppingcategory
	 * @return the shoppingcategory, or <code>null</code> if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		shoppingcategory shoppingcategory = (shoppingcategory)EntityCacheUtil.getResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
				shoppingcategoryImpl.class, primaryKey);

		if (shoppingcategory == _nullshoppingcategory) {
			return null;
		}

		if (shoppingcategory == null) {
			Session session = null;

			try {
				session = openSession();

				shoppingcategory = (shoppingcategory)session.get(shoppingcategoryImpl.class,
						primaryKey);

				if (shoppingcategory != null) {
					cacheResult(shoppingcategory);
				}
				else {
					EntityCacheUtil.putResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
						shoppingcategoryImpl.class, primaryKey,
						_nullshoppingcategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(shoppingcategoryModelImpl.ENTITY_CACHE_ENABLED,
					shoppingcategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shoppingcategory;
	}

	/**
	 * Returns the shoppingcategory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryId the primary key of the shoppingcategory
	 * @return the shoppingcategory, or <code>null</code> if a shoppingcategory with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public shoppingcategory fetchByPrimaryKey(long categoryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)categoryId);
	}

	/**
	 * Returns all the shoppingcategories.
	 *
	 * @return the shoppingcategories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<shoppingcategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<shoppingcategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<shoppingcategory> findAll(int start, int end,
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

		List<shoppingcategory> list = (List<shoppingcategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SHOPPINGCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHOPPINGCATEGORY;

				if (pagination) {
					sql = sql.concat(shoppingcategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<shoppingcategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<shoppingcategory>(list);
				}
				else {
					list = (List<shoppingcategory>)QueryUtil.list(q,
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
	 * Removes all the shoppingcategories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (shoppingcategory shoppingcategory : findAll()) {
			remove(shoppingcategory);
		}
	}

	/**
	 * Returns the number of shoppingcategories.
	 *
	 * @return the number of shoppingcategories
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

				Query q = session.createQuery(_SQL_COUNT_SHOPPINGCATEGORY);

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
	 * Initializes the shoppingcategory persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.skilltailor.shopping.category.model.shoppingcategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<shoppingcategory>> listenersList = new ArrayList<ModelListener<shoppingcategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<shoppingcategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(shoppingcategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SHOPPINGCATEGORY = "SELECT shoppingcategory FROM shoppingcategory shoppingcategory";
	private static final String _SQL_SELECT_SHOPPINGCATEGORY_WHERE = "SELECT shoppingcategory FROM shoppingcategory shoppingcategory WHERE ";
	private static final String _SQL_COUNT_SHOPPINGCATEGORY = "SELECT COUNT(shoppingcategory) FROM shoppingcategory shoppingcategory";
	private static final String _SQL_COUNT_SHOPPINGCATEGORY_WHERE = "SELECT COUNT(shoppingcategory) FROM shoppingcategory shoppingcategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shoppingcategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No shoppingcategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No shoppingcategory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(shoppingcategoryPersistenceImpl.class);
	private static shoppingcategory _nullshoppingcategory = new shoppingcategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<shoppingcategory> toCacheModel() {
				return _nullshoppingcategoryCacheModel;
			}
		};

	private static CacheModel<shoppingcategory> _nullshoppingcategoryCacheModel = new CacheModel<shoppingcategory>() {
			@Override
			public shoppingcategory toEntityModel() {
				return _nullshoppingcategory;
			}
		};
}
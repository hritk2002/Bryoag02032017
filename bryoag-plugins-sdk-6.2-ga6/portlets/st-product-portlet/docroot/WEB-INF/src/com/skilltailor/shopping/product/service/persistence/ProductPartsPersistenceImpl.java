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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.skilltailor.shopping.product.NoSuchProductPartsException;
import com.skilltailor.shopping.product.model.ProductParts;
import com.skilltailor.shopping.product.model.impl.ProductPartsImpl;
import com.skilltailor.shopping.product.model.impl.ProductPartsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the product parts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see ProductPartsPersistence
 * @see ProductPartsUtil
 * @generated
 */
public class ProductPartsPersistenceImpl extends BasePersistenceImpl<ProductParts>
	implements ProductPartsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProductPartsUtil} to access the product parts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProductPartsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTID =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTID =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductId",
			new String[] { Long.class.getName() },
			ProductPartsModelImpl.PRODUCTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTID = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the product partses where productId = &#63;.
	 *
	 * @param productId the product ID
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByProductId(long productId)
		throws SystemException {
		return findByProductId(productId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<ProductParts> findByProductId(long productId, int start, int end)
		throws SystemException {
		return findByProductId(productId, start, end, null);
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
	@Override
	public List<ProductParts> findByProductId(long productId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTID;
			finderArgs = new Object[] { productId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTID;
			finderArgs = new Object[] { productId, start, end, orderByComparator };
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if ((productId != productParts.getProductId())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTID_PRODUCTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where productId = &#63;.
	 *
	 * @param productId the product ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByProductId_First(long productId,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductId_First(productId,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productId=");
		msg.append(productId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the first product parts in the ordered set where productId = &#63;.
	 *
	 * @param productId the product ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByProductId_First(long productId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductParts> list = findByProductId(productId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByProductId_Last(long productId,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductId_Last(productId,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productId=");
		msg.append(productId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the last product parts in the ordered set where productId = &#63;.
	 *
	 * @param productId the product ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByProductId_Last(long productId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductId(productId);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByProductId(productId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByProductId_PrevAndNext(long partId,
		long productId, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByProductId_PrevAndNext(session, productParts,
					productId, orderByComparator, true);

			array[1] = productParts;

			array[2] = getByProductId_PrevAndNext(session, productParts,
					productId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByProductId_PrevAndNext(Session session,
		ProductParts productParts, long productId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTID_PRODUCTID_2);

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(productId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where productId = &#63; from the database.
	 *
	 * @param productId the product ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductId(long productId) throws SystemException {
		for (ProductParts productParts : findByProductId(productId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where productId = &#63;.
	 *
	 * @param productId the product ID
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductId(long productId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTID;

		Object[] finderArgs = new Object[] { productId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTID_PRODUCTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

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

	private static final String _FINDER_COLUMN_PRODUCTID_PRODUCTID_2 = "productParts.productId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProductCompatibility",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductCompatibility",
			new String[] { Long.class.getName(), String.class.getName() },
			ProductPartsModelImpl.PRODUCTID_COLUMN_BITMASK |
			ProductPartsModelImpl.COMPATIBLETAG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTCOMPATIBILITY = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByProductCompatibility",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the product partses where productId = &#63; and compatibleTag = &#63;.
	 *
	 * @param productId the product ID
	 * @param compatibleTag the compatible tag
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByProductCompatibility(long productId,
		String compatibleTag) throws SystemException {
		return findByProductCompatibility(productId, compatibleTag,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findByProductCompatibility(long productId,
		String compatibleTag, int start, int end) throws SystemException {
		return findByProductCompatibility(productId, compatibleTag, start, end,
			null);
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
	@Override
	public List<ProductParts> findByProductCompatibility(long productId,
		String compatibleTag, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY;
			finderArgs = new Object[] { productId, compatibleTag };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY;
			finderArgs = new Object[] {
					productId, compatibleTag,
					
					start, end, orderByComparator
				};
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if ((productId != productParts.getProductId()) ||
						!Validator.equals(compatibleTag,
							productParts.getCompatibleTag())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_PRODUCTID_2);

			boolean bindCompatibleTag = false;

			if (compatibleTag == null) {
				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_1);
			}
			else if (compatibleTag.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_3);
			}
			else {
				bindCompatibleTag = true;

				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (bindCompatibleTag) {
					qPos.add(compatibleTag);
				}

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where productId = &#63; and compatibleTag = &#63;.
	 *
	 * @param productId the product ID
	 * @param compatibleTag the compatible tag
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByProductCompatibility_First(long productId,
		String compatibleTag, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductCompatibility_First(productId,
				compatibleTag, orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productId=");
		msg.append(productId);

		msg.append(", compatibleTag=");
		msg.append(compatibleTag);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
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
	@Override
	public ProductParts fetchByProductCompatibility_First(long productId,
		String compatibleTag, OrderByComparator orderByComparator)
		throws SystemException {
		List<ProductParts> list = findByProductCompatibility(productId,
				compatibleTag, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByProductCompatibility_Last(long productId,
		String compatibleTag, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductCompatibility_Last(productId,
				compatibleTag, orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productId=");
		msg.append(productId);

		msg.append(", compatibleTag=");
		msg.append(compatibleTag);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
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
	@Override
	public ProductParts fetchByProductCompatibility_Last(long productId,
		String compatibleTag, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByProductCompatibility(productId, compatibleTag);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByProductCompatibility(productId,
				compatibleTag, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByProductCompatibility_PrevAndNext(long partId,
		long productId, String compatibleTag,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByProductCompatibility_PrevAndNext(session,
					productParts, productId, compatibleTag, orderByComparator,
					true);

			array[1] = productParts;

			array[2] = getByProductCompatibility_PrevAndNext(session,
					productParts, productId, compatibleTag, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByProductCompatibility_PrevAndNext(
		Session session, ProductParts productParts, long productId,
		String compatibleTag, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_PRODUCTID_2);

		boolean bindCompatibleTag = false;

		if (compatibleTag == null) {
			query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_1);
		}
		else if (compatibleTag.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_3);
		}
		else {
			bindCompatibleTag = true;

			query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_2);
		}

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(productId);

		if (bindCompatibleTag) {
			qPos.add(compatibleTag);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where productId = &#63; and compatibleTag = &#63; from the database.
	 *
	 * @param productId the product ID
	 * @param compatibleTag the compatible tag
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductCompatibility(long productId,
		String compatibleTag) throws SystemException {
		for (ProductParts productParts : findByProductCompatibility(productId,
				compatibleTag, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where productId = &#63; and compatibleTag = &#63;.
	 *
	 * @param productId the product ID
	 * @param compatibleTag the compatible tag
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductCompatibility(long productId, String compatibleTag)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTCOMPATIBILITY;

		Object[] finderArgs = new Object[] { productId, compatibleTag };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_PRODUCTID_2);

			boolean bindCompatibleTag = false;

			if (compatibleTag == null) {
				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_1);
			}
			else if (compatibleTag.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_3);
			}
			else {
				bindCompatibleTag = true;

				query.append(_FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (bindCompatibleTag) {
					qPos.add(compatibleTag);
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

	private static final String _FINDER_COLUMN_PRODUCTCOMPATIBILITY_PRODUCTID_2 = "productParts.productId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_1 =
		"productParts.compatibleTag IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_2 =
		"productParts.compatibleTag = ?";
	private static final String _FINDER_COLUMN_PRODUCTCOMPATIBILITY_COMPATIBLETAG_3 =
		"(productParts.compatibleTag IS NULL OR productParts.compatibleTag = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PRODUCTTAG = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByProductTag",
			new String[] { Long.class.getName(), String.class.getName() },
			ProductPartsModelImpl.PRODUCTID_COLUMN_BITMASK |
			ProductPartsModelImpl.TAGNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTTAG = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductTag",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the product parts where productId = &#63; and tagName = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	 *
	 * @param productId the product ID
	 * @param tagName the tag name
	 * @return the matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByProductTag(long productId, String tagName)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductTag(productId, tagName);

		if (productParts == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("productId=");
			msg.append(productId);

			msg.append(", tagName=");
			msg.append(tagName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchProductPartsException(msg.toString());
		}

		return productParts;
	}

	/**
	 * Returns the product parts where productId = &#63; and tagName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param productId the product ID
	 * @param tagName the tag name
	 * @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByProductTag(long productId, String tagName)
		throws SystemException {
		return fetchByProductTag(productId, tagName, true);
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
	@Override
	public ProductParts fetchByProductTag(long productId, String tagName,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { productId, tagName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
					finderArgs, this);
		}

		if (result instanceof ProductParts) {
			ProductParts productParts = (ProductParts)result;

			if ((productId != productParts.getProductId()) ||
					!Validator.equals(tagName, productParts.getTagName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTTAG_PRODUCTID_2);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (bindTagName) {
					qPos.add(tagName);
				}

				List<ProductParts> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ProductPartsPersistenceImpl.fetchByProductTag(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ProductParts productParts = list.get(0);

					result = productParts;

					cacheResult(productParts);

					if ((productParts.getProductId() != productId) ||
							(productParts.getTagName() == null) ||
							!productParts.getTagName().equals(tagName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
							finderArgs, productParts);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
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
			return (ProductParts)result;
		}
	}

	/**
	 * Removes the product parts where productId = &#63; and tagName = &#63; from the database.
	 *
	 * @param productId the product ID
	 * @param tagName the tag name
	 * @return the product parts that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts removeByProductTag(long productId, String tagName)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByProductTag(productId, tagName);

		return remove(productParts);
	}

	/**
	 * Returns the number of product partses where productId = &#63; and tagName = &#63;.
	 *
	 * @param productId the product ID
	 * @param tagName the tag name
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductTag(long productId, String tagName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTTAG;

		Object[] finderArgs = new Object[] { productId, tagName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTTAG_PRODUCTID_2);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_PRODUCTTAG_TAGNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (bindTagName) {
					qPos.add(tagName);
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

	private static final String _FINDER_COLUMN_PRODUCTTAG_PRODUCTID_2 = "productParts.productId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTTAG_TAGNAME_1 = "productParts.tagName IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTTAG_TAGNAME_2 = "productParts.tagName = ?";
	private static final String _FINDER_COLUMN_PRODUCTTAG_TAGNAME_3 = "(productParts.tagName IS NULL OR productParts.tagName = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PRODUCTNAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByProductName",
			new String[] { Long.class.getName(), String.class.getName() },
			ProductPartsModelImpl.PRODUCTID_COLUMN_BITMASK |
			ProductPartsModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTNAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductName",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the product parts where productId = &#63; and name = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	 *
	 * @param productId the product ID
	 * @param name the name
	 * @return the matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByProductName(long productId, String name)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByProductName(productId, name);

		if (productParts == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("productId=");
			msg.append(productId);

			msg.append(", name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchProductPartsException(msg.toString());
		}

		return productParts;
	}

	/**
	 * Returns the product parts where productId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param productId the product ID
	 * @param name the name
	 * @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByProductName(long productId, String name)
		throws SystemException {
		return fetchByProductName(productId, name, true);
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
	@Override
	public ProductParts fetchByProductName(long productId, String name,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { productId, name };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
					finderArgs, this);
		}

		if (result instanceof ProductParts) {
			ProductParts productParts = (ProductParts)result;

			if ((productId != productParts.getProductId()) ||
					!Validator.equals(name, productParts.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

				if (bindName) {
					qPos.add(name);
				}

				List<ProductParts> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ProductPartsPersistenceImpl.fetchByProductName(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ProductParts productParts = list.get(0);

					result = productParts;

					cacheResult(productParts);

					if ((productParts.getProductId() != productId) ||
							(productParts.getName() == null) ||
							!productParts.getName().equals(name)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
							finderArgs, productParts);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
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
			return (ProductParts)result;
		}
	}

	/**
	 * Removes the product parts where productId = &#63; and name = &#63; from the database.
	 *
	 * @param productId the product ID
	 * @param name the name
	 * @return the product parts that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts removeByProductName(long productId, String name)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByProductName(productId, name);

		return remove(productParts);
	}

	/**
	 * Returns the number of product partses where productId = &#63; and name = &#63;.
	 *
	 * @param productId the product ID
	 * @param name the name
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductName(long productId, String name)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTNAME;

		Object[] finderArgs = new Object[] { productId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTNAME_PRODUCTID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_PRODUCTNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(productId);

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

	private static final String _FINDER_COLUMN_PRODUCTNAME_PRODUCTID_2 = "productParts.productId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTNAME_NAME_1 = "productParts.name IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTNAME_NAME_2 = "productParts.name = ?";
	private static final String _FINDER_COLUMN_PRODUCTNAME_NAME_3 = "(productParts.name IS NULL OR productParts.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMON = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCommon",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMON =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCommon",
			new String[] { Boolean.class.getName() },
			ProductPartsModelImpl.ISCOMMON_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMMON = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCommon",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the product partses where isCommon = &#63;.
	 *
	 * @param isCommon the is common
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByCommon(Boolean isCommon)
		throws SystemException {
		return findByCommon(isCommon, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findByCommon(Boolean isCommon, int start, int end)
		throws SystemException {
		return findByCommon(isCommon, start, end, null);
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
	@Override
	public List<ProductParts> findByCommon(Boolean isCommon, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMON;
			finderArgs = new Object[] { isCommon };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMMON;
			finderArgs = new Object[] { isCommon, start, end, orderByComparator };
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if (!Validator.equals(isCommon, productParts.getIsCommon())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_COMMON_ISCOMMON_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isCommon.booleanValue());

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where isCommon = &#63;.
	 *
	 * @param isCommon the is common
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByCommon_First(Boolean isCommon,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByCommon_First(isCommon,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isCommon=");
		msg.append(isCommon);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the first product parts in the ordered set where isCommon = &#63;.
	 *
	 * @param isCommon the is common
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByCommon_First(Boolean isCommon,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductParts> list = findByCommon(isCommon, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByCommon_Last(Boolean isCommon,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByCommon_Last(isCommon,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("isCommon=");
		msg.append(isCommon);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the last product parts in the ordered set where isCommon = &#63;.
	 *
	 * @param isCommon the is common
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByCommon_Last(Boolean isCommon,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCommon(isCommon);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByCommon(isCommon, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByCommon_PrevAndNext(long partId,
		Boolean isCommon, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByCommon_PrevAndNext(session, productParts, isCommon,
					orderByComparator, true);

			array[1] = productParts;

			array[2] = getByCommon_PrevAndNext(session, productParts, isCommon,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByCommon_PrevAndNext(Session session,
		ProductParts productParts, Boolean isCommon,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		query.append(_FINDER_COLUMN_COMMON_ISCOMMON_2);

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isCommon.booleanValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where isCommon = &#63; from the database.
	 *
	 * @param isCommon the is common
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCommon(Boolean isCommon) throws SystemException {
		for (ProductParts productParts : findByCommon(isCommon,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where isCommon = &#63;.
	 *
	 * @param isCommon the is common
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCommon(Boolean isCommon) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMMON;

		Object[] finderArgs = new Object[] { isCommon };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_COMMON_ISCOMMON_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isCommon.booleanValue());

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

	private static final String _FINDER_COLUMN_COMMON_ISCOMMON_2 = "productParts.isCommon = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] { String.class.getName() },
			ProductPartsModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the product partses where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByName(String name) throws SystemException {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findByName(String name, int start, int end)
		throws SystemException {
		return findByName(name, start, end, null);
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
	@Override
	public List<ProductParts> findByName(String name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if (!Validator.equals(name, productParts.getName())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByName_First(name, orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the first product parts in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductParts> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByName_Last(name, orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the last product parts in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByName_PrevAndNext(long partId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByName_PrevAndNext(session, productParts, name,
					orderByComparator, true);

			array[1] = productParts;

			array[2] = getByName_PrevAndNext(session, productParts, name,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByName_PrevAndNext(Session session,
		ProductParts productParts, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAME_NAME_2);
		}

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByName(String name) throws SystemException {
		for (ProductParts productParts : findByName(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByName(String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "productParts.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "productParts.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(productParts.name IS NULL OR productParts.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAGNAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTagName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGNAME =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTagName",
			new String[] { String.class.getName() },
			ProductPartsModelImpl.TAGNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAGNAME = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTagName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the product partses where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByTagName(String tagName)
		throws SystemException {
		return findByTagName(tagName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findByTagName(String tagName, int start, int end)
		throws SystemException {
		return findByTagName(tagName, start, end, null);
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
	@Override
	public List<ProductParts> findByTagName(String tagName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGNAME;
			finderArgs = new Object[] { tagName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAGNAME;
			finderArgs = new Object[] { tagName, start, end, orderByComparator };
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if (!Validator.equals(tagName, productParts.getTagName())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagName) {
					qPos.add(tagName);
				}

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByTagName_First(String tagName,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByTagName_First(tagName,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagName=");
		msg.append(tagName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the first product parts in the ordered set where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByTagName_First(String tagName,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductParts> list = findByTagName(tagName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByTagName_Last(String tagName,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByTagName_Last(tagName,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagName=");
		msg.append(tagName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the last product parts in the ordered set where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByTagName_Last(String tagName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTagName(tagName);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByTagName(tagName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByTagName_PrevAndNext(long partId,
		String tagName, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByTagName_PrevAndNext(session, productParts, tagName,
					orderByComparator, true);

			array[1] = productParts;

			array[2] = getByTagName_PrevAndNext(session, productParts, tagName,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByTagName_PrevAndNext(Session session,
		ProductParts productParts, String tagName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		boolean bindTagName = false;

		if (tagName == null) {
			query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_1);
		}
		else if (tagName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_3);
		}
		else {
			bindTagName = true;

			query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_2);
		}

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTagName) {
			qPos.add(tagName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where tagName = &#63; from the database.
	 *
	 * @param tagName the tag name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTagName(String tagName) throws SystemException {
		for (ProductParts productParts : findByTagName(tagName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTagName(String tagName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAGNAME;

		Object[] finderArgs = new Object[] { tagName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagName) {
					qPos.add(tagName);
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

	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_1 = "productParts.tagName IS NULL";
	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_2 = "productParts.tagName = ?";
	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_3 = "(productParts.tagName IS NULL OR productParts.tagName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPATIBLETAG =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompatibleTag",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPATIBLETAG =
		new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompatibleTag",
			new String[] { String.class.getName() },
			ProductPartsModelImpl.COMPATIBLETAG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPATIBLETAG = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompatibleTag",
			new String[] { String.class.getName() });

	/**
	 * Returns all the product partses where compatibleTag = &#63;.
	 *
	 * @param compatibleTag the compatible tag
	 * @return the matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findByCompatibleTag(String compatibleTag)
		throws SystemException {
		return findByCompatibleTag(compatibleTag, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findByCompatibleTag(String compatibleTag,
		int start, int end) throws SystemException {
		return findByCompatibleTag(compatibleTag, start, end, null);
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
	@Override
	public List<ProductParts> findByCompatibleTag(String compatibleTag,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPATIBLETAG;
			finderArgs = new Object[] { compatibleTag };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPATIBLETAG;
			finderArgs = new Object[] {
					compatibleTag,
					
					start, end, orderByComparator
				};
		}

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ProductParts productParts : list) {
				if (!Validator.equals(compatibleTag,
							productParts.getCompatibleTag())) {
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

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			boolean bindCompatibleTag = false;

			if (compatibleTag == null) {
				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_1);
			}
			else if (compatibleTag.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_3);
			}
			else {
				bindCompatibleTag = true;

				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCompatibleTag) {
					qPos.add(compatibleTag);
				}

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first product parts in the ordered set where compatibleTag = &#63;.
	 *
	 * @param compatibleTag the compatible tag
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByCompatibleTag_First(String compatibleTag,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByCompatibleTag_First(compatibleTag,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compatibleTag=");
		msg.append(compatibleTag);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the first product parts in the ordered set where compatibleTag = &#63;.
	 *
	 * @param compatibleTag the compatible tag
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByCompatibleTag_First(String compatibleTag,
		OrderByComparator orderByComparator) throws SystemException {
		List<ProductParts> list = findByCompatibleTag(compatibleTag, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts findByCompatibleTag_Last(String compatibleTag,
		OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByCompatibleTag_Last(compatibleTag,
				orderByComparator);

		if (productParts != null) {
			return productParts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compatibleTag=");
		msg.append(compatibleTag);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProductPartsException(msg.toString());
	}

	/**
	 * Returns the last product parts in the ordered set where compatibleTag = &#63;.
	 *
	 * @param compatibleTag the compatible tag
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByCompatibleTag_Last(String compatibleTag,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompatibleTag(compatibleTag);

		if (count == 0) {
			return null;
		}

		List<ProductParts> list = findByCompatibleTag(compatibleTag, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ProductParts[] findByCompatibleTag_PrevAndNext(long partId,
		String compatibleTag, OrderByComparator orderByComparator)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPrimaryKey(partId);

		Session session = null;

		try {
			session = openSession();

			ProductParts[] array = new ProductPartsImpl[3];

			array[0] = getByCompatibleTag_PrevAndNext(session, productParts,
					compatibleTag, orderByComparator, true);

			array[1] = productParts;

			array[2] = getByCompatibleTag_PrevAndNext(session, productParts,
					compatibleTag, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductParts getByCompatibleTag_PrevAndNext(Session session,
		ProductParts productParts, String compatibleTag,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

		boolean bindCompatibleTag = false;

		if (compatibleTag == null) {
			query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_1);
		}
		else if (compatibleTag.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_3);
		}
		else {
			bindCompatibleTag = true;

			query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_2);
		}

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
			query.append(ProductPartsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCompatibleTag) {
			qPos.add(compatibleTag);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(productParts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ProductParts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the product partses where compatibleTag = &#63; from the database.
	 *
	 * @param compatibleTag the compatible tag
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompatibleTag(String compatibleTag)
		throws SystemException {
		for (ProductParts productParts : findByCompatibleTag(compatibleTag,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses where compatibleTag = &#63;.
	 *
	 * @param compatibleTag the compatible tag
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompatibleTag(String compatibleTag)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPATIBLETAG;

		Object[] finderArgs = new Object[] { compatibleTag };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			boolean bindCompatibleTag = false;

			if (compatibleTag == null) {
				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_1);
			}
			else if (compatibleTag.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_3);
			}
			else {
				bindCompatibleTag = true;

				query.append(_FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCompatibleTag) {
					qPos.add(compatibleTag);
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

	private static final String _FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_1 = "productParts.compatibleTag IS NULL";
	private static final String _FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_2 = "productParts.compatibleTag = ?";
	private static final String _FINDER_COLUMN_COMPATIBLETAG_COMPATIBLETAG_3 = "(productParts.compatibleTag IS NULL OR productParts.compatibleTag = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PARTID = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, ProductPartsImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByPartId",
			new String[] { Long.class.getName() },
			ProductPartsModelImpl.PARTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PARTID = new FinderPath(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPartId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the product parts where partId = &#63; or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	 *
	 * @param partId the part ID
	 * @return the matching product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByPartId(long partId)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByPartId(partId);

		if (productParts == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("partId=");
			msg.append(partId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchProductPartsException(msg.toString());
		}

		return productParts;
	}

	/**
	 * Returns the product parts where partId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param partId the part ID
	 * @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByPartId(long partId) throws SystemException {
		return fetchByPartId(partId, true);
	}

	/**
	 * Returns the product parts where partId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param partId the part ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching product parts, or <code>null</code> if a matching product parts could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByPartId(long partId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { partId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PARTID,
					finderArgs, this);
		}

		if (result instanceof ProductParts) {
			ProductParts productParts = (ProductParts)result;

			if ((partId != productParts.getPartId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PARTID_PARTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(partId);

				List<ProductParts> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ProductPartsPersistenceImpl.fetchByPartId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ProductParts productParts = list.get(0);

					result = productParts;

					cacheResult(productParts);

					if ((productParts.getPartId() != partId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTID,
							finderArgs, productParts);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTID,
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
			return (ProductParts)result;
		}
	}

	/**
	 * Removes the product parts where partId = &#63; from the database.
	 *
	 * @param partId the part ID
	 * @return the product parts that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts removeByPartId(long partId)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = findByPartId(partId);

		return remove(productParts);
	}

	/**
	 * Returns the number of product partses where partId = &#63;.
	 *
	 * @param partId the part ID
	 * @return the number of matching product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPartId(long partId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PARTID;

		Object[] finderArgs = new Object[] { partId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRODUCTPARTS_WHERE);

			query.append(_FINDER_COLUMN_PARTID_PARTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(partId);

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

	private static final String _FINDER_COLUMN_PARTID_PARTID_2 = "productParts.partId = ?";

	public ProductPartsPersistenceImpl() {
		setModelClass(ProductParts.class);
	}

	/**
	 * Caches the product parts in the entity cache if it is enabled.
	 *
	 * @param productParts the product parts
	 */
	@Override
	public void cacheResult(ProductParts productParts) {
		EntityCacheUtil.putResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsImpl.class, productParts.getPrimaryKey(), productParts);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
			new Object[] { productParts.getProductId(), productParts.getTagName() },
			productParts);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
			new Object[] { productParts.getProductId(), productParts.getName() },
			productParts);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTID,
			new Object[] { productParts.getPartId() }, productParts);

		productParts.resetOriginalValues();
	}

	/**
	 * Caches the product partses in the entity cache if it is enabled.
	 *
	 * @param productPartses the product partses
	 */
	@Override
	public void cacheResult(List<ProductParts> productPartses) {
		for (ProductParts productParts : productPartses) {
			if (EntityCacheUtil.getResult(
						ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
						ProductPartsImpl.class, productParts.getPrimaryKey()) == null) {
				cacheResult(productParts);
			}
			else {
				productParts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all product partses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProductPartsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProductPartsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the product parts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductParts productParts) {
		EntityCacheUtil.removeResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsImpl.class, productParts.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(productParts);
	}

	@Override
	public void clearCache(List<ProductParts> productPartses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProductParts productParts : productPartses) {
			EntityCacheUtil.removeResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
				ProductPartsImpl.class, productParts.getPrimaryKey());

			clearUniqueFindersCache(productParts);
		}
	}

	protected void cacheUniqueFindersCache(ProductParts productParts) {
		if (productParts.isNew()) {
			Object[] args = new Object[] {
					productParts.getProductId(), productParts.getTagName()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTTAG, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTTAG, args,
				productParts);

			args = new Object[] {
					productParts.getProductId(), productParts.getName()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTNAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTNAME, args,
				productParts);

			args = new Object[] { productParts.getPartId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARTID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTID, args,
				productParts);
		}
		else {
			ProductPartsModelImpl productPartsModelImpl = (ProductPartsModelImpl)productParts;

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PRODUCTTAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productParts.getProductId(), productParts.getTagName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTTAG,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTTAG,
					args, productParts);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PRODUCTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productParts.getProductId(), productParts.getName()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PRODUCTNAME,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PRODUCTNAME,
					args, productParts);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PARTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { productParts.getPartId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARTID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PARTID, args,
					productParts);
			}
		}
	}

	protected void clearUniqueFindersCache(ProductParts productParts) {
		ProductPartsModelImpl productPartsModelImpl = (ProductPartsModelImpl)productParts;

		Object[] args = new Object[] {
				productParts.getProductId(), productParts.getTagName()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTTAG, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTTAG, args);

		if ((productPartsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PRODUCTTAG.getColumnBitmask()) != 0) {
			args = new Object[] {
					productPartsModelImpl.getOriginalProductId(),
					productPartsModelImpl.getOriginalTagName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTTAG, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTTAG, args);
		}

		args = new Object[] { productParts.getProductId(), productParts.getName() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTNAME, args);

		if ((productPartsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PRODUCTNAME.getColumnBitmask()) != 0) {
			args = new Object[] {
					productPartsModelImpl.getOriginalProductId(),
					productPartsModelImpl.getOriginalName()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTNAME, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PRODUCTNAME, args);
		}

		args = new Object[] { productParts.getPartId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTID, args);

		if ((productPartsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PARTID.getColumnBitmask()) != 0) {
			args = new Object[] { productPartsModelImpl.getOriginalPartId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PARTID, args);
		}
	}

	/**
	 * Creates a new product parts with the primary key. Does not add the product parts to the database.
	 *
	 * @param partId the primary key for the new product parts
	 * @return the new product parts
	 */
	@Override
	public ProductParts create(long partId) {
		ProductParts productParts = new ProductPartsImpl();

		productParts.setNew(true);
		productParts.setPrimaryKey(partId);

		return productParts;
	}

	/**
	 * Removes the product parts with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param partId the primary key of the product parts
	 * @return the product parts that was removed
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts remove(long partId)
		throws NoSuchProductPartsException, SystemException {
		return remove((Serializable)partId);
	}

	/**
	 * Removes the product parts with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the product parts
	 * @return the product parts that was removed
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts remove(Serializable primaryKey)
		throws NoSuchProductPartsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProductParts productParts = (ProductParts)session.get(ProductPartsImpl.class,
					primaryKey);

			if (productParts == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductPartsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(productParts);
		}
		catch (NoSuchProductPartsException nsee) {
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
	protected ProductParts removeImpl(ProductParts productParts)
		throws SystemException {
		productParts = toUnwrappedModel(productParts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productParts)) {
				productParts = (ProductParts)session.get(ProductPartsImpl.class,
						productParts.getPrimaryKeyObj());
			}

			if (productParts != null) {
				session.delete(productParts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (productParts != null) {
			clearCache(productParts);
		}

		return productParts;
	}

	@Override
	public ProductParts updateImpl(
		com.skilltailor.shopping.product.model.ProductParts productParts)
		throws SystemException {
		productParts = toUnwrappedModel(productParts);

		boolean isNew = productParts.isNew();

		ProductPartsModelImpl productPartsModelImpl = (ProductPartsModelImpl)productParts;

		Session session = null;

		try {
			session = openSession();

			if (productParts.isNew()) {
				session.save(productParts);

				productParts.setNew(false);
			}
			else {
				session.merge(productParts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProductPartsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalProductId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTID,
					args);

				args = new Object[] { productPartsModelImpl.getProductId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTID,
					args);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalProductId(),
						productPartsModelImpl.getOriginalCompatibleTag()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCOMPATIBILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY,
					args);

				args = new Object[] {
						productPartsModelImpl.getProductId(),
						productPartsModelImpl.getCompatibleTag()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCOMPATIBILITY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCOMPATIBILITY,
					args);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMON.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalIsCommon()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMMON, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMON,
					args);

				args = new Object[] { productPartsModelImpl.getIsCommon() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMMON, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMMON,
					args);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] { productPartsModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalTagName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGNAME,
					args);

				args = new Object[] { productPartsModelImpl.getTagName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGNAME,
					args);
			}

			if ((productPartsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPATIBLETAG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						productPartsModelImpl.getOriginalCompatibleTag()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPATIBLETAG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPATIBLETAG,
					args);

				args = new Object[] { productPartsModelImpl.getCompatibleTag() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPATIBLETAG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPATIBLETAG,
					args);
			}
		}

		EntityCacheUtil.putResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
			ProductPartsImpl.class, productParts.getPrimaryKey(), productParts);

		clearUniqueFindersCache(productParts);
		cacheUniqueFindersCache(productParts);

		return productParts;
	}

	protected ProductParts toUnwrappedModel(ProductParts productParts) {
		if (productParts instanceof ProductPartsImpl) {
			return productParts;
		}

		ProductPartsImpl productPartsImpl = new ProductPartsImpl();

		productPartsImpl.setNew(productParts.isNew());
		productPartsImpl.setPrimaryKey(productParts.getPrimaryKey());

		productPartsImpl.setPartId(productParts.getPartId());
		productPartsImpl.setProductId(productParts.getProductId());
		productPartsImpl.setName(productParts.getName());
		productPartsImpl.setValues(productParts.getValues());
		productPartsImpl.setDescription(productParts.getDescription());
		productPartsImpl.setHasAdditionalCost(productParts.getHasAdditionalCost());
		productPartsImpl.setAdditionalCost(productParts.getAdditionalCost());
		productPartsImpl.setIsCommon(productParts.getIsCommon());
		productPartsImpl.setSequence(productParts.getSequence());
		productPartsImpl.setTagName(productParts.getTagName());
		productPartsImpl.setCompatibleTag(productParts.getCompatibleTag());

		return productPartsImpl;
	}

	/**
	 * Returns the product parts with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the product parts
	 * @return the product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductPartsException, SystemException {
		ProductParts productParts = fetchByPrimaryKey(primaryKey);

		if (productParts == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductPartsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return productParts;
	}

	/**
	 * Returns the product parts with the primary key or throws a {@link com.skilltailor.shopping.product.NoSuchProductPartsException} if it could not be found.
	 *
	 * @param partId the primary key of the product parts
	 * @return the product parts
	 * @throws com.skilltailor.shopping.product.NoSuchProductPartsException if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts findByPrimaryKey(long partId)
		throws NoSuchProductPartsException, SystemException {
		return findByPrimaryKey((Serializable)partId);
	}

	/**
	 * Returns the product parts with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the product parts
	 * @return the product parts, or <code>null</code> if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProductParts productParts = (ProductParts)EntityCacheUtil.getResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
				ProductPartsImpl.class, primaryKey);

		if (productParts == _nullProductParts) {
			return null;
		}

		if (productParts == null) {
			Session session = null;

			try {
				session = openSession();

				productParts = (ProductParts)session.get(ProductPartsImpl.class,
						primaryKey);

				if (productParts != null) {
					cacheResult(productParts);
				}
				else {
					EntityCacheUtil.putResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
						ProductPartsImpl.class, primaryKey, _nullProductParts);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProductPartsModelImpl.ENTITY_CACHE_ENABLED,
					ProductPartsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return productParts;
	}

	/**
	 * Returns the product parts with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param partId the primary key of the product parts
	 * @return the product parts, or <code>null</code> if a product parts with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProductParts fetchByPrimaryKey(long partId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)partId);
	}

	/**
	 * Returns all the product partses.
	 *
	 * @return the product partses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProductParts> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ProductParts> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ProductParts> findAll(int start, int end,
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

		List<ProductParts> list = (List<ProductParts>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRODUCTPARTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTPARTS;

				if (pagination) {
					sql = sql.concat(ProductPartsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProductParts>(list);
				}
				else {
					list = (List<ProductParts>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the product partses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProductParts productParts : findAll()) {
			remove(productParts);
		}
	}

	/**
	 * Returns the number of product partses.
	 *
	 * @return the number of product partses
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

				Query q = session.createQuery(_SQL_COUNT_PRODUCTPARTS);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the product parts persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.skilltailor.shopping.product.model.ProductParts")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProductParts>> listenersList = new ArrayList<ModelListener<ProductParts>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProductParts>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProductPartsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRODUCTPARTS = "SELECT productParts FROM ProductParts productParts";
	private static final String _SQL_SELECT_PRODUCTPARTS_WHERE = "SELECT productParts FROM ProductParts productParts WHERE ";
	private static final String _SQL_COUNT_PRODUCTPARTS = "SELECT COUNT(productParts) FROM ProductParts productParts";
	private static final String _SQL_COUNT_PRODUCTPARTS_WHERE = "SELECT COUNT(productParts) FROM ProductParts productParts WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "productParts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProductParts exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ProductParts exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProductPartsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"values"
			});
	private static ProductParts _nullProductParts = new ProductPartsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProductParts> toCacheModel() {
				return _nullProductPartsCacheModel;
			}
		};

	private static CacheModel<ProductParts> _nullProductPartsCacheModel = new CacheModel<ProductParts>() {
			@Override
			public ProductParts toEntityModel() {
				return _nullProductParts;
			}
		};
}
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

package com.bryoag.shopping.image.service.persistence;

import com.bryoag.shopping.image.model.Image;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the image service. This utility wraps {@link ImagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see ImagePersistence
 * @see ImagePersistenceImpl
 * @generated
 */
public class ImageUtil {
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
	public static void clearCache(Image image) {
		getPersistence().clearCache(image);
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
	public static List<Image> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Image> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Image> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Image update(Image image) throws SystemException {
		return getPersistence().update(image);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Image update(Image image, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(image, serviceContext);
	}

	/**
	* Returns all the images where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the images where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the images where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the images before and after the current image in the ordered set where groupId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image[] findByGroupId_PrevAndNext(
		long imageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(imageId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the images where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of images where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the images where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetId(
		long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId(assetId);
	}

	/**
	* Returns a range of all the images where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetId(
		long assetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId(assetId, start, end);
	}

	/**
	* Returns an ordered range of all the images where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetId(
		long assetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetId(assetId, start, end, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId_First(assetId, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAssetId_First(assetId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetId_Last(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId_Last(assetId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetId_Last(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAssetId_Last(assetId, orderByComparator);
	}

	/**
	* Returns the images before and after the current image in the ordered set where assetId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image[] findByAssetId_PrevAndNext(
		long imageId, long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetId_PrevAndNext(imageId, assetId,
			orderByComparator);
	}

	/**
	* Removes all the images where assetId = &#63; from the database.
	*
	* @param assetId the asset ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssetId(assetId);
	}

	/**
	* Returns the number of images where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssetId(assetId);
	}

	/**
	* Returns all the images where assetType = &#63;.
	*
	* @param assetType the asset type
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetType(
		java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetType(assetType);
	}

	/**
	* Returns a range of all the images where assetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetType the asset type
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetType(
		java.lang.String assetType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetType(assetType, start, end);
	}

	/**
	* Returns an ordered range of all the images where assetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetType the asset type
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetType(
		java.lang.String assetType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetType(assetType, start, end, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetType = &#63;.
	*
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetType_First(
		java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetType_First(assetType, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetType = &#63;.
	*
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetType_First(
		java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetType_First(assetType, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetType = &#63;.
	*
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetType_Last(
		java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetType_Last(assetType, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetType = &#63;.
	*
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetType_Last(
		java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetType_Last(assetType, orderByComparator);
	}

	/**
	* Returns the images before and after the current image in the ordered set where assetType = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image[] findByAssetType_PrevAndNext(
		long imageId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetType_PrevAndNext(imageId, assetType,
			orderByComparator);
	}

	/**
	* Removes all the images where assetType = &#63; from the database.
	*
	* @param assetType the asset type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssetType(java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssetType(assetType);
	}

	/**
	* Returns the number of images where assetType = &#63;.
	*
	* @param assetType the asset type
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetType(java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssetType(assetType);
	}

	/**
	* Returns all the images where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetIdType(
		long assetId, java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetIdType(assetId, assetType);
	}

	/**
	* Returns a range of all the images where assetId = &#63; and assetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetIdType(
		long assetId, java.lang.String assetType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetIdType(assetId, assetType, start, end);
	}

	/**
	* Returns an ordered range of all the images where assetId = &#63; and assetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByAssetIdType(
		long assetId, java.lang.String assetType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetIdType(assetId, assetType, start, end,
			orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetIdType_First(
		long assetId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetIdType_First(assetId, assetType,
			orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetIdType_First(
		long assetId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetIdType_First(assetId, assetType,
			orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByAssetIdType_Last(
		long assetId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetIdType_Last(assetId, assetType, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByAssetIdType_Last(
		long assetId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetIdType_Last(assetId, assetType,
			orderByComparator);
	}

	/**
	* Returns the images before and after the current image in the ordered set where assetId = &#63; and assetType = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param assetId the asset ID
	* @param assetType the asset type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image[] findByAssetIdType_PrevAndNext(
		long imageId, long assetId, java.lang.String assetType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetIdType_PrevAndNext(imageId, assetId, assetType,
			orderByComparator);
	}

	/**
	* Removes all the images where assetId = &#63; and assetType = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssetIdType(long assetId,
		java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssetIdType(assetId, assetType);
	}

	/**
	* Returns the number of images where assetId = &#63; and assetType = &#63;.
	*
	* @param assetId the asset ID
	* @param assetType the asset type
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetIdType(long assetId,
		java.lang.String assetType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssetIdType(assetId, assetType);
	}

	/**
	* Returns the image where imageId = &#63; or throws a {@link com.bryoag.shopping.image.NoSuchImageException} if it could not be found.
	*
	* @param imageId the image ID
	* @return the matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findById(long imageId)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(imageId);
	}

	/**
	* Returns the image where imageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param imageId the image ID
	* @return the matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchById(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById(imageId);
	}

	/**
	* Returns the image where imageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param imageId the image ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchById(
		long imageId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById(imageId, retrieveFromCache);
	}

	/**
	* Removes the image where imageId = &#63; from the database.
	*
	* @param imageId the image ID
	* @return the image that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image removeById(long imageId)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeById(imageId);
	}

	/**
	* Returns the number of images where imageId = &#63;.
	*
	* @param imageId the image ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countById(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countById(imageId);
	}

	/**
	* Returns all the images where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the images where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the images where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the images before and after the current image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image[] findByC_G_PrevAndNext(
		long imageId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G_PrevAndNext(imageId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the images where companyId = &#63; and groupId = &#63; from the database.
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
	* Returns the number of images where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Caches the image in the entity cache if it is enabled.
	*
	* @param image the image
	*/
	public static void cacheResult(com.bryoag.shopping.image.model.Image image) {
		getPersistence().cacheResult(image);
	}

	/**
	* Caches the images in the entity cache if it is enabled.
	*
	* @param images the images
	*/
	public static void cacheResult(
		java.util.List<com.bryoag.shopping.image.model.Image> images) {
		getPersistence().cacheResult(images);
	}

	/**
	* Creates a new image with the primary key. Does not add the image to the database.
	*
	* @param imageId the primary key for the new image
	* @return the new image
	*/
	public static com.bryoag.shopping.image.model.Image create(long imageId) {
		return getPersistence().create(imageId);
	}

	/**
	* Removes the image with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param imageId the primary key of the image
	* @return the image that was removed
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image remove(long imageId)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(imageId);
	}

	public static com.bryoag.shopping.image.model.Image updateImpl(
		com.bryoag.shopping.image.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(image);
	}

	/**
	* Returns the image with the primary key or throws a {@link com.bryoag.shopping.image.NoSuchImageException} if it could not be found.
	*
	* @param imageId the primary key of the image
	* @return the image
	* @throws com.bryoag.shopping.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image findByPrimaryKey(
		long imageId)
		throws com.bryoag.shopping.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(imageId);
	}

	/**
	* Returns the image with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param imageId the primary key of the image
	* @return the image, or <code>null</code> if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.bryoag.shopping.image.model.Image fetchByPrimaryKey(
		long imageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(imageId);
	}

	/**
	* Returns all the images.
	*
	* @return the images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.shopping.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of images
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.bryoag.shopping.image.model.Image> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the images from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of images.
	*
	* @return the number of images
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ImagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ImagePersistence)PortletBeanLocatorUtil.locate(com.bryoag.shopping.image.service.ClpSerializer.getServletContextName(),
					ImagePersistence.class.getName());

			ReferenceRegistry.registerReference(ImageUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ImagePersistence persistence) {
	}

	private static ImagePersistence _persistence;
}
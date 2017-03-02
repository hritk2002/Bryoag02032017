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

package com.bryoag.image.service.persistence;

import com.bryoag.image.model.Image;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the image service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepakgupta02
 * @see ImagePersistenceImpl
 * @see ImageUtil
 * @generated
 */
public interface ImagePersistence extends BasePersistence<Image> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ImageUtil} to access the image persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the images where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the images before and after the current image in the ordered set where groupId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image[] findByGroupId_PrevAndNext(
		long imageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the images where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategory(
		long categoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategory(
		long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByCategory_First(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByCategory_First(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByCategory_Last(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByCategory_Last(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the images before and after the current image in the ordered set where categoryId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image[] findByCategory_PrevAndNext(
		long imageId, long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the images where productId = &#63;.
	*
	* @param productId the product ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByProduct(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByProduct(
		long productId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByProduct(
		long productId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByProduct_First(long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByProduct_First(long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByProduct_Last(long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByProduct_Last(long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the images before and after the current image in the ordered set where productId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image[] findByProduct_PrevAndNext(
		long imageId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images where productId = &#63; from the database.
	*
	* @param productId the product ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProduct(long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where productId = &#63;.
	*
	* @param productId the product ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countByProduct(long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the image where imageId = &#63; or throws a {@link com.bryoag.image.NoSuchImageException} if it could not be found.
	*
	* @param imageId the image ID
	* @return the matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findById(long imageId)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the image where imageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param imageId the image ID
	* @return the matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchById(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the image where imageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param imageId the image ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchById(long imageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the image where imageId = &#63; from the database.
	*
	* @param imageId the image ID
	* @return the image that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image removeById(long imageId)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where imageId = &#63;.
	*
	* @param imageId the image ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countById(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the images where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List<com.bryoag.image.model.Image> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByC_G_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByC_G_Last(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the images before and after the current image in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image[] findByC_G_PrevAndNext(long imageId,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the images where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @return the matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategoryProduct(
		long categoryId, long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images where categoryId = &#63; and productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategoryProduct(
		long categoryId, long productId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images where categoryId = &#63; and productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findByCategoryProduct(
		long categoryId, long productId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByCategoryProduct_First(
		long categoryId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first image in the ordered set where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByCategoryProduct_First(
		long categoryId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image
	* @throws com.bryoag.image.NoSuchImageException if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByCategoryProduct_Last(
		long categoryId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last image in the ordered set where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching image, or <code>null</code> if a matching image could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByCategoryProduct_Last(
		long categoryId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the images before and after the current image in the ordered set where categoryId = &#63; and productId = &#63;.
	*
	* @param imageId the primary key of the current image
	* @param categoryId the category ID
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image[] findByCategoryProduct_PrevAndNext(
		long imageId, long categoryId, long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images where categoryId = &#63; and productId = &#63; from the database.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCategoryProduct(long categoryId, long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images where categoryId = &#63; and productId = &#63;.
	*
	* @param categoryId the category ID
	* @param productId the product ID
	* @return the number of matching images
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategoryProduct(long categoryId, long productId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the image in the entity cache if it is enabled.
	*
	* @param image the image
	*/
	public void cacheResult(com.bryoag.image.model.Image image);

	/**
	* Caches the images in the entity cache if it is enabled.
	*
	* @param images the images
	*/
	public void cacheResult(java.util.List<com.bryoag.image.model.Image> images);

	/**
	* Creates a new image with the primary key. Does not add the image to the database.
	*
	* @param imageId the primary key for the new image
	* @return the new image
	*/
	public com.bryoag.image.model.Image create(long imageId);

	/**
	* Removes the image with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param imageId the primary key of the image
	* @return the image that was removed
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image remove(long imageId)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.bryoag.image.model.Image updateImpl(
		com.bryoag.image.model.Image image)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the image with the primary key or throws a {@link com.bryoag.image.NoSuchImageException} if it could not be found.
	*
	* @param imageId the primary key of the image
	* @return the image
	* @throws com.bryoag.image.NoSuchImageException if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image findByPrimaryKey(long imageId)
		throws com.bryoag.image.NoSuchImageException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the image with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param imageId the primary key of the image
	* @return the image, or <code>null</code> if a image with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.bryoag.image.model.Image fetchByPrimaryKey(long imageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the images.
	*
	* @return the images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bryoag.image.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of images
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.bryoag.image.model.Image> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the images from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of images.
	*
	* @return the number of images
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
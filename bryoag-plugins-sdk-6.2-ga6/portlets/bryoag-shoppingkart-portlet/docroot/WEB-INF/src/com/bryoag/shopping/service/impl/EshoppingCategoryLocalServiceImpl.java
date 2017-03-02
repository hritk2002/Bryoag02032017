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

package com.bryoag.shopping.service.impl;

import com.bryoag.shopping.model.EshoppingCategory;
import com.bryoag.shopping.service.base.EshoppingCategoryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.shopping.CategoryNameException;
import com.liferay.portlet.shopping.model.ShoppingCategory;
import com.liferay.portlet.shopping.model.ShoppingCategoryConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the eshopping category local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun
 * ServiceBuilder to copy their definitions into the
 * {@link com.bryoag.shopping.service.EshoppingCategoryLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the
 * propagated JAAS credentials because this service can only be accessed from within the same
 * VM.
 * </p>
 *
 * @author deepakgupta02
 * @see com.bryoag.shopping.service.base.EshoppingCategoryLocalServiceBaseImpl
 * @see com.bryoag.shopping.service.EshoppingCategoryLocalServiceUtil
 */
public class EshoppingCategoryLocalServiceImpl extends EshoppingCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link
	 * com.bryoag.shopping.service.EshoppingCategoryLocalServiceUtil} to access the eshopping
	 * category local service.
	 */
	public EshoppingCategory addCategory(long userId, long parentCategoryId, String name, String description,
			ServiceContext serviceContext) throws PortalException, SystemException {

		// Category

		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = serviceContext.getScopeGroupId();
		parentCategoryId = getParentCategoryId(groupId, parentCategoryId);
		Date now = new Date();

		validate(name);

		long categoryId = counterLocalService.increment();

		EshoppingCategory category = eshoppingCategoryPersistence.create(categoryId);

		category.setGroupId(groupId);
		category.setCompanyId(user.getCompanyId());
		category.setUserId(user.getUserId());
		category.setUserName(user.getFullName());
		category.setCreateDate(now);
		category.setModifiedDate(now);
		category.setParentCategoryId(parentCategoryId);
		category.setName(name);
		category.setDescription(description);

		eshoppingCategoryPersistence.update(category);

		// Resources

		if (serviceContext.isAddGroupPermissions() || serviceContext.isAddGuestPermissions()) {

			addCategoryResources(categoryId, serviceContext.isAddGroupPermissions(),
					serviceContext.isAddGuestPermissions());
		} else {
			addCategoryResources(categoryId, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());
		}

		return category;
	}

	public void addCategoryResources(long categoryId, boolean addGroupPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		addCategoryResources(categoryId, addGroupPermissions, addGuestPermissions);
	}

	public void addCategoryResources(long categoryId, String[] groupPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		addCategoryResources(categoryId, groupPermissions, guestPermissions);
	}

	public void
			addCategoryResources(ShoppingCategory category, boolean addGroupPermissions, boolean addGuestPermissions)
					throws PortalException, SystemException {

		resourceLocalService.addResources(category.getCompanyId(), category.getGroupId(), category.getUserId(),
				ShoppingCategory.class.getName(), category.getCategoryId(), false, addGroupPermissions,
				addGuestPermissions);
	}

	public void addCategoryResources(ShoppingCategory category, String[] groupPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(category.getCompanyId(), category.getGroupId(), category.getUserId(),
				ShoppingCategory.class.getName(), category.getCategoryId(), groupPermissions, guestPermissions);
	}

	public void deleteCategories(long groupId) throws PortalException, SystemException {

		List<EshoppingCategory> categories = eshoppingCategoryPersistence.findByGroupId(groupId);

		for (EshoppingCategory category : categories) {
			deleteCategory(category.getCategoryId());
		}
	}

	public void deleteCategory(long categoryId) throws PortalException, SystemException {

		deleteCategory(categoryId);
	}

	public void deleteCategory(EshoppingCategory category) throws PortalException, SystemException {

		// Categories

		EshoppingCategory categories =
				eshoppingCategoryPersistence.findBycategoryId(category.getCategoryId(), category.getGroupId());

		deleteCategory(categories);

		// Category

		eshoppingCategoryPersistence.remove(category);

		// Resources

		resourceLocalService.deleteResource(category.getCompanyId(), ShoppingCategory.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, category.getCategoryId());

		// Future Reference

		// shoppingItemLocalService.deleteItems(category.getGroupId(),
		// category.getCategoryId());
	}

	public List<EshoppingCategory> getCategories(long groupId) throws SystemException {

		return eshoppingCategoryPersistence.findByGroupId(groupId);
	}

	public EshoppingCategory getCategory(long categoryId) throws PortalException, SystemException {

		return eshoppingCategoryPersistence.findByPrimaryKey(categoryId);
	}

	public EshoppingCategory getCategory(long groupId, String categoryName) throws SystemException {

		return eshoppingCategoryPersistence.fetchByCategoryName(groupId, categoryName);
	}

	public List<EshoppingCategory> getParentCategories(long categoryId) throws PortalException, SystemException {

		return getParentCategories(eshoppingCategoryPersistence.findByPrimaryKey(categoryId));
	}

	public List<EshoppingCategory> getParentCategories(EshoppingCategory category) throws PortalException,
			SystemException {

		List<EshoppingCategory> parentCategories = new ArrayList<EshoppingCategory>();

		EshoppingCategory tempCategory = category;

		while (true) {
			parentCategories.add(tempCategory);

			if (tempCategory.getParentCategoryId() == ShoppingCategoryConstants.DEFAULT_PARENT_CATEGORY_ID) {

				break;
			}

			tempCategory = eshoppingCategoryPersistence.findByPrimaryKey(tempCategory.getParentCategoryId());
		}

		Collections.reverse(parentCategories);

		return parentCategories;
	}

	public EshoppingCategory getParentCategory(EshoppingCategory category) throws PortalException, SystemException {

		EshoppingCategory parentCategory =
				eshoppingCategoryPersistence.findByPrimaryKey(category.getParentCategoryId());

		return parentCategory;
	}

	public void getSubcategoryIds(List<Long> categoryIds, long groupId, long categoryId) throws SystemException {

		List<EshoppingCategory> categories = eshoppingCategoryPersistence.findByG_P(groupId, categoryId);

		for (EshoppingCategory category : categories) {
			categoryIds.add(category.getCategoryId());

			getSubcategoryIds(categoryIds, category.getGroupId(), category.getCategoryId());
		}
	}

	public EshoppingCategory updateCategory(long categoryId, long parentCategoryId, String name, String description,
			boolean mergeWithParentCategory, ServiceContext serviceContext) throws PortalException, SystemException {

		// Merge categories

		EshoppingCategory category = eshoppingCategoryPersistence.findByPrimaryKey(categoryId);

		parentCategoryId = getParentCategoryId(categoryId, parentCategoryId);

		if (mergeWithParentCategory && (categoryId != parentCategoryId)
				&& (parentCategoryId != ShoppingCategoryConstants.DEFAULT_PARENT_CATEGORY_ID)) {

			// mergeCategories(category, parentCategoryId);

			return category;
		}

		// Category

		validate(name);

		category.setModifiedDate(new Date());
		category.setParentCategoryId(parentCategoryId);
		category.setName(name);
		category.setDescription(description);

		eshoppingCategoryPersistence.update(category);

		return category;
	}

	protected long getParentCategoryId(long groupId, long parentCategoryId) throws SystemException {

		if (parentCategoryId != ShoppingCategoryConstants.DEFAULT_PARENT_CATEGORY_ID) {

			EshoppingCategory parentCategory = eshoppingCategoryPersistence.fetchByPrimaryKey(parentCategoryId);

			if ((parentCategory == null) || (groupId != parentCategory.getGroupId())) {

				parentCategoryId = ShoppingCategoryConstants.DEFAULT_PARENT_CATEGORY_ID;
			}
		}

		return parentCategoryId;
	}

	protected long getParentCategoryId(EshoppingCategory category, long parentCategoryId) throws SystemException {

		if (parentCategoryId == ShoppingCategoryConstants.DEFAULT_PARENT_CATEGORY_ID) {

			return parentCategoryId;
		}

		if (category.getCategoryId() == parentCategoryId) {
			return category.getParentCategoryId();
		}

		EshoppingCategory parentCategory = eshoppingCategoryPersistence.fetchByPrimaryKey(parentCategoryId);

		if ((parentCategory == null) || (category.getGroupId() != parentCategory.getGroupId())) {

			return category.getParentCategoryId();
		}

		List<Long> subcategoryIds = new ArrayList<Long>();

		getSubcategoryIds(subcategoryIds, category.getGroupId(), category.getCategoryId());

		if (subcategoryIds.contains(parentCategoryId)) {
			return category.getParentCategoryId();
		}

		return parentCategoryId;
	}

	// protected void mergeCategories(ShoppingCategory fromCategory, long toCategoryId) throws
	// PortalException,
	// SystemException {
	//
	// List<EshoppingCategory> categories =
	// eshoppingCategoryPersistence.findByG_P(fromCategory.getGroupId(),
	// fromCategory.getCategoryId());
	//
	// for (EshoppingCategory category : categories) {
	// mergeCategories(category, toCategoryId);
	// }
	//
	// List<ShoppingItem> items =
	// eshoppingItemPersistence.findByG_C(fromCategory.getGroupId(),
	// fromCategory.getCategoryId());
	//
	// for (ShoppingItem item : items) {
	//
	// // Item
	//
	// item.setCategoryId(toCategoryId);
	//
	// shoppingItemPersistence.update(item);
	// }
	//
	// deleteCategory(fromCategory);
	// }

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name) || name.contains("\\\\") || name.contains("//")) {

			throw new CategoryNameException();
		}
	}

}

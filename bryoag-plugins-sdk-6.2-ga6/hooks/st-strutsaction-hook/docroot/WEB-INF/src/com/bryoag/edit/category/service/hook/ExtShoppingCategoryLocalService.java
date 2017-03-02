package com.bryoag.edit.category.service.hook;

import com.bryoag.image.model.Image;
import com.bryoag.image.service.ImageLocalServiceUtil;
import com.bryoag.shared.util.UploadUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.shopping.model.ShoppingCategory;
import com.liferay.portlet.shopping.service.ShoppingCategoryLocalService;
import com.liferay.portlet.shopping.service.ShoppingCategoryLocalServiceWrapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Stack;

import javax.portlet.PortletRequest;

import org.hsqldb.lib.StringUtil;

public class ExtShoppingCategoryLocalService extends ShoppingCategoryLocalServiceWrapper {

	/** The log. */
	private final static Log LOG = LogFactoryUtil.getLog(ExtShoppingCategoryLocalService.class);

	@Override
	public ShoppingCategory addCategory(long userId, long parentCategoryId, String name, String description,
			ServiceContext serviceContext) throws PortalException, SystemException {

		ShoppingCategory category = super.addCategory(userId, parentCategoryId, name, description, serviceContext);
		String cmd = ParamUtil.getString(serviceContext, Constants.CMD);
		LiferayPortletRequest request = serviceContext.getLiferayPortletRequest();

		try {
			addImage(category, serviceContext, cmd);
		} catch (IOException e) {
			ExtShoppingCategoryLocalService.LOG.error("Exception is coming while reading the file", e);

		} catch (DuplicateFileException duplicateFileException) {
			SessionErrors.add(request, duplicateFileException.getClass());
		} catch (FileNameException fileNameException) {
			SessionErrors.add(request, fileNameException.getClass());
		}

		return category;
	}

	@Override
	public ShoppingCategory updateCategory(long categoryId, long parentCategoryId, String name, String description,
			boolean mergeWithParentCategory, ServiceContext serviceContext) throws PortalException, SystemException {

		ShoppingCategory shoppingCategory =
				super.updateCategory(categoryId, parentCategoryId, name, description, mergeWithParentCategory,
						serviceContext);
		List<Image> images = ImageLocalServiceUtil.getImagesByCategory(shoppingCategory.getCategoryId());
		LiferayPortletRequest request = serviceContext.getLiferayPortletRequest();
		if (images != null & images.size() == 1) {
			try {
				updateImage(images.get(0), shoppingCategory, serviceContext, "UPDATE");
			} catch (DuplicateFileException duplicateFileException) {
				SessionErrors.add(request, duplicateFileException.getClass());
				ExtShoppingCategoryLocalService.LOG.error("Duplicate file has been uploaded", duplicateFileException);

			} catch (FileNameException fileNameException) {
				SessionErrors.add(request, fileNameException.getClass());
				ExtShoppingCategoryLocalService.LOG.error("File name is null or in wrong format", fileNameException);

			} catch (Exception e) {
				ExtShoppingCategoryLocalService.LOG.error("UpdateCategory has some exception", e);
				SessionErrors.add(request, new PortalException(e).getClass());
				throw new PortalException(e);
			}
		}
		return shoppingCategory;
	}

	@Override
	public ShoppingCategory updateShoppingCategory(ShoppingCategory shoppingCategory) throws SystemException {
		// TODO Auto-generated method stub
		return super.updateShoppingCategory(shoppingCategory);
	}

	/*
	 * (non-Java-doc)
	 * @see com.liferay.portlet.shopping.service.ShoppingCategoryLocalServiceWrapper#
	 * ShoppingCategoryLocalServiceWrapper(ShoppingCategoryLocalService
	 * shoppingCategoryLocalService)
	 */
	public ExtShoppingCategoryLocalService(ShoppingCategoryLocalService shoppingCategoryLocalService) {
		super(shoppingCategoryLocalService);
	}

	public ShoppingCategory addCategory(long userId, long parentCategoryId, String name, String description,
			String smallImagePath, String mediumImagePath, String largeImagePath, ServiceContext serviceContext)
			throws Exception {

		ShoppingCategory category = super.addCategory(userId, parentCategoryId, name, description, serviceContext);
		String cmd = ParamUtil.getString(serviceContext, Constants.CMD);
		addImage(category, serviceContext, cmd);
		return category;
	}

	public String createPath(ShoppingCategory aCategory, String fileName) throws PortalException, SystemException {
		String path = StringPool.BLANK;
		StringBuilder sb = new StringBuilder(path);

		Stack<String> pathBuilder = new Stack<String>();
		pathBuilder.push(fileName);
		ShoppingCategory tempCategory = aCategory;

		do {
			if (tempCategory.getName() != null) {
				pathBuilder.push(tempCategory.getName());
				if (tempCategory.getParentCategoryId() != 0) {
					ShoppingCategory parentCategory = getShoppingCategory(tempCategory.getParentCategoryId());
					tempCategory = parentCategory;
				}
			}

		} while (tempCategory.getParentCategoryId() != 0);
		for (int i = 0; i < pathBuilder.size(); i++) {
			if (i == 0) {
				sb.append(pathBuilder.pop());
			} else {
				sb.append(pathBuilder.pop()).append(StringPool.BACK_SLASH);
			}
		}

		return sb.toString();

	}

	public Image addImage(ShoppingCategory category, ServiceContext serviceContext, String cmd) throws SystemException,
			PortalException, IOException {
		Image image = ImageLocalServiceUtil.createImage();

		return updateImage(image, category, serviceContext, cmd);

	}

	public Image updateImage(Image image, ShoppingCategory category, ServiceContext serviceContext, String cmd)
			throws SystemException, PortalException, IOException {

		LiferayPortletRequest request = serviceContext.getLiferayPortletRequest();

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		String smallFileName = uploadRequest.getFileName("smallImageFile");
		String mediumFileName = uploadRequest.getFileName("mediumImageFile");
		String largeFileName = uploadRequest.getFileName("largeImageFile");

		if (!StringUtil.isEmpty(smallFileName)) {
			String smallImageFilePath = createPath(category, smallFileName);
			updateImage(request, uploadRequest, smallImageFilePath, "smallImageFile", cmd);
			image.setSmallImagePath(smallImageFilePath + "/" + smallFileName);

		}
		if (!StringUtil.isEmpty(mediumFileName)) {
			String mediumImageFilePath = createPath(category, mediumFileName);
			updateImage(request, uploadRequest, mediumImageFilePath, "mediumImageFile", cmd);
			image.setMediumImagePath(mediumImageFilePath + "/" + mediumFileName);
		}

		if (!StringUtil.isEmpty(largeFileName)) {

			String largeImageFilePath = createPath(category, largeFileName);
			updateImage(request, uploadRequest, largeImageFilePath, "largeImageFile", cmd);
			image.setLargeImagePath(largeImageFilePath + "/" + largeFileName);

		}

		image.setCategoryId(category.getCategoryId());
		image.setCompanyId(category.getCompanyId());
		image.setCreateDate(category.getCreateDate());

		image.setGroupId(category.getGroupId());
		image.setModifiedDate(new Date());
		ImageLocalServiceUtil.updateImage(image);

		return image;

	}

	@Override
	public void deleteCategories(long groupId) throws PortalException, SystemException {

		super.deleteCategories(groupId);
	}

	@Override
	public void deleteCategory(long categoryId) throws PortalException, SystemException {

		super.deleteCategory(categoryId);
		Image image = null;

		List<Image> images = ImageLocalServiceUtil.getImagesByCategory(categoryId);
		if (images != null & images.size() == 1) {
			image = images.get(0);

			String smallImagePath = image.getSmallImagePath();
			String folderName = UploadUtil.getSplitStringElement(smallImagePath, "\\/", true);
			String fileName = UploadUtil.getSplitStringElement(smallImagePath, "\\/", false);
			Folder folder = UploadUtil.getFolder(image.getGroupId(), folderName);
			UploadUtil.deleteFileEntry(image.getGroupId(), fileName, folder.getFolderId());
			ImageLocalServiceUtil.deleteImage(images.get(0));
		}

	}

	@Override
	public void deleteCategory(ShoppingCategory category) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		super.deleteCategory(category);
	}

	public void uploadImage(PortletRequest actionRequest, UploadPortletRequest aUploadrequest, String foldername,
			String imageName) throws PortalException, SystemException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		Folder folder =
				UploadUtil.createFolder(actionRequest, themeDisplay.getScopeGroupId(), foldername,
						"uploaded files form tag");

		UploadUtil.fileUpload(themeDisplay.getScopeGroupId(), actionRequest, folder.getFolderId(), imageName);
	}

	public void updateImage(PortletRequest actionRequest, UploadPortletRequest aUploadrequest, String foldername,
			String imageName, String cmd) throws PortalException, SystemException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Folder folder = null;

		if (cmd.equalsIgnoreCase(Constants.ADD)) {
			uploadImage(actionRequest, aUploadrequest, foldername, imageName);

		} else if (cmd.equalsIgnoreCase(Constants.UPDATE)) {
			folder = UploadUtil.getFolder(themeDisplay.getScopeGroupId(), foldername);
			UploadUtil.updateFileEntry(themeDisplay.getScopeGroupId(), actionRequest, folder.getFolderId(), imageName);

		} else if (cmd.equalsIgnoreCase(Constants.DELETE)) {
			UploadUtil.deleteFileEntry(themeDisplay.getScopeGroupId(), imageName, folder.getFolderId());
		}
	}
}

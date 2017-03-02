package com.bryoag.shared.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

import java.io.IOException;
import java.io.InputStream;

import javax.portlet.PortletRequest;

public final class UploadUtil {

	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	/** The log. */
	private final static Log LOG = LogFactoryUtil.getLog(UploadUtil.class);

	private UploadUtil() {
	}

	public static UploadPortletRequest getUploadRequest(PortletRequest request) {

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);

		return uploadRequest;
	}

	public static String getSplitStringElement(String str, String regex, boolean folderName) {

		String[] strArray = str.split(regex);

		if (strArray != null && strArray.length > 1) {
			if (folderName) {
				return strArray[strArray.length - 2];
			} else {
				return strArray[strArray.length - 1];
			}
		}
		return null;

	}

	public static Folder createFolder(PortletRequest actionRequest, long repositoryId, String rootFolderName,
			String rootFolderDesc) {

		String[] folders = null;
		Folder folder = null;
		long ParentFolderId = UploadUtil.PARENT_FOLDER_ID;
		if (rootFolderName != null) {
			folders = rootFolderName.split("/");
		}
		for (String foldername : folders) {
			boolean folderExist = UploadUtil.isFolderExist(repositoryId, foldername, ParentFolderId);

			if (!folderExist) {

				try {
					ServiceContext serviceContext =
							ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
					folder =
							DLAppServiceUtil.addFolder(repositoryId, ParentFolderId, foldername, rootFolderDesc,
									serviceContext);
					ParentFolderId = folder.getFolderId();
				} catch (PortalException e1) {
					e1.printStackTrace();
				} catch (SystemException e1) {
					e1.printStackTrace();
				}
			} else {
				folder = UploadUtil.getFolder(repositoryId, foldername, ParentFolderId);
				ParentFolderId = folder.getFolderId();
			}
		}

		return folder;
	}

	public static boolean isFolderExist(long repositoryId, String rootFolderName, long parentFolderId) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(repositoryId, parentFolderId, rootFolderName);
			folderExist = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

	public static FileEntry getFileEntry(long repositoryId, long folderId, String title) {
		FileEntry fl = null;
		try {
			fl = DLAppServiceUtil.getFileEntry(repositoryId, folderId, title);

		} catch (Exception e) {

		}
		return fl;
	}

	public static Folder getFolder(long repositoryId, String rootFolderName, long parentId) throws PortalException,
			SystemException {
		Folder folder = null;
		String[] folders = null;
		long ParentFolderId = parentId;
		if (rootFolderName != null) {
			folders = rootFolderName.split("/");
		}
		for (String foldername : folders) {

			folder = DLAppServiceUtil.getFolder(repositoryId, ParentFolderId, foldername);
			ParentFolderId = folder.getParentFolderId();

		}

		return folder;
	}

	public static void fileUpload(long repositoryId, PortletRequest actionRequest, Long folderId, String imageFileName)
			throws IOException, PortalException, SystemException {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		InputStream inputStream = null;
		String fileName = uploadPortletRequest.getFileName(imageFileName);
		long size = uploadPortletRequest.getSize(imageFileName);

		String mimeType = uploadPortletRequest.getContentType(imageFileName);
		String title = fileName;
		String description = fileName;
		String changeLog = ParamUtil.getString(uploadPortletRequest, "changeLog");

		try {

			inputStream = uploadPortletRequest.getFileAsStream(imageFileName);

			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(DLFileEntry.class.getName(), uploadPortletRequest);

			DLAppServiceUtil.addFileEntry(repositoryId, folderId, fileName, mimeType, title, description, changeLog,
					inputStream, size, serviceContext);

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}

		}

	}

	public static void updateFileEntry(long repositoryId, PortletRequest actionRequest, Long folderId,
			String imageFileName) throws PortalException, SystemException, IOException {

		InputStream inputStream = null;
		try {
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

			String fileName = uploadPortletRequest.getFileName(imageFileName);
			long size = uploadPortletRequest.getSize(imageFileName);

			String mimeType = uploadPortletRequest.getContentType(imageFileName);
			String title = fileName;
			String description = fileName;
			String changeLog = ParamUtil.getString(uploadPortletRequest, "changeLog");
			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(DLFileEntry.class.getName(), uploadPortletRequest);

			inputStream = uploadPortletRequest.getFileAsStream(imageFileName);
			FileEntry file = UploadUtil.getFileEntry(repositoryId, folderId, imageFileName);

			if (file != null) {
				DLAppServiceUtil.updateFileEntry(file.getFileEntryId(), fileName, mimeType, title, description,
						changeLog, Boolean.FALSE, inputStream, size, serviceContext);
			} else {
				UploadUtil.fileUpload(repositoryId, actionRequest, folderId, imageFileName);
			}
		} finally {
			if (inputStream != null)
				inputStream.close();
		}

	}

	public static FileEntry deleteFileEntry(long repositoryId, String fileName, long folderId) throws PortalException,
			SystemException {

		FileEntry fl = DLAppServiceUtil.getFileEntry(repositoryId, folderId, fileName);

		if (fl != null) {
			DLAppServiceUtil.moveFileEntryToTrash(fl.getFileEntryId());
		}
		return fl;
	}

	// public static void fileUpload(UploadPortletRequest uploadRequest, ThemeDisplay
	// themeDisplay,
	// PortletRequest actionRequest, Folder folder, String imageFileName) {
	//
	// String fileName = uploadRequest.getFileName(imageFileName);
	// InputStream inputStream = null;
	// File file = uploadRequest.getFile(imageFileName);
	// long size = uploadRequest.getSize(imageFileName);
	// String mimeType = uploadRequest.getContentType(imageFileName);
	// String title = fileName;
	// String description = "This file is added via programatically";
	// long repositoryId = themeDisplay.getScopeGroupId();
	// System.out.println("Title=>" + title);
	// try {
	//
	// inputStream = uploadRequest.getFileAsStream(imageFileName);
	//
	// ServiceContext serviceContext =
	// ServiceContextFactory.getInstance(DLFileEntry.class.getName(), uploadRequest);
	// DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType,
	// title, description,
	// "", inputStream, file.getTotalSpace(), serviceContext);
	// SessionMessages.add(actionRequest, "success");
	// } catch (Exception e) {
	// System.out.println(e.getMessage());
	// e.printStackTrace();
	// }

	// }

	/*
	 * public static Map<String, String> getAllFileLink(long repositoryId, String
	 * rootFolderName) { Map<String, String> urlMap = new HashMap<String, String>();// key =
	 * file name ,value = // url try { Folder folder = UploadUtil.getFolder(repositoryId,
	 * rootFolderName); List<FileEntry> fileEntries =
	 * DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId()); for (FileEntry file
	 * : fileEntries) { String url = themeDisplay.getPortalURL() +
	 * themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" +
	 * file.getFolderId() + "/" + file.getTitle(); urlMap.put(file.getTitle().split("\\.")[0],
	 * url);// remove jpg or pdf } } catch (Exception e) { e.printStackTrace(); } return
	 * urlMap; }
	 */

}

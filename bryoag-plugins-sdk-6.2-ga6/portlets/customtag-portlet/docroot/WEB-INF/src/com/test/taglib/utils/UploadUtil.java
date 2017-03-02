package com.test.taglib.utils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;

public final class UploadUtil {

	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	private UploadUtil() {
	}

	public static UploadRequest getUploadRequest(PortletRequest request) {
		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);

		return uploadRequest;
	}

	public static Folder createFolder(PortletRequest actionRequest, ThemeDisplay themeDisplay, String rootFolderName,
			String rootFolderDesc) {
		boolean folderExist = UploadUtil.isFolderExist(themeDisplay, rootFolderName);
		Folder folder = null;
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				ServiceContext serviceContext =
						ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder =
						DLAppServiceUtil.addFolder(repositoryId, UploadUtil.PARENT_FOLDER_ID, rootFolderName,
								rootFolderDesc, serviceContext);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
		} else {
			folder = UploadUtil.getFolder(themeDisplay, rootFolderName);
		}
		return folder;
	}

	public static boolean isFolderExist(ThemeDisplay themeDisplay, String rootFolderName) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), UploadUtil.PARENT_FOLDER_ID, rootFolderName);
			folderExist = true;
			System.out.println("Folder is already Exist");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

	public static Folder getFolder(ThemeDisplay themeDisplay, String rootFolderName) {
		Folder folder = null;
		try {
			folder =
					DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), UploadUtil.PARENT_FOLDER_ID,
							rootFolderName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folder;
	}

	public static void fileUpload(ThemeDisplay themeDisplay, PortletRequest actionRequest, String rootFolderName) {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String fileName = uploadPortletRequest.getFileName("uploadedFile");
		File file = uploadPortletRequest.getFile("uploadedFile");
		String mimeType = uploadPortletRequest.getContentType("uploadedFile");
		String title = fileName;
		String description = "This file is added via programatically";
		long repositoryId = themeDisplay.getScopeGroupId();
		System.out.println("Title=>" + title);
		try {
			Folder folder = UploadUtil.getFolder(themeDisplay, rootFolderName);
			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			InputStream is = new FileInputStream(file);
			DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType, title, description,
					"", is, file.getTotalSpace(), serviceContext);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void fileUpload(UploadRequest uploadRequest, ThemeDisplay themeDisplay, PortletRequest actionRequest,
			Folder folder) {

		String fileName = uploadRequest.getFileName("uploadedFile");
		File file = uploadRequest.getFile("uploadedFile");
		String mimeType = uploadRequest.getContentType("uploadedFile");
		String title = fileName;
		String description = "This file is added via programatically";
		long repositoryId = themeDisplay.getScopeGroupId();
		System.out.println("Title=>" + title);
		try {

			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			InputStream is = new FileInputStream(file);
			DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType, title, description,
					"", is, file.getTotalSpace(), serviceContext);
			SessionMessages.add(actionRequest, "success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static Map<String, String> getAllFileLink(ThemeDisplay themeDisplay, String rootFolderName) {
		Map<String, String> urlMap = new HashMap<String, String>();// key = file name ,value =
																	// url
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			Folder folder = UploadUtil.getFolder(themeDisplay, rootFolderName);
			List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
			for (FileEntry file : fileEntries) {
				String url =
						themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"
								+ themeDisplay.getScopeGroupId() + "/" + file.getFolderId() + "/" + file.getTitle();
				urlMap.put(file.getTitle().split("\\.")[0], url);// remove jpg or pdf

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlMap;

	}
}

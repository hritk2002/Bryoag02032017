package com.test;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

/**
 * Portlet implementation class DocumentUpload
 */
public class FileUploaded extends MVCPortlet {
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");

	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");

	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	public void uploadDocument(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(actionRequest, themeDisplay);
		fileUpload(themeDisplay, actionRequest);
	}

	public void downloadFiles(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,
			PortletException, PortalException, SystemException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Map<String, String> urlMap = getAllFileLink(themeDisplay);
		actionRequest.setAttribute("urlMap", urlMap);
		actionResponse.setRenderParameter("jspPage", "/html/documentupload/download.jsp");
	}

	public Folder createFolder(ActionRequest actionRequest, ThemeDisplay themeDisplay) {
		boolean folderExist = isFolderExist(themeDisplay);
		Folder folder = null;
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				ServiceContext serviceContext =
						ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder =
						DLAppServiceUtil.addFolder(repositoryId, FileUploaded.PARENT_FOLDER_ID,
								FileUploaded.ROOT_FOLDER_NAME, FileUploaded.ROOT_FOLDER_DESCRIPTION, serviceContext);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
		}
		return folder;
	}

	public boolean isFolderExist(ThemeDisplay themeDisplay) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), FileUploaded.PARENT_FOLDER_ID,
					FileUploaded.ROOT_FOLDER_NAME);
			folderExist = true;
			System.out.println("Folder is already Exist");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

	public Folder getFolder(ThemeDisplay themeDisplay) {
		Folder folder = null;
		try {
			folder =
					DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), FileUploaded.PARENT_FOLDER_ID,
							FileUploaded.ROOT_FOLDER_NAME);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folder;
	}

	public void fileUpload(ThemeDisplay themeDisplay, ActionRequest actionRequest) {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String fileName = uploadPortletRequest.getFileName("uploadedFile");
		File file = uploadPortletRequest.getFile("uploadedFile");
		long size = uploadPortletRequest.getSize("file");
		String contentType = uploadPortletRequest.getContentType("uploadedFile");

		if ((size == 0)) {

			contentType = MimeTypesUtil.getContentType(fileName);
		}

		String title = fileName;
		String description = "This file is added via programatically";
		long repositoryId = themeDisplay.getScopeGroupId();
		System.out.println("Title=>" + title);
		try {
			Folder folder = getFolder(themeDisplay);
			ServiceContext serviceContext =
					ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			InputStream is = new FileInputStream(file);
			DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, contentType, title,
					description, "", is, file.getTotalSpace(), serviceContext);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public Map<String, String> getAllFileLink(ThemeDisplay themeDisplay) {
		Map<String, String> urlMap = new HashMap<String, String>();// key = file name ,value =
																	// url
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			Folder folder = getFolder(themeDisplay);
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

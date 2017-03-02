package com.test.taglib;

import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.test.taglib.utils.UploadUtil;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class FileUploadTag extends BodyTagSupport {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String path;

	private Object data;

	public FileUploadTag() {
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int doStartTag() throws JspException {

		PortletRequest pRequest = (PortletRequest) data;
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(pRequest);

		ThemeDisplay themeDisplay = (ThemeDisplay) pRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String cmd = ParamUtil.getString(uploadPortletRequest, Constants.CMD);

		long fileEntryId = ParamUtil.getLong(uploadPortletRequest, "fileEntryId");

		long repositoryId = ParamUtil.getLong(uploadPortletRequest, "repositoryId");
		long folderId = ParamUtil.getLong(uploadPortletRequest, "folderId");
		String sourceFileName = uploadPortletRequest.getFileName("uploadedFile");
		String title = ParamUtil.getString(uploadPortletRequest, "title");
		String description = ParamUtil.getString(uploadPortletRequest, "description");
		String changeLog = ParamUtil.getString(uploadPortletRequest, "changeLog");
		boolean majorVersion = ParamUtil.getBoolean(uploadPortletRequest, "majorVersion");
		if (uploadPortletRequest.getFile("uploadedFile") != null) {

			Folder folder = UploadUtil.createFolder(pRequest, themeDisplay, path, "uploaded files form tag");

			UploadUtil.fileUpload(uploadPortletRequest, themeDisplay, pRequest, folder);
		}

		return BodyTag.EVAL_BODY_TAG;
	}

	public void doInitBody() throws JspException {
		// System.out.println("doInitBody");
	}

	public int doAfterBody() throws JspException {

		return 0;

	}

	public int doEndTag() throws JspException {
		try {
			// Get the current bodyContent for this tag and
			// write it to the original JSP writer
			pageContext.getOut().print(bodyContent.getString());
			return Tag.EVAL_PAGE;
		} catch (IOException ioe) {
			throw new JspException(ioe.getMessage());
		}
	}

}

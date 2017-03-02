package com.bryoag.edit.category.hook.action;

import com.bryoag.image.model.Image;
import com.bryoag.image.service.ImageLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.FileExtensionException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.util.portlet.PortletProps;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.hsqldb.lib.StringUtil;

public class UpdateCategoryAction extends BaseStrutsPortletAction {

	@Override
	public void processAction(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		try {
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

			String smallFileName = GetterUtil.get(uploadPortletRequest.getFullFileName("smallImageFile"), "");
			String mediumFileName = GetterUtil.get(uploadPortletRequest.getFullFileName("mediumImageFile"), "");
			String largeFileName = GetterUtil.get(uploadPortletRequest.getFullFileName("largeImageFile"), "");

			long smallImageSize = uploadPortletRequest.getSize("smallImageFile");
			long mediumImageSize = uploadPortletRequest.getSize("mediumImageFile");
			long largeImageSize = uploadPortletRequest.getSize("mediumImageFile");

			String permittedFileExt = PortletProps.get("dl.file.extensions");
			String permittedFileSize = PortletProps.get("fileupload.size");

			checkFileSupported(smallFileName, permittedFileExt, smallImageSize, permittedFileSize);
			checkFileSupported(mediumFileName, permittedFileExt, mediumImageSize, permittedFileSize);
			checkFileSupported(largeFileName, permittedFileExt, largeImageSize, permittedFileSize);

			originalStrutsPortletAction.processAction(originalStrutsPortletAction, portletConfig, actionRequest,
					actionResponse);

		} catch (FileExtensionException fileExtensionExp) {
			SessionErrors.add(actionRequest, fileExtensionExp.getClass());

		} catch (FileSizeException fileSizeExp) {
			SessionErrors.add(actionRequest, fileSizeExp.getClass());

		} catch (DuplicateFileException duplicateFileException) {
			SessionErrors.add(actionRequest, duplicateFileException.getClass());
		} catch (FileNameException fileNameException) {
			SessionErrors.add(actionRequest, fileNameException.getClass());
		} catch (Exception exception) {
			throw exception;

		}

	}

	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
		// TODO Auto-generated method stub
		long categoryId = ParamUtil.getLong(renderRequest, "categoryId");
		List<Image> images = ImageLocalServiceUtil.getImagesByCategory(categoryId);

		if (images != null & images.size() == 1) {
			renderRequest.setAttribute("smallimagepath", images.get(0).getSmallImagePath());
			renderRequest.setAttribute("mediumimagepath", images.get(0).getMediumImagePath());
			renderRequest.setAttribute("largeimagepath", images.get(0).getLargeImagePath());
		}
		return originalStrutsPortletAction.render(null, portletConfig, renderRequest, renderResponse);
	}

	@Override
	public void serveResource(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {
		// TODO Auto-generated method stub
		originalStrutsPortletAction.serveResource(originalStrutsPortletAction, portletConfig, resourceRequest,
				resourceResponse);
	}

	private boolean checkFileExtension(String imageName, String permittedExt) {

		if (!StringUtil.isEmpty(imageName) && !StringUtil.isEmpty(permittedExt)) {
			String[] splitFile = imageName.split("\\.");
			if (splitFile.length == 2) {
				if (permittedExt.contains(splitFile[1]))
					return true;
			}
		} else {
			return true;
		}

		return false;

	}

	private boolean checkImageSize(long imageSize, String permittedImageSize) {

		if (imageSize != 0 && !StringUtil.isEmpty(permittedImageSize)) {
			Long permittedSize = Long.parseLong(permittedImageSize);
			if (permittedSize > imageSize) {
				return true;
			}
		} else {
			return true;
		}
		return false;

	}

	private void checkFileSupported(String imageFileName, String permittedFileExtention, long imageSize,
			String permittedFileSize) throws FileSizeException, FileExtensionException {

		if (checkFileExtension(imageFileName, permittedFileExtention)) {
			if (checkImageSize(imageSize, permittedFileSize)) {
			} else {
				throw new FileSizeException("File size bigger than " + permittedFileSize);
			}
		} else {
			throw new FileExtensionException("File extension is not supported.Please upload .png,.jpeg,.bmp images");
		}

	}

	public static String getForwardKey(PortletRequest portletRequest) {
		String portletId = (String) portletRequest.getAttribute(WebKeys.PORTLET_ID);

		String portletNamespace = PortalUtil.getPortletNamespace(portletId);

		return portletNamespace.concat("PORTLET_STRUTS_FORWARD");
	}

	protected void setForward(PortletRequest portletRequest, String forward) {
		portletRequest.setAttribute(UpdateCategoryAction.getForwardKey(portletRequest), forward);
	}

}

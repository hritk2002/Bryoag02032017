package com.test.taglib;

import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class TaglibPortlet
 */
public class TaglibPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// HttpServletRequest httpRequest =
		// PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(request));
		// String param = httpRequest.getParameter("fileupload");
		// System.out.println("render .." + param);
		// System.out.println("pportal .." + request.getParameter("fileupload"));
		super.render(request, response);
	}
}

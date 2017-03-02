<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://journaldev.com/jsp/tlds/mytags" prefix="mytags"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />
<theme:defineObjects/>

<liferay-ui:success key="success" message="done"  />
<mytags:fileUpload data='<%=renderRequest %>' path="uploadFilesFromTag" >
<aui:form  enctype="multipart/form-data" method="post" name="multipleUpload">
    <aui:input type="file" name="uploadedFile" label="My File"></aui:input>
    <aui:button type="submit" name="btnUploadFile" value="Upload File"></aui:button>
</aui:form>

</mytags:fileUpload>






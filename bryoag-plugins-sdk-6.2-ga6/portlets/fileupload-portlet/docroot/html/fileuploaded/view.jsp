<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>File Uploaded</b> portlet in View mode.

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
<portlet:defineObjects /> 
<portlet:actionURL var="uplaodURL" name="uploadDocument"></portlet:actionURL> 
<portlet:actionURL var="downloadURL" name="downloadFiles"></portlet:actionURL> 
<b>Please Upload a Document</b>
 <form action="<%=uplaodURL%>" method="post" enctype="multipart/form-data"> 
 <input type="file" name="uploadedFile"> 
 <input type="Submit" name="Submit"> 
 </form> 
 <a href="<%=downloadURL%>">Download Files</a> 
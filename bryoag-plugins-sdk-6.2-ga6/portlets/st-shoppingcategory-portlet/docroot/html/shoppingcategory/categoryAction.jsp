<%@page import="com.skilltailor.shopping.category.model.shoppingcategory"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@include file="/html/shoppingcategory/init.jsp"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>


 <%

ResultRow rRow= (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
shoppingcategory cat = (shoppingcategory)rRow.getObject();
%>

<portlet:actionURL var="deleteCatURL" name="deleteCategory">
	<portlet:param name="del_category" value="<%=String.valueOf(cat.getCategoryId())  %>"/>
</portlet:actionURL>

<portlet:renderURL var="editCatURL">
<portlet:param name="jspPage" value="/html/shoppingcategory/createUpdateCategory.jsp"/>
<portlet:param name="edit" value="<%=String.valueOf(cat.getCategoryId()) %>"/>
</portlet:renderURL>


<liferay-ui:icon-menu>
  <liferay-ui:icon message="edit"  url="<%=editCatURL %>" />
  <liferay-ui:icon message="delete"    url="<%=deleteCatURL %>" />
</liferay-ui:icon-menu> 
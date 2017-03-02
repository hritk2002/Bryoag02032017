<%@page import="com.skilltailor.shopping.category.service.shoppingcategoryServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil"%>
<%@page
	import="com.skilltailor.shopping.category.service.persistence.shoppingcategoryUtil"%>
<%@page
	import="com.skilltailor.shopping.category.service.shoppingcategoryLocalService"%>
<%@page
	import="com.skilltailor.shopping.category.model.shoppingcategory"%>
<%@page import="java.util.HashMap"%>
<%@include file="/html/shoppingcategory/init.jsp"%>


<portlet:actionURL var="createCategory" name="createCategory" >
</portlet:actionURL>


<portlet:renderURL var="openViewPage"  >
	<portlet:param name="jspPage" value="/html/shoppingcategory/view.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="openViewCategoryPage" >
	<portlet:param name="jspPage" value="/html/shoppingcategory/viewCategory.jsp"/>
</portlet:renderURL>


<a href="/home"> back to main page</a><br>
<a href="${openViewCategoryPage }"> View Category</a>

<%
HashMap<String,String> protletPrefrences = (HashMap<String,String>) renderRequest.getAttribute("portletPrefs");
List<shoppingcategory> categoryList = shoppingcategoryServiceUtil.getAllShoppingCategory(themeDisplay.getCompanyId(),themeDisplay.getScopeGroupId());
Long editId = ParamUtil.getLong(renderRequest,"edit",0l);
shoppingcategory cat=null;
if(editId!=0){
	cat = shoppingcategoryUtil.findByCategoryId(editId);
}
%>
<aui:model-context bean="<%= cat %>" model="<%= shoppingcategory.class %>" /> 
<div class="tab-content marginB20 row-fluid">
	<div id="Category" class="tab-pane in active">
		<aui:form cssClass="form-horizontal " 
			name="createCategoryForm" id="createCategoryForm" method="post"
			action="<%= createCategory %>">
			<aui:input type="hidden" name="categoryId" id="categoryId"></aui:input>
			<h5 class="sectionhead">
				<span class="icon-angle-down"></span><%= "Create Category" %></h5>
			<div class="toggle-content " style="display: block;">
				<div class="form-group clearfix">
				
					<div class=" required row-fluid">
						<div class="span8 station">
							<aui:input id="name" required="true"  name="name" cssClass="lfr-input-text-container" 
								title="Name" type="text" label="Name"></aui:input>
						</div>
					</div>
					<div class=" required row-fluid">
						<div class="span8 station">
							<aui:input id="description" name="description" cssClass="lfr-input-text-container" 
								title="Description" label="Description" type="textarea"></aui:input>
							<div id="arptError" class="hide customerrorMSG"><%= "description error" %></div>
						</div>
					</div>
					<div class=" required row-fluid">
						<div class="span8">
							<%long catId = cat == null?0l:cat.getCategoryId();%>
							<%if(categoryList!=null&&!categoryList.isEmpty()) %>
							
							<label class="control-label" for="_shoppingcategory_WAR_stshoppingcategoryportlet_parentId"> Paret Category </label>
							<select name='<portlet:namespace/>parentId' id="parentId"  class="lfr-input-text-container" >
								<option value="0">Select category</option>
							
								<%for(shoppingcategory category :categoryList) {%>
									<%String select= catId==category.getPrimaryKey()?"selected='selected'":"";%>
								<option value='<%=category.getPrimaryKey()%>' <%=select %>>
									<%=category.getName() %></option>
								<%} %>
							</select>
						</div>
					</div>
				</div>

			</div>
			<div class=" clearfix marginB20 row-fluid">
				<aui:button-row cssClass="pagebutton paddingT10">
					<aui:button id="cancelButton" name="saveButton" type="submit" 
						cssClass="btn-primary marginR20"></aui:button>
				</aui:button-row>
			</div>
		</aui:form>
	</div>
</div>



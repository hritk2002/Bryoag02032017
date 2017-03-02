<%@page
	import="com.skilltailor.shopping.category.service.shoppingcategoryServiceUtil"%>
<%@page
	import="com.skilltailor.shopping.category.service.shoppingcategoryLocalServiceUtil"%>
<%@page
	import="com.skilltailor.shopping.category.model.shoppingcategory"%>
<%@include file="/html/shoppingcategory/init.jsp"%>

<% 
  	String orderByCol = ParamUtil.getString(request, "orderByCol");
  	String orderByType = ParamUtil.getString(request, "orderByType");
  
  %>
<portlet:renderURL var="openCreateCategoryPage" >
<portlet:param name="jspPage" value="/html/shoppingcategory/createUpdateCategory.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="openViewCategoryPage"  >
	<portlet:param name="jspPage" value="/html/shoppingcategory/view.jsp"/>
</portlet:renderURL>


<a href="/home">Back Main Page</a><br>
<a href="${openCreateCategoryPage }"> Create Category</a><br>


<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="orderByType" value='<%=orderByType %>' />
	<portlet:param name="orderByCol" value='<%=orderByCol %>' />
	<portlet:param name="jspPage" value="/html/shoppingcategory/viewCategory.jsp"/>
</liferay-portlet:renderURL>
<div id='categorhyTableDiv'>
	<liferay-ui:search-container id="categorhyTable" 
		deltaConfigurable="true" iteratorURL='<%=iteratorURL %>'
		emptyResultsMessage="No category found"
		orderByType="<%=orderByType %>">
		<liferay-ui:search-container-results>
			<%
			    if( orderByCol != null ){
				  	//Logic for toggle asc and desc
				  		if (orderByType.equals("asc")) {
					  		orderByType = "desc";
					  	} else {
					  		orderByType = "asc";
					  	}
				}
			    %>
			<%
				searchContainer.setOrderByType(orderByType);
				iteratorURL.setParameter("orderByType", orderByType);
	    			List<shoppingcategory> catList = new ArrayList<shoppingcategory>();
	    		    if (Validator.isBlank(orderByCol) ){
	    		    	catList = shoppingcategoryServiceUtil.getAllShoppingCategory(themeDisplay.getCompanyId(),themeDisplay.getScopeGroupId());
	    		    }else {
	    		    	if(orderByType.equals("desc")){
	    		    		catList =  shoppingcategoryServiceUtil.getCategoryByOrder(themeDisplay.getCompanyId(),themeDisplay.getScopeGroupId(), orderByCol, true);
	    		    	}else{
	    		    		catList =  shoppingcategoryServiceUtil.getCategoryByOrder(themeDisplay.getCompanyId(),themeDisplay.getScopeGroupId(),orderByCol, false);
	    		    	}
	    		    	
	    		    }
	    		    total = catList.size();
	    		    catList = ListUtil.subList(catList, searchContainer.getStart(), searchContainer.getEnd());
	    		    results=catList;
	    			searchContainer.setResults(results);
	    			searchContainer.setTotal(total);
	    %>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="com.skilltailor.shopping.category.model.shoppingcategory"
			keyProperty="categoryId" modelVar="category" >

			<liferay-ui:search-container-column-text index="0"
				cssClass="categoryId"   orderable="true" name="CategoryId" orderableProperty="categoryId">
				
				<a href="javascript:void(0)" onclick='setValue(<%=category.getCategoryId() %>)'><%=category.getCategoryId() %></a>
			</liferay-ui:search-container-column-text>
			
			<liferay-ui:search-container-column-text index="1" cssClass="name"
				property="name" orderable="true" orderableProperty="name" />

			<liferay-ui:search-container-column-text index="2"
				cssClass="description" property="description" orderable="true"
				orderableProperty="description" />
				
			<liferay-ui:search-container-column-text index="3"
				cssClass="parentId" property="parentId" orderable="true"
				orderableProperty="parentId" />
			
			<liferay-ui:search-container-column-jsp name="Actions"
			 path="/html/shoppingcategory/categoryAction.jsp">
			 </liferay-ui:search-container-column-jsp>
				
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator paginate="<%=true%>" />
	</liferay-ui:search-container>
	
	<aui:script>
	function setValue( categoryId)
	{
		window.opener.document.getElementById('_shoppingproduct_WAR_stproductportlet_categoryId').value = categoryId;
	
	}
	
	</aui:script>
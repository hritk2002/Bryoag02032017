<%@ include file="/html/shoppingproduct/init.jsp" %>



<portlet:defineObjects />
<portlet:actionURL copyCurrentRenderParameters="true"  var="EditProductURL"></portlet:actionURL>



		

<%
int categoryId =0;
Product item = (Product)request.getAttribute("shopping_product");

long productId = BeanParamUtil.getLong(item, request, "productId");

ProductParts[] itemFields = null;

int fieldsCount = ParamUtil.getInteger(request, "fieldsCount");

String fieldsCountParam = request.getParameter("fieldsCount");

if ((fieldsCountParam == null) || fieldsCountParam.equals(StringPool.NULL)) {
	if (item != null) {
		itemFields = (ProductParts[])ProductPartsLocalServiceUtil.findByProductId(productId).toArray(new ProductParts[0]);
		fieldsCount = itemFields.length;
	}
	else {
		itemFields = new ProductParts[0];
	}
}
else {
	itemFields = new ProductParts[fieldsCount];
}


int fieldId = ParamUtil.getInteger(request, "fieldId", -1);

%>

<portlet:renderURL var="renderUrl">

</portlet:renderURL>

<liferay-portlet:renderURL  portletName="shoppingcategory_WAR_stshoppingcategoryportlet" var="callURL"  windowState="<%= LiferayWindowState.POP_UP.toString() %>">
<portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" />
</liferay-portlet:renderURL>

	<%
	String taglibOpenCategoryWindow = "var categoryWindow = window.open('" + callURL + "', 'category', 'directories=no,height=640,location=no,menubar=no,resizable=yes,scrollbars=yes,status=no,toolbar=no,width=680'); void('');categoryWindow.focus();";
	%>

<aui:form action="<%= EditProductURL %>" enctype="multipart/form-data" method="post"  name="productForm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveProduct();" %>'>
	<aui:input name="CMD" type="hidden" />
	<aui:input name="fieldsCount" type="hidden" value="<%= fieldsCount %>"  />
	<aui:fieldset cssClass="frmContainer">
	<aui:input name="fieldId" type="hidden" />
	
	<liferay-ui:error exception="<%= DuplicateItemSKUException.class %>" message="the-item-sku-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= ItemNameException.class %>" message="please-enter-a-valid-name" />
	<liferay-ui:error exception="<%= ItemSKUException.class %>" message="please-enter-a-valid-item-sku" />
	
				<liferay-ui:error exception="<%= ItemLargeImageNameException.class %>">

				<%
				String[] imageExtensions = PrefsPropsUtil.getStringArray(PropsKeys.SHOPPING_IMAGE_EXTENSIONS, StringPool.COMMA);
				%>

				<liferay-ui:message key="image-names-must-end-with-one-of-the-following-extensions" /> <%= StringUtil.merge(imageExtensions, ", ") %>.
			</liferay-ui:error>

			<liferay-ui:error exception="<%= ItemLargeImageSizeException.class %>">

				<%
				long imageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_LARGE_MAX_SIZE) / 1024;
				%>

				<liferay-ui:message arguments="<%= imageMaxSize %>" key="please-enter-a-file-with-a-valid-file-size-no-larger-than-x" />
			</liferay-ui:error>

			<liferay-ui:error exception="<%= ItemMediumImageNameException.class %>">

				<%
				String[] imageExtensions = PrefsPropsUtil.getStringArray(PropsKeys.SHOPPING_IMAGE_EXTENSIONS, StringPool.COMMA);
				%>

				<liferay-ui:message key="image-names-must-end-with-one-of-the-following-extensions" /> <%= StringUtil.merge(imageExtensions, ", ") %>.
			</liferay-ui:error>

			<liferay-ui:error exception="<%= ItemMediumImageSizeException.class %>">

				<%
				long imageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_MEDIUM_MAX_SIZE) / 1024;
				%>

				<liferay-ui:message arguments="<%= imageMaxSize %>" key="please-enter-a-file-with-a-valid-file-size-no-larger-than-x" />
			</liferay-ui:error>

			<liferay-ui:error exception="<%= ItemSmallImageNameException.class %>">

				<%
				String[] imageExtensions = PrefsPropsUtil.getStringArray(PropsKeys.SHOPPING_IMAGE_EXTENSIONS, StringPool.COMMA);
				%>

				<liferay-ui:message key="image-names-must-end-with-one-of-the-following-extensions" /> <%= StringUtil.merge(imageExtensions, ", ") %>.
			</liferay-ui:error>

			<liferay-ui:error exception="<%= ItemSmallImageSizeException.class %>">

				<%
				long imageMaxSize = PrefsPropsUtil.getLong(PropsKeys.SHOPPING_IMAGE_SMALL_MAX_SIZE) / 1024;
				%>

				<liferay-ui:message arguments="<%= imageMaxSize %>" key="please-enter-a-file-with-a-valid-file-size-no-larger-than-x" />
			</liferay-ui:error>
	
	<aui:button-row>
		<aui:input autoFocus="true"  name="categoryId"  inlineLabel="left" /> 
		<aui:button onClick="<%= taglibOpenCategoryWindow %>" value="Select Category" />
	</aui:button-row>
	<aui:input autoFocus="true"  name="sku" label="SKU" inlineLabel="left" >
	 <aui:validator name="required"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true"  name="productname" label="Product Name" inlineLabel="left" >
	 <aui:validator name="required"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-textarea-container" name="description" inlineLabel="left" type="textarea" />
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="basiccost" label="Basic Cost" inlineLabel="left" >
	<aui:validator name="number"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="shippingcost" label="Shipping Cost" inlineLabel="left">
	<aui:validator name="number"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="totalquantity" label="Total Quantity" inlineLabel="left">
	<aui:validator name="number"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="minQuantity" label="Minimum Quantity" inlineLabel="left">
	<aui:validator name="number"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="maxQuantity" label="Maximum Quantity" inlineLabel="left">
	<aui:validator name="number"></aui:validator>
	</aui:input>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="stockchecking" label="Disable Stock Checking" type="checkbox" inlineLabel="left"/>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="taxable" label="Is Taxable" type="checkbox" inlineLabel="left"/>
	<aui:input autoFocus="true" cssClass="lfr-input-text-container" name="discount"  inlineLabel="left">
	<aui:validator name="number"></aui:validator>
	</aui:input>
	

	<aui:input type="file" name="smallFile"  label="Small Image"  inlineLabel="left">
	
	<aui:validator name="acceptFiles">
			'jpg,jpeg,bmp,png'
	</aui:validator>
	
	</aui:input>
	<aui:input type="file" name="mediumFile" label="Medium Image" inlineLabel="left">
	
	<aui:validator name="acceptFiles">
			'jpg,jpeg,bmp,png'
	</aui:validator>
	
	</aui:input>
	<aui:input type="file" name="largeFile" label="Large Image" inlineLabel="left">
	
			<aui:validator name="acceptFiles">
					'jpg,jpeg,bmp,png'
			</aui:validator>
	
	</aui:input>
	
	</aui:fieldset>
	
		<aui:button-row>
		<aui:button type="submit" />

		<aui:button href="" type="cancel" />
	</aui:button-row>
	
	
		<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" id="shoppingEditItemFieldsPanel"  persistState="<%= true %>" title="fields">
			<aui:input name="fields" type="hidden" />

			<liferay-ui:message key="fields-are-added-if-you-need-to-distinguish-items-based-on-criteria-chosen-by-the-user" />

			<br/><br/>

			<table class="lfr-table">

			<%
			for (int i = 0; i < fieldsCount ; i++) {
				int curFieldId = i;

				if ((fieldId > -1) && (i >= fieldId)) {
					curFieldId++;
				}

				String fieldName = ParamUtil.getString(request, "fieldName" + curFieldId);
				String fieldNameParam = request.getParameter("fieldName" + curFieldId);
				if ((fieldNameParam == null) || fieldNameParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldName = itemFields[curFieldId].getName();
					}
				}

				String fieldValues = ParamUtil.getString(request, "fieldValues" + curFieldId);
				String fieldValuesParam = request.getParameter("fieldValues" + curFieldId);
				if ((fieldValuesParam == null) || fieldValuesParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldValues = itemFields[curFieldId].getValues();
					}
				}

				String fieldDescription = ParamUtil.getString(request, "fieldDescription" + curFieldId);
				String fieldDescriptionParam = request.getParameter("fieldDescription" + curFieldId);
				if ((fieldDescriptionParam == null) || fieldDescriptionParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldDescription = itemFields[curFieldId].getDescription();
					}
				}
				

				boolean fieldHasAdditionalCost = ParamUtil.getBoolean(request, "fieldHasAdditionalCost" + curFieldId);
				String fieldHasAdditionalCostParam = request.getParameter("fieldHasAdditionalCost" + curFieldId);
				if ((fieldHasAdditionalCostParam == null) || fieldHasAdditionalCostParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldHasAdditionalCost = itemFields[curFieldId].getHasAdditionalCost();
					}
				}
				

				int fieldAdditionalCost = ParamUtil.getInteger(request, "fieldAdditionalCost" + curFieldId);
				String fieldAdditionalCostParam = request.getParameter("fieldAdditionalCost" + curFieldId);
				if ((fieldAdditionalCostParam == null) || fieldAdditionalCostParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldAdditionalCost = itemFields[curFieldId].getAdditionalCost();
					}
				}

				boolean fieldIsCommon = ParamUtil.getBoolean(request, "fieldIsCommon" + curFieldId);
				String fieldIsCommonParam = request.getParameter("fieldIsCommon" + curFieldId);
				if ((fieldIsCommonParam == null) || fieldIsCommonParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldIsCommon = itemFields[curFieldId].getIsCommon();
					}
				}

				String fieldTagName = ParamUtil.getString(request, "fieldTagName" + curFieldId);
				String fieldTagNameParam = request.getParameter("fieldTagName" + curFieldId);
				if ((fieldTagNameParam == null) || fieldTagNameParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldTagName = itemFields[curFieldId].getTagName();
					}
				}

				String fieldCompatibleTag = ParamUtil.getString(request, "fieldCompatibleTag" + curFieldId);
				String fieldCompatibleTagParam = request.getParameter("fieldCompatibleTag" + curFieldId);
				if ((fieldCompatibleTagParam == null) || fieldCompatibleTagParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldCompatibleTag = itemFields[curFieldId].getCompatibleTag();
					}
				}

				int fieldSequence = ParamUtil.getInteger(request, "fieldSequence" + curFieldId);
				String fieldSequenceParam = request.getParameter("fieldSequence" + curFieldId);
				if ((fieldSequenceParam == null) || fieldSequenceParam.equals(StringPool.NULL)) {
					if (itemFields[curFieldId] != null) {
						fieldSequence = itemFields[curFieldId].getSequence();
					}
				} 
			%>

<aui:fieldset>
				<tr>
					<td >
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="name" name='<%= "fieldName" + i %>'  type="text" value="<%= fieldName %>" inlineLabel="left"/>
					</td>
					<td width="400">
					</td>
					
						
					<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="description" name='<%= "fieldDescription" + i %>'  type="text" value="<%= fieldDescription %>" inlineLabel="left"/>
					</td>
					
					
					
					
						
		
			
				</tr>
				
				<tr>
				
					<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="values" name='<%= "fieldValues" + i %>' type="text" value='<%= fieldValues %>' inlineLabel="left"/>
					</td>
					
					<td width="400">
					</td>
					
					<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="TagName" name='<%= "fieldTagName" + i %>' type="text" value="<%= fieldTagName %>" inlineLabel="left"/>
					</td>
				
						
				</tr>
				
				<tr>
				<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="IsComman" name='<%= "fieldIsComman" + i %>'  type="checkbox" value="<%= fieldIsCommon %>" inlineLabel="left"/>
					</td>
					
					<td width="400">
					</td>
					
					<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="Has Additional Cost" name='<%= "fieldHasAdditionalCost" + i %>'  type="checkbox" value="<%= fieldHasAdditionalCost %>" inlineLabel="left"/>
					</td>
					
				
				</tr>
				
				<tr>
				<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="Sequence" name='<%= "fieldSequence" + i %>'  type="text" value="<%= fieldSequence %>" inlineLabel="left"/>
					</td>
					
					<td width="400">
					</td>
						<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="Additional Cost" name='<%= "fieldAdditionalCost" + i %>'  type="text" value="<%= fieldAdditionalCost %>" inlineLabel="left" />
					</td>
				
					
				
				</tr>
				
				<tr>
					<td>
					<aui:input type="file" name="smallPartFile"  label="Small Image File"  inlineLabel="left">
					
						<aui:validator name="acceptFiles">
								'jpg,jpeg,bmp,png'
						</aui:validator>
					
					</aui:input>
					</td>
					
					<td width="400">
					</td>
					
					<td>		
						<aui:input type="file" name="largePartFile" label="Large Image File" inlineLabel="left">
					
							<aui:validator name="acceptFiles">
									'jpg,jpeg,bmp,png'
							</aui:validator>
					
						</aui:input>
					</td>
				
				</tr>
				
				<tr>
				<td>
						<aui:input cssClass="lfr-input-text-container" ignoreRequestValue="<%= true %>" label="CompatibleTag" name='<%= "fieldCompatibleTag" + i %>'  type="textarea" value="<%= fieldCompatibleTag %>" inlineLabel="left"/>
					</td>
					<td width="400">
					</td>
					
					<c:if test="<%= fieldsCount > 0 %>">
						<td>
							<aui:button onClick='<%= renderResponse.getNamespace() + "deleteField(" + i + ");" %>' value="delete" />
						</td>
					</c:if>
					    
					   
					</tr>
					</aui:fieldset>

			<%
			}
			%>

			</table>

		
			<aui:button onClick ='<%= renderResponse.getNamespace() + "addField();" %>' value="add-field" />

	
	
			<br/><br/>

		</liferay-ui:panel>

	</aui:form>
	
	<style>
	.frmContainer .form-inline .control-label{width:150px;}
	
		hr { 
	    display: block;
	    margin-top: 0.5em;
	    margin-bottom: 0.5em;
	    margin-left: auto;
	    margin-right: auto;
	    border-style: inset;
	    border-width: 1px;
	} 
	</style>

	
	<aui:script>
	
	
	function <portlet:namespace />saveProduct() {
		alert("submit");
		document.<portlet:namespace />productForm.<portlet:namespace /><%= "CMD" %> = "<%= (item == null) ?"ADD" : "UPDATE" %>";

		submitForm(document.<portlet:namespace />productForm);
	}
	</aui:script>
	<aui:script use="liferay-portlet-url">
	Liferay.provide(
	  window,
	  '<portlet:namespace/>addField',
	  function(id) {
	 
		document.<portlet:namespace />productForm.<portlet:namespace />fieldsCount.value = <%= fieldsCount + 1 %>;
	
	   	 var url=Liferay.PortletURL.createRenderURL();
	      url.setPortletId('shoppingproduct_WAR_stproductportlet');
	      url.setParameter('fieldsCount',<%= fieldsCount + 1 %>);
	    window.location.href = url;
	   }
	  );
	</aui:script>
	
	<aui:script use="liferay-portlet-url">
	Liferay.provide(
	  window,
	  '<portlet:namespace/>deleteField',
	  function(id) {
	 
		document.<portlet:namespace />productForm.<portlet:namespace />fieldsCount.value = <%= fieldsCount - 1 %>;
	
	   	 var url=Liferay.PortletURL.createRenderURL();
	      url.setPortletId('shoppingproduct_WAR_stproductportlet');
	      url.setParameter('fieldsCount',<%= fieldsCount - 1 %>);
	    window.location.href = url;
	   }
	  );
	</aui:script>


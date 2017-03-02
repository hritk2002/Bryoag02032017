<%@include file="/html/shoppingcategory/init.jsp"%>


<portlet:renderURL var="openCreateCategoryPage">
<portlet:param name="jspPage" value="/html/shoppingcategory/createUpdateCategory.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="openViewCategoryPage" >
	<portlet:param name="jspPage" value="/html/shoppingcategory/viewCategory.jsp"/>
</portlet:renderURL>


<a href="${openCreateCategoryPage }"> Create Category</a><br>
<a href="${openViewCategoryPage }"> View Category</a>



<div class="list-container" id="productAdmin">
	<div class="list-item mouseover" style="width:50%">
		<a href="${openCreateCategoryPage }">
			<img src="./images/createCat.jpg" alt="$item.data" class="full" />
			
			<span class="list-text">
				<span class="margins">
					<h1>Create Category</h1>
				</span>
			</span>
		</a>

	</div>
	<div class="list-item mouseover" style="width:50%">
		<a href="${openViewCategoryPage }">
			<img src="./images/createCat.jpg" alt="$item.data" class="full" />
			
			<span class="list-text">
				<span class="margins">
					<h1>View Category</h1>
					<p> You can view update/delete category</p>
				</span>
			</span>
		</a>

	</div>
	<div class="list-item mouseover" style="width:50%">
		<a href="">
			<img src="./images/createCat.jpg" alt="$item.data" class="full" />
			
			<span class="list-text">
				<span class="margins">
					<h1>Create Product</h1>
				</span>
			</span>
		</a>

	</div>
	<div class="list-item mouseover" style="width:50%">
		<a href="$item.url-location.data">
			<img src="./updateCat.jpg" alt="$item.data" class="full" />
			
			<span class="list-text">
				<span class="margins">
					<h1>View Product</h1>
					<p> You can view update/delete product</p>
				</span>
			</span>
		</a>

	</div>
	<div class="list-item mouseover" style="width:50%">
		<a href="$item.url-location.data">
			<img src="./images/updateCat.jpg" alt="$item.data" class="full" />
			
			<span class="list-text">
				<span class="margins">
					<h1>Create Category</h1>
				</span>
			</span>
		</a>

	</div>
</div>
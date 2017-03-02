create table st_Image (
	imageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryId LONG,
	productId LONG,
	smallImagePath STRING null,
	mediumImagePath STRING null,
	largeImagePath STRING null
);
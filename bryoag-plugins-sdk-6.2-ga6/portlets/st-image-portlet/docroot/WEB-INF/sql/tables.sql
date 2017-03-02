create table skilltailor_Image (
	imageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetId LONG,
	assetType VARCHAR(75) null,
	smallImagePath VARCHAR(75) null,
	mediumImagePath VARCHAR(75) null,
	largeImagePath VARCHAR(75) null
);
create table skilltailor_Product (
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryId LONG,
	sku VARCHAR(75) null,
	productName VARCHAR(75) null,
	description VARCHAR(75) null,
	basicCost INTEGER,
	shippingCost INTEGER,
	totalQuantity INTEGER,
	minQuantity INTEGER,
	maxQuantity INTEGER,
	taxable BOOLEAN,
	stockChecking BOOLEAN,
	discount DOUBLE,
	imageId LONG
);

create table skilltailor_ProductParts (
	partId LONG not null primary key,
	productId LONG,
	name VARCHAR(75) null,
	values_ VARCHAR(75) null,
	description VARCHAR(75) null,
	hasAdditionalCost BOOLEAN,
	additionalCost INTEGER,
	isCommon BOOLEAN,
	sequence INTEGER,
	tagName VARCHAR(75) null,
	compatibleTag VARCHAR(75) null
);

create table skilltailor_product (
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryId LONG,
	sku LONG,
	basiccost INTEGER,
	shippingcost INTEGER,
	totalquantity INTEGER,
	stockchecking BOOLEAN,
	discount DOUBLE
);

create table skilltailor_productparts (
	partId LONG not null primary key,
	productId LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	hasadditionalcoast BOOLEAN,
	additionalcost INTEGER,
	iscomman BOOLEAN,
	sequence INTEGER,
	tagname VARCHAR(75) null,
	compatibletag LONG
);
create index IX_CB380E07 on skilltailor_Product (categoryId);
create index IX_29F38A9C on skilltailor_Product (companyId, groupId);
create index IX_9C96E98F on skilltailor_Product (discount);
create index IX_71CCB3D0 on skilltailor_Product (groupId);
create index IX_BD531940 on skilltailor_Product (productId);
create index IX_46878A33 on skilltailor_Product (sku);
create index IX_581C2C15 on skilltailor_Product (sku, companyId);

create index IX_16D1C064 on skilltailor_ProductParts (compatibleTag);
create index IX_1894B084 on skilltailor_ProductParts (compatibletag);
create index IX_698D3F9B on skilltailor_ProductParts (isCommon);
create index IX_65AC7E49 on skilltailor_ProductParts (iscomman);
create index IX_209A5AF1 on skilltailor_ProductParts (name);
create index IX_3C9C8314 on skilltailor_ProductParts (partId);
create index IX_81802FA8 on skilltailor_ProductParts (productId);
create index IX_9292DEAE on skilltailor_ProductParts (productId, compatibleTag);
create index IX_9455CECE on skilltailor_ProductParts (productId, compatibletag);
create index IX_C2122167 on skilltailor_ProductParts (productId, name);
create index IX_5400308D on skilltailor_ProductParts (productId, tagName);
create index IX_8A9B446D on skilltailor_ProductParts (productId, tagname);
create index IX_22A012C3 on skilltailor_ProductParts (tagName);
create index IX_593B26A3 on skilltailor_ProductParts (tagname);

create index IX_5E56BE27 on skilltailor_product (categoryId);
create index IX_53F01ABC on skilltailor_product (companyId, groupId);
create index IX_51E321AF on skilltailor_product (discount);
create index IX_408F7B0 on skilltailor_product (groupId);
create index IX_B18DE520 on skilltailor_product (productId);
create index IX_8240BE13 on skilltailor_product (sku);

create index IX_13489484 on skilltailor_productparts (compatibletag);
create index IX_FB1A1A49 on skilltailor_productparts (iscomman);
create index IX_E535F6F1 on skilltailor_productparts (name);
create index IX_48C11F14 on skilltailor_productparts (partId);
create index IX_99C613A8 on skilltailor_productparts (productId);
create index IX_330B6ACE on skilltailor_productparts (productId, compatibletag);
create index IX_DF5D0567 on skilltailor_productparts (productId, name);
create index IX_58B5E06D on skilltailor_productparts (productId, tagname);
create index IX_D1AA0AA3 on skilltailor_productparts (tagname);
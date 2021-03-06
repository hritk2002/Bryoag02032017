/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.skilltailor.shopping.product.service.base;

import com.skilltailor.shopping.product.service.ProductLocalServiceUtil;

import java.util.Arrays;

/**
 * @author deepakgupta02
 * @generated
 */
public class ProductLocalServiceClpInvoker {
	public ProductLocalServiceClpInvoker() {
		_methodName0 = "addProduct";

		_methodParameterTypes0 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName1 = "createProduct";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteProduct";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteProduct";

		_methodParameterTypes3 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchProduct";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getProduct";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getProducts";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getProductsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateProduct";

		_methodParameterTypes15 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName40 = "getBeanIdentifier";

		_methodParameterTypes40 = new String[] {  };

		_methodName41 = "setBeanIdentifier";

		_methodParameterTypes41 = new String[] { "java.lang.String" };

		_methodName46 = "addProduct";

		_methodParameterTypes46 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "java.io.File", "java.io.File",
				"java.io.File", "long", "long", "long", "java.util.List",
				"double", "int", "int", "int", "boolean", "int", "int",
				"boolean", "com.liferay.portal.service.ServiceContext"
			};

		_methodName47 = "addProduct";

		_methodParameterTypes47 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName48 = "createProduct";

		_methodParameterTypes48 = new String[] {  };

		_methodName49 = "createProduct";

		_methodParameterTypes49 = new String[] { "long" };

		_methodName50 = "deleteProduct";

		_methodParameterTypes50 = new String[] { "long" };

		_methodName51 = "deleteProduct";

		_methodParameterTypes51 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName52 = "getProductsCount";

		_methodParameterTypes52 = new String[] {  };

		_methodName53 = "updateProduct";

		_methodParameterTypes53 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName57 = "findByGroupId";

		_methodParameterTypes57 = new String[] { "long" };

		_methodName58 = "findByCategory";

		_methodParameterTypes58 = new String[] { "long" };

		_methodName59 = "findByC_G";

		_methodParameterTypes59 = new String[] { "long", "long" };

		_methodName60 = "findByProductId";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName62 = "updateImage";

		_methodParameterTypes62 = new String[] {
				"com.bryoag.shopping.image.model.Image",
				"com.skilltailor.shopping.product.model.Product",
				"com.liferay.portal.service.ServiceContext", "java.io.File",
				"java.io.File", "java.io.File", "java.lang.String"
			};

		_methodName63 = "uploadImage";

		_methodParameterTypes63 = new String[] {
				"javax.portlet.PortletRequest",
				"com.liferay.portal.kernel.upload.UploadPortletRequest",
				"java.lang.String", "java.lang.String"
			};

		_methodName64 = "updateImage";

		_methodParameterTypes64 = new String[] {
				"javax.portlet.PortletRequest",
				"com.liferay.portal.kernel.upload.UploadPortletRequest",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName65 = "createPath";

		_methodParameterTypes65 = new String[] {
				"com.skilltailor.shopping.product.model.Product",
				"java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ProductLocalServiceUtil.addProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ProductLocalServiceUtil.createProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ProductLocalServiceUtil.deleteProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ProductLocalServiceUtil.deleteProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ProductLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ProductLocalServiceUtil.fetchProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ProductLocalServiceUtil.getProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ProductLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ProductLocalServiceUtil.getProducts(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ProductLocalServiceUtil.getProductsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ProductLocalServiceUtil.updateProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return ProductLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			ProductLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return ProductLocalServiceUtil.addProduct(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5],
				((Integer)arguments[6]).intValue(), (java.io.File)arguments[7],
				(java.io.File)arguments[8], (java.io.File)arguments[9],
				((Long)arguments[10]).longValue(),
				((Long)arguments[11]).longValue(),
				((Long)arguments[12]).longValue(),
				(java.util.List<com.skilltailor.shopping.product.model.ProductParts>)arguments[13],
				((Double)arguments[14]).doubleValue(),
				((Integer)arguments[15]).intValue(),
				((Integer)arguments[16]).intValue(),
				((Integer)arguments[17]).intValue(),
				((Boolean)arguments[18]).booleanValue(),
				((Integer)arguments[19]).intValue(),
				((Integer)arguments[20]).intValue(),
				((Boolean)arguments[21]).booleanValue(),
				(com.liferay.portal.service.ServiceContext)arguments[22]);
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return ProductLocalServiceUtil.addProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return ProductLocalServiceUtil.createProduct();
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return ProductLocalServiceUtil.createProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return ProductLocalServiceUtil.deleteProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			return ProductLocalServiceUtil.deleteProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return ProductLocalServiceUtil.getProductsCount();
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return ProductLocalServiceUtil.updateProduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return ProductLocalServiceUtil.findByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return ProductLocalServiceUtil.findByCategory(((Long)arguments[0]).longValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return ProductLocalServiceUtil.findByC_G(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return ProductLocalServiceUtil.findByProductId(((Long)arguments[0]).longValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return ProductLocalServiceUtil.updateImage((com.bryoag.shopping.image.model.Image)arguments[0],
				(com.skilltailor.shopping.product.model.Product)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2],
				(java.io.File)arguments[3], (java.io.File)arguments[4],
				(java.io.File)arguments[5], (java.lang.String)arguments[6]);
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			ProductLocalServiceUtil.uploadImage((javax.portlet.PortletRequest)arguments[0],
				(com.liferay.portal.kernel.upload.UploadPortletRequest)arguments[1],
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			ProductLocalServiceUtil.updateImage((javax.portlet.PortletRequest)arguments[0],
				(com.liferay.portal.kernel.upload.UploadPortletRequest)arguments[1],
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4]);

			return null;
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			return ProductLocalServiceUtil.createPath((com.skilltailor.shopping.product.model.Product)arguments[0],
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
}
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

import com.skilltailor.shopping.product.service.ProductServiceUtil;

import java.util.Arrays;

/**
 * @author deepakgupta02
 * @generated
 */
public class ProductServiceClpInvoker {
	public ProductServiceClpInvoker() {
		_methodName24 = "getBeanIdentifier";

		_methodParameterTypes24 = new String[] {  };

		_methodName25 = "setBeanIdentifier";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName30 = "addproduct";

		_methodParameterTypes30 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName31 = "createproduct";

		_methodParameterTypes31 = new String[] { "long" };

		_methodName32 = "deleteProduct";

		_methodParameterTypes32 = new String[] { "long" };

		_methodName33 = "deleteproduct";

		_methodParameterTypes33 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName34 = "getProductsCount";

		_methodParameterTypes34 = new String[] {  };

		_methodName35 = "updateproduct";

		_methodParameterTypes35 = new String[] {
				"com.skilltailor.shopping.product.model.Product"
			};

		_methodName36 = "findByGroupId";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "findByCategory";

		_methodParameterTypes37 = new String[] { "long" };

		_methodName38 = "findByC_G";

		_methodParameterTypes38 = new String[] { "long", "long" };

		_methodName39 = "findByProductId";

		_methodParameterTypes39 = new String[] { "long" };

		_methodName40 = "addProduct";

		_methodParameterTypes40 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "java.io.File", "java.io.File",
				"java.io.File", "long", "long", "long", "java.util.List",
				"double", "int", "int", "int", "boolean", "int", "int",
				"boolean", "com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return ProductServiceUtil.getBeanIdentifier();
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			ProductServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return ProductServiceUtil.addproduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			return ProductServiceUtil.createproduct(((Long)arguments[0]).longValue());
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return ProductServiceUtil.deleteProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return ProductServiceUtil.deleteproduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return ProductServiceUtil.getProductsCount();
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			return ProductServiceUtil.updateproduct((com.skilltailor.shopping.product.model.Product)arguments[0]);
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return ProductServiceUtil.findByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			return ProductServiceUtil.findByCategory(((Long)arguments[0]).longValue());
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			return ProductServiceUtil.findByC_G(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			return ProductServiceUtil.findByProductId(((Long)arguments[0]).longValue());
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return ProductServiceUtil.addProduct(((Long)arguments[0]).longValue(),
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

		throw new UnsupportedOperationException();
	}

	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
}
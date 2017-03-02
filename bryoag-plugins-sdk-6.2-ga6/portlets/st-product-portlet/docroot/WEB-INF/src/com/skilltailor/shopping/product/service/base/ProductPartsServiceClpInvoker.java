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

import com.skilltailor.shopping.product.service.ProductPartsServiceUtil;

import java.util.Arrays;

/**
 * @author deepakgupta02
 * @generated
 */
public class ProductPartsServiceClpInvoker {
	public ProductPartsServiceClpInvoker() {
		_methodName24 = "getBeanIdentifier";

		_methodParameterTypes24 = new String[] {  };

		_methodName25 = "setBeanIdentifier";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName30 = "addProductParts";

		_methodParameterTypes30 = new String[] {
				"com.skilltailor.shopping.product.model.ProductParts"
			};

		_methodName31 = "deleteProductParts";

		_methodParameterTypes31 = new String[] { "long" };

		_methodName32 = "deleteProductParts";

		_methodParameterTypes32 = new String[] {
				"com.skilltailor.shopping.product.model.ProductParts"
			};

		_methodName33 = "getProductParts";

		_methodParameterTypes33 = new String[] { "long" };

		_methodName34 = "getProductPartsesCount";

		_methodParameterTypes34 = new String[] {  };

		_methodName35 = "updateProductParts";

		_methodParameterTypes35 = new String[] {
				"com.skilltailor.shopping.product.model.ProductParts"
			};

		_methodName36 = "findByProductId";

		_methodParameterTypes36 = new String[] { "long" };

		_methodName37 = "findByComman";

		_methodParameterTypes37 = new String[] { "boolean" };

		_methodName38 = "findByName";

		_methodParameterTypes38 = new String[] { "java.lang.String" };

		_methodName39 = "findByCompatibleTag";

		_methodParameterTypes39 = new String[] { "java.lang.String" };

		_methodName40 = "findByPartId";

		_methodParameterTypes40 = new String[] { "long" };

		_methodName41 = "findByProductCompatibility";

		_methodParameterTypes41 = new String[] { "long", "java.lang.String" };

		_methodName42 = "findByProductName";

		_methodParameterTypes42 = new String[] { "long", "java.lang.String" };

		_methodName43 = "findByTagName";

		_methodParameterTypes43 = new String[] { "java.lang.String" };

		_methodName44 = "create";

		_methodParameterTypes44 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return ProductPartsServiceUtil.getBeanIdentifier();
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			ProductPartsServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return ProductPartsServiceUtil.addProductParts((com.skilltailor.shopping.product.model.ProductParts)arguments[0]);
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			return ProductPartsServiceUtil.deleteProductParts(((Long)arguments[0]).longValue());
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return ProductPartsServiceUtil.deleteProductParts((com.skilltailor.shopping.product.model.ProductParts)arguments[0]);
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return ProductPartsServiceUtil.getProductParts(((Long)arguments[0]).longValue());
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return ProductPartsServiceUtil.getProductPartsesCount();
		}

		if (_methodName35.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes35, parameterTypes)) {
			return ProductPartsServiceUtil.updateProductParts((com.skilltailor.shopping.product.model.ProductParts)arguments[0]);
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return ProductPartsServiceUtil.findByProductId(((Long)arguments[0]).longValue());
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			return ProductPartsServiceUtil.findByComman(((Boolean)arguments[0]).booleanValue());
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			return ProductPartsServiceUtil.findByName((java.lang.String)arguments[0]);
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			return ProductPartsServiceUtil.findByCompatibleTag((java.lang.String)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return ProductPartsServiceUtil.findByPartId(((Long)arguments[0]).longValue());
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return ProductPartsServiceUtil.findByProductCompatibility(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return ProductPartsServiceUtil.findByProductName(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return ProductPartsServiceUtil.findByTagName((java.lang.String)arguments[0]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return ProductPartsServiceUtil.create();
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
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
}
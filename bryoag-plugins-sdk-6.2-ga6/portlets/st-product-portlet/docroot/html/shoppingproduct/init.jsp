<%@page import="com.skilltailor.shopping.product.model.Product"%>
<%@page import="com.skilltailor.shopping.product.service.ProductPartsLocalServiceUtil"%>
<%@page import="com.skilltailor.shopping.product.model.ProductParts"%>
<%@page import="com.liferay.util.BeanParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portlet.shopping.DuplicateItemSKUException" %>
<%@page import="com.liferay.portlet.shopping.ItemNameException" %>
<%@page import="com.liferay.portlet.shopping.ItemSKUException" %>
<%@page import ="com.liferay.portlet.shopping.ItemLargeImageSizeException" %>
<%@page import="com.liferay.portlet.shopping.ItemMediumImageNameException"%>
<%@page import ="com.liferay.portlet.shopping.ItemMediumImageSizeException"%>
<%@page import ="com.liferay.portlet.shopping.ItemLargeImageNameException" %>
<%@page import="com.liferay.portlet.shopping.ItemSmallImageNameException"%>
<%@page import ="com.liferay.portlet.shopping.ItemMediumImageSizeException"%>
<%@page import ="com.liferay.portlet.shopping.ItemSmallImageSizeException"%>
<%@page import ="com.liferay.portal.kernel.util.PrefsPropsUtil"%>
<%@page import ="com.liferay.portal.kernel.util.PropsKeys"%>
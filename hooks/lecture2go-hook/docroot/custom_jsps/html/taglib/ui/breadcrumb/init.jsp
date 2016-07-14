<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/html/taglib/init.jsp" %>

<%
String companyName = company.getName();
String portalURL = PrefsPropsUtil.getString(company.getCompanyId(),PropsKeys.DEFAULT_LANDING_PAGE_PATH);

String breadcrumbString = "<a href='"+portalURL1+"'>"+companyName +"<a/>" + "<span class='uhh-icon-arrow-right'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>" + GetterUtil.getString((String)request.getAttribute("liferay-ui:breadcrumb:breadcrumbString"));
String displayStyle = GetterUtil.getString((String)request.getAttribute("liferay-ui:breadcrumb:displayStyle"));
%>

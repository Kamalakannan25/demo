<%@page import="com.demo.crud.service.SportsLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="pro.caption"/></b>
</p>

<%
String spoName = SportsLocalServiceUtil.findBySportsName("football").get(0).getSportsName();
System.out.println("Sports Name : "+ spoName);
System.out.println("Sports Name1 : "+ spoName);

%>

<%=spoName%>
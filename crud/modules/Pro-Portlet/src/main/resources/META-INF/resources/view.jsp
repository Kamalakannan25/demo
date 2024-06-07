<%@page import="com.demo.crud.service.SportsLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="pro.caption"/></b>
</p>

<portlet:renderURL var="queryPageRenderURL">
    <portlet:param name="mvcPath" value="/Query.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= queryPageRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Dynamic Query
    </a>
</div>


<%
String spoName = SportsLocalServiceUtil.findBySportsName("football").get(0).getSportsName();
System.out.println("Sports Name : "+ spoName);

%>

<%=spoName%>


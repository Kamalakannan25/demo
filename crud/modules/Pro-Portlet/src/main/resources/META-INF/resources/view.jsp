<%@page import="com.demo.crud.model.Sports"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.crud.service.SportsLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<portlet:renderURL var="queryPageRenderURL">
    <portlet:param name="mvcPath" value="/Query.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= queryPageRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Dynamic Query
    </a>
</div>


<%
List<Sports> sportsList = (List<Sports>) request.getAttribute("sportsList");
if (sportsList != null) {
    for (Sports sports : sportsList) {
        out.println(sports.getSportsId() + "<br/>");
    }
} else {
    out.println("No sports found.");
}


String spoName = SportsLocalServiceUtil.findBySportsName("football").get(0).getSportsName();
System.out.println("Sports Name : "+ spoName);

%>

<%=spoName%>


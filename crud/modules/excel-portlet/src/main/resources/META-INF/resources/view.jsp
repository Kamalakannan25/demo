<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>

<h1>Good evening.....</h1>

<%
List<String> duplicateEntries = (List<String>) request.getAttribute("duplicateEntries");

if (duplicateEntries != null && !duplicateEntries.isEmpty()) {

%>

<div class="alert alert-warning">
        <strong>Warning!</strong> The following entries were not added due to duplicate phone numbers:
        <ul>
            <% for (String entry : duplicateEntries) { %>
                <li><%= entry %></li>
            <% } %>
        </ul>
    </div>
    
    <% } %>



<portlet:actionURL var="uploadURL" name="uploadFile">
    <portlet:param name="mvcPath" value="/view.jsp" />
</portlet:actionURL>

<aui:form action="<%= uploadURL %>" method="post" enctype="multipart/form-data">
    <aui:input type="file" name="excelFile" />
    <aui:button type="submit" value="Upload" />
</aui:form>
<%@page import="org.json.JSONException"%>
<%@page import="java.util.List"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@ include file="/init.jsp" %>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css">
<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>


<h1>View jsp page</h1>

 <script>
$(document).ready(function() {
	$('#moduleTable').DataTable();
});
</script> 

<%
String jsonData = (String) request.getAttribute("data");
JSONObject data = new JSONObject(jsonData);
JSONArray jsonArray = data.getJSONArray("items");

%> 


<portlet:renderURL var="addFileRenderURL">
    <portlet:param name="mvcPath" value="/addFiles.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addFileRenderURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add File
    </a>
</div>

<table id="moduleTable" class="display">
    <thead>
        <tr>
            <th>ID</th>
            <th>Emp Name</th>
            <th>Emp Address</th>
            <th>Emp Aadhar</th>
            <th>Emp Phone No</th>
        </tr>
    </thead>
    <tbody>
         <%
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject module = jsonArray.getJSONObject(i);
            long id = module.getLong("id");
            String empName = module.getString("empName");
            String empAddress = module.getString("empAddress");
            long empAadhar = module.getLong("empAadhar");
            long empPhNo = module.getLong("empPhoneNo");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= empName %></td>
            <td><%= empAddress %></td>
            <td><%= empAadhar %></td>
            <td><%= empPhNo %></td>
        </tr>
        
        <% } %>
    </tbody>
</table>



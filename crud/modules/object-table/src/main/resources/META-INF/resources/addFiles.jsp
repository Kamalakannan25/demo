<%@page import="org.json.JSONArray"%>
<%@ include file="/init.jsp" %>

<h1>Image Upload file......</h1>

<portlet:actionURL name="addFilesDetails" var="addFilesDetailsRenderURL" />

<%
JSONArray fileUploadData = (JSONArray) request.getAttribute("responseId");
System.out.println("fileUploadData......" + fileUploadData);
%>

<aui:form action="<%=addFilesDetailsRenderURL%>" name="BankForm" method="POST">

<aui:row>
		<aui:col width="30">
			<aui:input name="fileUploads" label="File Uploads" type="file" />
		</aui:col>
	</aui:row>

<aui:row>
		<aui:col width="30">
			<aui:input name="name" label="Name" type="text" />
		</aui:col>
		
		<aui:col width="30">
			<aui:input name="address" label="Address" type="text" />
		</aui:col>
		
		<aui:col width="30">
			<aui:input name="phoneNumber" label="Phone Number" type="text" />
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col width="10">
			<aui:button type="submit" name="Submit" value="Submit"></aui:button>
		</aui:col>
		</aui:row>
</aui:form>


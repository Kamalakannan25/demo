<%@ include file="./init.jsp" %>

<portlet:actionURL name="sendMessage" var="sendMessage" />

<aui:form name="ipcForm" action="${sendMessage}" method="post">

<aui:input name="ipcMessage" type="text" label="Send IPC Message" ></aui:input>

<aui:button name="Submit" type="submit"></aui:button>
</aui:form>
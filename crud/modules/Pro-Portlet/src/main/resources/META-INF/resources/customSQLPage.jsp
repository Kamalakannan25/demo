 <%@page import="com.demo.crud.model.Games"%>
<%@page import="com.demo.crud.model.Players"%>
<%@page import="com.demo.crud.service.SportsLocalServiceUtil"%>
<%@page import="com.demo.crud.model.Sports"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css">
<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>

<h2>Custom SQL Query....</h2>
 
 <script>
	new DataTable('#myTable');
</script>
 
<%
List<Sports> sportsList = (List) request.getAttribute("sportsList");
List<Players> playersList = (List) request.getAttribute("playersList");
List<Games> gamesList = (List) request.getAttribute("gamesList");

if (sportsList != null) {
    System.out.println("sportsList.......sportsList : " + sportsList);
} else {
    System.out.println("sportsList is null");
}

if (playersList != null) {
    System.out.println("playersList.......playersList : " + playersList);
} else {
    System.out.println("playersList is null");
}

if (gamesList != null) {
    System.out.println("gamesList.......gamesList : " + gamesList);
} else {
    System.out.println("gamesList is null");
}
%>

 <table id="myTable" class="display">
    <thead>
        <tr>
             <th>Sport Id</th>
            <th>Sport Name</th>
            <th>Player Name</th>
            <th>Player Age</th>
            <th>Game Rules</th>
            <th>Game Members</th>
        </tr>
    </thead>
    <tbody>
     <% 
    for (Sports sport : sportsList) { 
        for (Players player : playersList) { 
        	 if (player.getSportsId() == sport.getSportsId()) {
            for (Games game : gamesList) { 
            	if (game.getPlayersId() == player.getPlayersId()) {
            
    %>
        <tr>
         	<td><%= sport.getSportsId() %></td>
            <td><%= sport.getSportsName() %></td>
            <td><%= player.getPlayersName() %></td>
            <td><%= player.getPlayersAge() %></td>
            <td><%= game.getGameRules() %></td>
            <td><%= game.getGameMembers() %></td>
        </tr>
    <% }}}}} %> 
    </tbody>
</table> 





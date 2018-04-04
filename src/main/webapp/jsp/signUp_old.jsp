<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.kai.models.User" %><%--
  Created by IntelliJ IDEA.
  User: Адель
  Date: 25/03/18
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");

%>
<table>
    <tr>
        <th>User name</th>
        <th>Birth date</th>
    </tr>
    <%
        for(User user : users) {%>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getBirthDate()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>

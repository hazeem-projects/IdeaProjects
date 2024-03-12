<%--
  Created by IntelliJ IDEA.
  User: Thilini
  Date: 2/2/2022
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<table>
    <form action="action-login" method="post">
    <tr>
        <th>
Email :
        </th>
        <td>
            <input type="text" name="e" >

        </td>
    </tr>
    <tr>
        <th>
Password :
        </th>
        <td>
            <input type="password" name="p" >
        </td>
    </tr>
    <tr>
        <th>

        </th>
        <td>
            <input type="button" value="login" >
        </td>
    </tr>
    </form>
</table>
</body>
</html>

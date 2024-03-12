<%--
  Created by IntelliJ IDEA.
  User: Thilini
  Date: 2/3/2022
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
<form action="login-action" method="post">
<table>

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
        <input type="submit" value="login" >
      </td>
    </tr>

</table>
</form>
</body>
</html>
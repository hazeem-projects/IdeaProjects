<%--
  Created by IntelliJ IDEA.
  User: Thilini
  Date: 2/3/2022
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="register-action" method="post">
    <table>
        <tr>
            <th>
                Name:
            </th>
            <td>
                <input type="text" name="n" >

            </td>
        </tr>
        <tr>
            <th>
                Email:
            </th>
            <td>
                <input type="text" name="e" >

            </td>
        </tr>
        <tr>
            <th>
                Password:
            </th>
            <td>
                <input type="password" name="p" >

            </td>
        </tr>
        <tr>
            <th>

            </th>
            <td>
                <input type="submit" value="register" >

            </td>
        </tr>
    </table>








</form>

</body>
</html>
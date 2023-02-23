<%@ page import="com.homework.servlet.service.UserService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login Success</title>
    </head>
    <body>
        Welcome <%=UserService.getInstance().userGetName()%>
        <br>
        <a href="/userData">User Data</a>
    </body>
</html>

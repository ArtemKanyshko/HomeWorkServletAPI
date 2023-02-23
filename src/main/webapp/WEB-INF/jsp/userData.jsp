<%@ page import="com.homework.servlet.service.UserService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>User Data</title>
    </head>
    <body>
        <%=UserService.getInstance().userInfo()%>
    </body>
</html>

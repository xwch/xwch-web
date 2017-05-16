<%--
  Created by IntelliJ IDEA.
  User: xwch
  Date: 2017/4/9
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login" method="post">
        <label>username：</label>
        <label>
            <input type="text" name="username">
        </label>
        <br />

        <label>password：</label>
        <label>
            <input type="text" name="password">
        </label>
        <br />

        <input type="submit" value="submit">
        <br />

    </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: doorGlazing
  Date: 2020/9/13
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/ele">
    账号:<input type="text" name="uname">
    <br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登陆">
  </form>
  ${sessionScope.success}
  </body>
</html>

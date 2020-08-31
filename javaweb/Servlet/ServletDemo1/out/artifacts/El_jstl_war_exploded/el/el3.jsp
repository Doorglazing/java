<%@ page import="el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setName("小桌子");
    user.setBirthday(new Date());
    request.setAttribute("u", user);
    ArrayList<Object> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add(user);

    HashMap<String, Object> map = new HashMap<>();
    map.put("user", user);
    request.setAttribute("map", map);
%>
<h1>获取user对象中的内容</h1>
${requestScope.u}
<h1>对象属性获取</h1>
${map.user}
${map["user"]}
${map.user.name}
${requestScope.u.name}
${requestScope.u.birthday}

</body>
</html>

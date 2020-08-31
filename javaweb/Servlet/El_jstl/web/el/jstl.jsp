<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- c:if--%>
<%--        1. 属性 test 必须属性， 接受的是boolean表达式--%>
<%--           一般 test 配合el 表达式 一起使用--%>
<%--        2. 没有else 部分--%>
<%--            想要的话需要 在定义一个c:if --%>

    <c:if test="false">
        <h1>还有一个月就过节了</h1>
    </c:if>
<%
    ArrayList<Object> list = new ArrayList<>();
    list.add("aaa");
    request.setAttribute("list", list);
    request.setAttribute("number", 5);
%>
<c:if test="${not empty requestScope.list}">
    <p>遍历集合</p>
</c:if>
<c:if test="${number mod 2 !=0}">
    <p>number为奇数</p>
</c:if>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("num", 52);
%>

    <d:choose>
        <d:when test="${num mod 7 == 1}">星期一</d:when>
        <d:when test="${num mod 7 == 2}">星期二</d:when>
        <d:when test="${num mod 7 == 3}">星期三</d:when>
        <d:when test="${num mod 7 == 4}">星期四</d:when>
        <d:when test="${num mod 7 == 5}">星期五</d:when>
        <d:when test="${num mod 7 == 6}">星期六</d:when>
        <d:when test="${num mod 7 == 0}">星期日</d:when>
        <d:otherwise>过年</d:otherwise>
    </d:choose>
<!--
    d:forEach
    begin 开始
    end 结束
    var 临时变量
    step 步长
    varStatus: 循环状态对象
        index: 容器中的索引
        count: 循环次数(从开始)
    items: 容器对象
 -->
<br>
<d:forEach items="ites" var="str">
    ${str}
</d:forEach>
</body>
</html>

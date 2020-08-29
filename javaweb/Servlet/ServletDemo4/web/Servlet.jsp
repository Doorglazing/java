<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% response.setContentType("text/html;charset=utf-8");
    Cookie[] cookies = request.getCookies();
    boolean key = false;
    if(cookies != null && cookies.length > 0){
        for(Cookie cookie : cookies){
            String name = cookie.getName();
            if("lastTime".equals(name)){
                key = true;
                String value = cookie.getValue();
                // 解码
                value = URLDecoder.decode(value, "utf-8");
%>
<p>"欢迎登录，您的上次访问实际为：" <%= value %></p>
<%
                Date date = new Date();
                String now_date = new SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss").format(date);
                // 编码
                System.out.println(now_date);
                now_date = URLEncoder.encode(now_date, "utf-8");
                System.out.println(now_date);
                cookie.setValue(now_date);
                cookie.setMaxAge(3600*24*30);
                response.addCookie(cookie);
                break;
            }
        }
    }
    if(cookies == null || cookies.length == 0|| key == false){
        Date date = new Date();
        String now_date = new SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss").format(date);
        now_date = URLEncoder.encode(now_date, "utf-8");
        Cookie cookie = new Cookie("lastTime", now_date);
        response.addCookie(cookie);
%>
<p>欢迎您首次访问</p>
<% } %>
<input type="text">
</body>
</html>

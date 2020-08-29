<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            color: red;
        }
    </style>
    <script>
        window.onload = function () {
            var img = document.querySelector("#img");
            img.onclick = function () {
                this.src = "/checkCodeServlet?name:" + new Date().getTime();
            }
        }
    </script>
</head>
<body>
    <table>
        <form action="LoginServlet" method="post">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="checkCode"></td>
            </tr>
            <tr>
                <td colspan="2"><img src="/checkCodeServlet" alt="" id="img"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </form>
    </table>
    <div><%= request.getAttribute("check_error") == null ? "" : request.getAttribute("check_error") %></div>
    <div><%= request.getAttribute("user_error") == null ? "" : request.getAttribute("user_error") %></div>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html,body{
            width: 100%;
            height: 100%;
            background: url("./src/bgc.jpg");
        }
        .wrapper{
            width: 500px;
            height: 500px;
            position: absolute;
            top: 50%;
            left: 50%;
            margin-left: -250px;
            margin-top: -250px;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: rgb(255,255,255);
            opacity: 0.6;
        }
        .wrapper form div{
            margin: 20px 0;
        }
        .wrapper form div input{
            height: 35px;
            width: 200px;
        }
        .wrapper form .btn1{
            margin-right: 80px;
        }
        .wrapper form div .btn{
            height: 35px;
            width: 100px;
            float: right;
            margin-right: 4px;
        }
        .wrapper form div span{
            display: inline-block;
            width: 50px;
        }
        .check{
            display: flex;
            align-content: center;
            align-items: center;
        }
        .check img{
            margin-left: 5px;
        }
        .font{
            color: red;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <div>
        <form action="loginServlet1" method="post">
            <div>
                <span>用户名</span><input type="text" name="username">
            </div>
            <div>
                <span>密码</span><input type="password" name="password">
            </div>
            <div class="check">
                <span>验证码</span><input type="text" name="checkCode">
                <img src="/checkCodeServlet" alt="" id="img">
            </div>
            <div class="btn1">
                <input class="btn" type="button" value="注册">
                <input class="btn" type="submit" value="登录">
            </div>
            <div class="font"><%= request.getAttribute("check_error") == null ? "" : request.getAttribute("check_error") %></div>
            <div class="font"><%= request.getAttribute("login_error") == null ? "" : request.getAttribute("login_error") %></div>
        </form>
    </div>
</div>
<script>
    var img = document.querySelector("#img");
    img.onclick = function () {
        this.src = "/checkCodeServlet?name=" + new Date().getTime();
    }
</script>
</body>
</html>
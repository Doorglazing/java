<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            list-style: none;
        }
        @keyframes move{
            0%{
                transform: rotatex(0deg) rotatey(0deg);
            }
            100%{
                transform: rotatex(360deg) rotatey(360deg);
            }
        }
        html,body{
            width: 100%;
            height: 100%;
        }

        div{
            width: 300px;
            height: 300px;
            margin: 0 auto;
            perspective: 20000px;
            /* 景深设置的太小有点不想正方形 */
        }
        ul{
            width: 300px;
            height: 300px;
            transform-style: preserve-3d;
            transform-origin: 100px 100px 100px;
            position: absolute;
            animation: move 5s linear infinite;
            margin: 100px auto;
        }
        ul li{
            width: 300px;
            height: 300px;
            position: absolute;
            text-align: center;
            line-height: 300px;
            font-size: 30px;
        }
        ul li:nth-of-type(1){
            transform-origin: bottom;
            transform: rotateX(90deg);
            background: rgba(000,000,000,0.3);
        }
        ul li:nth-of-type(2){
            transform-origin: top;
            transform: rotateX(-90deg);
            background: rgba(255,000,000,0.3);
        }
        ul li:nth-of-type(3){
            transform-origin: left;
            transform: rotatey(90deg);
            background: rgba(000,255,000,0.3);
        }
        ul li:nth-of-type(4){
            transform-origin: right;
            transform: rotatey(-90deg);
            background: rgba(000,000,255,0.3);
        }
        ul li:nth-of-type(5){
            transform: translatez(-300px);
            background: rgba(255,255,000,0.3);
        }
        ul li:nth-of-type(6){
            background: rgba(255,000,255,0.3);
        }
    </style>
</head>
<body>
<div>
    <ul>
        <li>欢</li>
        <li>迎</li>
        <li>光</li>
        <li>临</li>
        <li>!</li>
        <li>!</li>
    </ul>
</div>
</body>
</html>

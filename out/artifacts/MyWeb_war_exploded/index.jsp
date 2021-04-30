<%--
  Created by IntelliJ IDEA.
  User: cw
  Date: 2020/12/1
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
<link href="buttons.css" rel="stylesheet">
    <style type="text/css">
      a:visited{color:#000000;}
      a:hover{color:#8a2be2;}
      body{
        background: url("Image/2.png");
        background-size:75% 100% ;
        background-attachment: fixed;
        background-color:rgba(0,152,50,0.7);
      }
    </style>
  </head>
  <!--<body style=" background-image: url(Image/image.jpg);background-size:cover" >-->
  <body>
  <h1 align="center">
    <span style="color: black;">旅行预订管理系统
    </span></h1>
  <!--
			action: 请求的地址
			method: 请求的方式
					GET   :将请求数据拼接到请求地址中， 直接暴露出来. 3http://localhost:8888/web01/login?username=Admin&password=123456
					POST  :将请求数据存到请求体中提交，不会直接暴露出来。
		 -->
  <br>
  <div style="text-align:center">
    <a href="search.jsp"> <button class="button button-primary button-glow button-pill button-medium">查询预定客户信息</button></a>
    <br><br>
    <a href="update.jsp"> <button class="button button-primary button-glow button-pill button-medium">信息查询服务</button></a>
    <br><br>
    <a href="resv.jsp"> <button class="button button-primary button-glow button-pill button-medium">预约服务</button></a>
    <br><br>
    <a href="route.jsp"> <button class="button button-primary button-glow button-pill button-medium">查询旅行线路</button></a>
  </div>
  </body>
</html>

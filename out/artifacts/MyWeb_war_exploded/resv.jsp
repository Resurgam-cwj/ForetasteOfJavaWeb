<%--
  Created by IntelliJ IDEA.
  User: cw
  Date: 2020/12/6
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
<link href="buttons.css" rel="stylesheet">
</head>
<body>
<div>
    <form action="Resv" method="post">
        <h1>预约服务</h1>
        <br>
        请输入您的姓名：
        <br>
        <input type="text" name="name"/>
        <br>
        请输入您的id：
        <br>
        <input type="text" name="id"/>
        <br>
        请输入您需要预约的类型（flights、hotels、bus）:
        <br>
        <input type="text" name="type"/>
<%--        <span id="login_span">${requestScope.login_msg}</span>--%>
        <br>
        请输入您要预约的航班号或旅社大巴地址：
        <br>
        <input type="text" name="fl"/>
        <br>
        <span id="resv_span">${requestScope.resv_msg}</span>
        <br>
        <span id="key_span">${requestScope.key_msg}</span>
        <br>
        <div class="form-group"><input type="submit" class="button button-primary button-pill button-medium" value="提交"/></div>
        <br>
        <div style="text-align:center">
            <input align="center" type = "button" class="button button-pill button-medium" value = "返回" onclick = "window.location.href = 'index.jsp'" data-loading-text="Loading...">
        </div>
    </form>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: cw
  Date: 2020/12/17
  Time: 15:03
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
<h1>线路查询服务</h1>
<form action="Route" method="post">
    <h1>请输入您的姓名。</h1>
    <br>
    <br>
    <input type="text" name="custNAME"/>
    <span id="route_span">${requestScope.route_msg}</span>
    <br>
    <div class="form-group"><input type="submit" class="button button-primary button-pill button-medium" value="确认"/></div>
</form>

</body>
</html>

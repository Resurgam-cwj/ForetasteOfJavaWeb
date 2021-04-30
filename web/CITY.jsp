<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: cw
  Date: 2020/12/17
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
    <link href="buttons.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>
<h1 align = "center">
    <span style="color: black;">旅行线路</span></h1>
<br>
<br>
<br>
<table class="table table-striped" >
    <tr align="center">
        <td>FromCity</td>
        <td>ArivCity</td>
    </tr>
    <%
        List<String> citys =(List<String> )request.getAttribute("city");
        String f = (String)request.getAttribute("flag");
        for(int i =0 ;i < citys.size();i=i+2 ){
    %>
    <tr align="center">
        <td><%=citys.get(i) %></td>
        <td><%=citys.get(i+1) %></td>

    </tr>
    <%
        }
    %>
</table>
<br>
<br>
<span style="color: black;"><%=f %></span></h1>

<div style="text-align:center">
    <input align="center" type = "button" value = "返回" onclick = "window.location.href = 'index.jsp'" class="btn btn-primary" data-loading-text="Loading...">
</div>
</body>
</html>

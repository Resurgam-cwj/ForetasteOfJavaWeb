<%--
  Created by IntelliJ IDEA.
  User: cw
  Date: 2020/12/4
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@page import="myweb.login.FLIGHT.flight "%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">-->

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
<link href="buttons.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>
<h1 align = "center">
    <span style="color: black;">INFORMATION OF FLIGHT</span></h1>

    <table class="table table-striped" >
        <tr align="center">
            <td >flightNum</td>
            <td >price</td>
            <td >numSeats</td>
            <td>numAvail</td>
            <td>FromCity</td>
            <td>ArivCity</td>
        </tr>
        <%
        List<flight> flights =(List<flight> )request.getAttribute("flights");
        for(flight fl :flights ){
        %>
        <tr align="center">
            <td><%=fl.getFlightNum() %></td>
            <td><%=fl.getPrice() %></td>
            <td><%=fl.getNumSeats() %></td>
            <td><%=fl.getNumAvail() %></td>
            <td><%=fl.getFromCity() %></td>
            <td><%=fl.getArriveCity() %></td>
        </tr>
<%
    }
        %>
    </table>

<div style="text-align:center">
    <input align="center" type = "button" value = "返回" onclick = "window.location.href = 'index.jsp'" class="btn btn-primary" data-loading-text="Loading...">
</div>
</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生信息</title>
  </head>
  <body>
  	<h3 align="center">学生信息列表<h3>
 	<hr>
  		<table border="1px" align="center" width="1000px" height="300px">
  			<tr>
  				<td>学号</td>
  				<td>姓名</td>
  				<td>性别</td>
  				<td>专业</td>
  				<td>学院</td>
  				<td>年级</td>
  				<td>
  					操作
  		        </td> 
  		    </tr> 
  		   <c:forEach items="${infoList }" var="info">
			<tr>
 				<td>${info.stuid}</td>
				<td>${info.stuname}</td>	
				<td>${info.stusex}</td>
				<td>${info.speciality}</td>
				<td>${info.academe}</td>
				<td>${info.grade}</td>
				<td><a href="/user/editInfo.action?stuid=${info.stuid}">修改</a>
				<a href="/user/deleteInfo.action?stuid=${info.stuid}">删除</a>
				</td>
			</tr>
			</c:forEach>
  		</table>
  			<p align="center">
    		<a href="/user/addInfo.action">添加新学生</a>
    		</p>
  </body>
</html>

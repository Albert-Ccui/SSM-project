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
    <title>教师信息</title>
  </head>
  <body>
  	<h3 align="center">教师信息列表<h3>
 	<hr>
  		<table border="1px" align="center" width="600px" height="300px">
  			<tr>
  				<td>教师工号</td>
  				<td>教师姓名</td>
  				<td>所在专业</td>
  				<td>职称</td>
  				<td>所教课程</td>
  				<td>
  					操作
  		        </td> 
  		    </tr> 
  		   <c:forEach items="${techerList}" var="techer">
			<tr>
 				<td>${techer.techid}</td>
				<td>${techer.techname}</td>	
				<td>${techer.speciality}</td>
				<td>${techer.title}</td>	
				<td>${techer.techcourse}</td>
				<td><a href="/techer/editTecher.action?techid=${techer.techid}">修改</a>
				<a href="/techer/deleteTecher.action?techid=${techer.techid}">删除</a>
				</td>
			</tr>
			</c:forEach>
  		</table>
  			<p align="center">
    		<a href="/techer/addTecher.action">添加新课程</a>
    		</p>
  </body>
</html>


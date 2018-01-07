<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改信息</title>
    <base href="<%=basePath%>">
  </head>
  <body>
  <br>
  <p align="center">修改学生信息</p>
    	<form  method="post" action="/user/edit.action" >
    		<table align="center" >
    		<tr><td>学号:</td><td><input type="text" name="stuid" value="${info.stuid}"/></td></tr><br>
    		<tr><td>姓名:</td><td><input type="text" name="stuname" value="${info.stuname}"/></td></tr><br>
    		<tr><td>性别:</td><td><input type="text" name="stusex" value="${info.stusex}""/></td></tr><br>
    		<tr><td>专业:</td><td><input type="text" name="speciality" value="${info.speciality}"/></td></tr><br>
    		<tr><td>学院:</td><td><input type="text" name="academe" value="${info.academe}"/></td></tr><br>
    		<tr><td>年级:</td><td><input type="text" name="grade" value="${info.grade}""/></td></tr><br>
    		<tr><td><input type="submit" value="确认修改"></td></tr>
    		</table>
    	</form>
  </body>
</html>

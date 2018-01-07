<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改课程信息</title>
    <base href="<%=basePath%>">
  </head>
  <body>
  <br>
  <p align="center">修改学生信息</p>
    	<form  method="post" action="/course/edit.action" >
    		<table align="center" >
    		<tr><td>课程编号:</td><td><input type="text" name="courseid" value="${course.courseid}"/></td></tr><br>
    		<tr><td>课程名称:</td><td><input type="text" name="coursename" value="${course.coursename}"/></td></tr><br>
    		<tr><td><input type="submit" value="确认修改"></td></tr>
    		</table>
    	</form>
  </body>
</html>
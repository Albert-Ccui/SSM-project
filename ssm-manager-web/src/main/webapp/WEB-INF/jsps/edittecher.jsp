<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改教师信息</title>
    <base href="<%=basePath%>">
  </head>
  <body>
  <br>
  <p align="center">修改教师信息</p>
    	<form  method="post" action="/techer/edit.action" >
    		<table align="center" >
    		<tr><td>教师工号:</td><td><input type="text" name="techid" value="${techer.techid}"/></td></tr><br>
    		<tr><td>教师姓名:</td><td><input type="text" name="techname" value="${techer.techname}"/></td></tr><br>
    		<tr><td>所在专业:</td><td><input type="text" name="speciality" value="${techer.speciality}"/></td></tr><br>
    		<tr><td>职称:</td><td><input type="text" name="title" value="${techer.title}"/></td></tr><br>
    		<tr><td>所教课程:</td><td><input type="text" name="techcourse" value="${techer.techcourse}"/></td></tr><br>
    		<tr><td><input type="submit" value="确认修改"></td></tr>
    		</table>
    	</form>
  </body>
</html>
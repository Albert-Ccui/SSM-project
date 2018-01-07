<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%@ include file="/common/common.jspf"%>
    <title>添加信息</title>
  </head>
  <body>
  <br>
  <br>
  <br>
  <h3 align="center">新学生信息<h3>
  <hr>
    	<form  method="post" action="/user/add.action">
    		<table align="center">
    		<tr><td>学号:</td><td><input type="text" name="stuid"></td></tr><br>
    		<tr><td>姓名:</td><td><input type="text" name="stuname"></td></tr><br>
    		<tr><td>性别:</td><td><input type="text" name="stusex"></td></tr><br>
    		<tr><td>专业:</td><td><input type="text" name="speciality"></td></tr><br>
    		<tr><td>学院:</td><td><input type="text" name="academe"></td></tr><br>
    		<tr><td>年级:</td><td><input type="text" name="grade"></td></tr><br>
    		<tr><td align="center"><input type="submit" value="添加"></td></tr>
    		</table>
    	</form>
  </body>
</html>

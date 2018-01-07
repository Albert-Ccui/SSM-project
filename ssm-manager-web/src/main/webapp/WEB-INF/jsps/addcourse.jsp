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
  <h3 align="center">新课程信息<h3>
  <hr>
    	<form  method="post" action="/course/addcourse.action">
    		<table align="center">
    		<tr><td>课程编号:</td><td><input type="text" name="courseid"></td></tr><br>
    		<tr><td>课程名称:</td><td><input type="text" name="coursename"></td></tr><br>
    		<tr><td align="center"><input type="submit" value="添加"></td></tr>
    		</table>
    	</form>
  </body>
</html>

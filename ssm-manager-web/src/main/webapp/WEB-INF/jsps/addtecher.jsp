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
  <h3 align="center">新教师信息<h3>
  <hr>
    	<form  method="post" action="/techer/addtecher.action">
    		<table align="center">
    		<tr><td>教师工号:</td><td><input type="text" name="techid"></td></tr><br>
    		<tr><td>教师姓名:</td><td><input type="text" name="techname"></td></tr><br>
    		<tr><td>所在专业:</td><td><input type="text" name="speciality"></td></tr><br>
    		<tr><td>职称:</td><td><input type="text" name="title"></td></tr><br>
    		<tr><td>所教课程:</td><td><input type="text" name="techcourse"></td></tr><br>
    		<tr><td align="center"><input type="submit" value="添加"></td></tr>
    		</table>
    	</form>
  </body>
</html>
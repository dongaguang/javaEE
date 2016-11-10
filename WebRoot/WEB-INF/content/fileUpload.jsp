<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>测试文件上传</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  	<form action="upload" method="post" enctype="multipart/form-data">
  		<span>文件标题：</span><input type="text" name="title" />
  		<span>选择文件：</span><input type="file" name="upload" />
  		<input type="submit" value="上传" />
  	</form>
  	<!--<s:form action="login">
  		<s:textfield name="userName" label="用户名"/>
  		<s:textfield name="password" label="密码"/>
  		<s:submit value="注册" />
  	</s:form> -->
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="entity.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<% //session 验证
	
	Object obj = session.getAttribute("user");
	if(obj == null){
		response.sendRedirect("login.jsp");
		return;
	}
	%>
	<h1>主功能页面</h1>
</body>
</html>
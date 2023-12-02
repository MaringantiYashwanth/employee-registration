<%@page import="com.employee.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee table</title>
</head>
<body bgcolor="cyan">
	<%
		Employee e1 = (Employee)session.getAttribute("employee");
		out.println(e1);
		out.println(e1.getEid());
		out.println(e1.getEname());
		out.println(e1.getEtech());
	%>
</body>
</html>
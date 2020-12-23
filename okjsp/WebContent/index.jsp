<%@page import="okjsp2.HelloWorld" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>
<h2><%=new HelloWorld().getHello() %></h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>

<!-- 
	bean 을 이용해 처리할때.. 
	아래 expression tag(user.isOk()) 사용하여 결과 확인 할 수 있다.
-->
<%-- <jsp:useBean id="user" class="okjsp2.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
</head>
<body>
<% 
	// scriptlet
	//String id = request.getParameter("id");
	//String password = request.getParameter("password");
//	boolean isOk = (id != null) && id.equals("admin") && 
	//		(password!= null) && password.equals("okpass");

%>
<br>
<!-- el 사용  -->
result: <%= request.getAttribute("result") %>
<%-- <%= user.isOk() %> --%>

from bean
</body>
</html>
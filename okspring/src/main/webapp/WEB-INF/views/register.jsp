<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<style>
	.msg {
		color:#f00;
	}
</style>
</head>
<body>

	<form method="post" action="register.do">
		id : <input type="text" name="id" value="${user.id}"><br>
		pw : <input type="password" name="password"><br>
		confirm pw : <input type="password" name="confirmPassword"><br>
		<input type="submit" value="register">
		<br>
		<!-- Expression Language : EL  -->
		<span class="msg">${msg}</span>
	</form>
</body>
</html>
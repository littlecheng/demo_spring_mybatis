<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<h1>login</h1>
	<form action="login" method="post">

		<label>用户名</label> <input type="text" name="userName">
		 <label>密码</label><input type="password" name="password"> 
		 <input type="submit" value="提交">${message}
	</form>
</body>
</html>
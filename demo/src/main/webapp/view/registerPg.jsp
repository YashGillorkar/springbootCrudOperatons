<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
div {
	height: 340px;
	width: 300px;
	border: 2px solid;
	margin-left: auto;
	margin-right: auto;
	text-align: center;
	border-radius: 9px;
}

input {
	margin-bottom: 10px
}
</style>
</head>
<body>
	<pre>
<form action="registerForm">
<div>
<h1>Login Form</h1>
Name:<input type="text" name="name">
Age:<input type="number" name="age">
UserName:<input type="text" name="username">
Password:<input type="password" name="password">

<input type="submit" value="SAVE"> 
</div>
</form>
</pre>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<style type="text/css">
	#container{
		height: 250px;
		width: 300px;
		border: 2px solid;
		margin-right :auto;
		margin-left: auto;
		padding: 15px;
		text-align: center;
		margin-top: 70px;
	}
	
	input{
		padding: 5px;
		margin-bottom: 8px;
	}

</style>
</head>
<body>
<div id="container">
<form action="registerSuccess">
Name:<input type="text" name="name" placeholder="Enter Name"><br>
Username:<input type="text" name="username" placeholder="Enter Username"><br>
Password:<input type="password" name="password" placeholder="Enter Password"><br>
<input type="submit" value="regi">
</form>
</div>

</body>
</html>
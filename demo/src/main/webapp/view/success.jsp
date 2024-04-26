<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>

	<table>
	
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>UserName</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${data}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td>${s.age}</td>
				<td>${s.username}</td>
				<td>${s.password}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>
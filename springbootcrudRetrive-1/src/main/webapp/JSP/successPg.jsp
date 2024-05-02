<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Successful</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	text-align: center;
	width: 90%;
	max-width: 600px;
	margin: 0 auto;
}

.user-table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 20px;
}

.user-table th, .user-table td {
	border: 1px solid #ddd;
	padding: 8px;
}

.user-table th {
	background-color: #007bff;
	color: #fff;
}

.success-container {
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	margin-top: 20px;
}

.success-container h2 {
	margin-bottom: 20px;
	color: #007bff;
}

.success-container p {
	font-size: 18px;
	color: #333;
}
</style>
</head>

<body>

	<div class="container">
		<c:if test="${not empty data}">
			<table class="user-table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Username</th>
						<th>Password</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${data}" var="s">
						<tr>
							<td>${s.id}</td>
							<td>${s.name}</td>
							<td>${s.username}</td>
							<td>${s.password}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<div class="success-container">
			<h2>Registration Successful!</h2>
			<p>Your registration has been completed successfully.</p>
			<p>
				<a href="backToLogin">Proceed to Login</a>
			</p>
		</div>
	</div>

</body>
</html>

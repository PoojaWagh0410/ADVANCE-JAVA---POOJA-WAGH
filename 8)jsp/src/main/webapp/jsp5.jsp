<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.qspiders.jsp.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Connected</title>
</head>
<body>
	<%
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) request.getAttribute("users");
	%>
	<div align="center">
		<table border="3px solid green" cellspacing="0">
			<tr>
				<th>Username</th>
				<th>Password</th>
			</tr>
			<%
			for (User user : users) {
			%>
			<tr>
				<td><%=user.getUsername()%></td>
				<td><%=user.getPassword()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>



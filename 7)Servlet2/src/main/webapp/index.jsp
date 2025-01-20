<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Any 2 Numbers here :</h1>

	<form>
		<table>
			<tr>
				<td>Number 1 :</td>
				<td><input type="number" name="num1"></td>
			</tr>
			<tr>
				<td>Number 2:</td>
				<td><input type="number" name="num2"></td>
			</tr>
		</table>
		<input type="submit" value="Add">
		
		
		<%
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
		%>
</body>
</html>
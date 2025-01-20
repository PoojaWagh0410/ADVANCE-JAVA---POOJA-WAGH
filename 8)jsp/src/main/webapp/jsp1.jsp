<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1</title>
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
		// Initialize variables for num1, num2, and sum
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		if (num1Str != null && num2Str != null) {

			int num1 = Integer.parseInt(num1Str);
			int num2 = Integer.parseInt(num2Str);
			int sum = num1 + num2;
		%>

		<h1>
			The sum of
			<%=num1%>
			and
			<%=num2%>
			is
			<%=sum%>.
		</h1>
		<%
		}
		%>
	</form>

</body>
</html>

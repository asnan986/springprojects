<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="executeAddStudent" method="post">
		<table>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="studentname" value="" /></td>
			</tr>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="studentid" value="" /></td>
			</tr>
			<tr>
				<td>Student Branch</td>
				<td><input type="text" name="studentbranch" value="" /></td>
			</tr>
			<tr>
				<td>Student CGPA</td>
				<td><input type="text" name="studentcgpa" value="" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="add" /></td>
				<td><input type="reset" value="clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
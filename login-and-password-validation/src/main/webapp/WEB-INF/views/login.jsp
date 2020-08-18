<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/submitlogin" method="post" modelAttribute="login">
	
		<h2>Welcome to ABC web portal!!!</h2>
		<table >
			<tr>
				<td>Enter the Username</td>
				<td><form:input id="userName" path="userName" name="userName" /></td>
			</tr>
			<tr>
				<td>Enter the Password</td>
				<td><form:input id="password" path="password" name="password" /></td>
			</tr>

			<tr>
				<td class="submit"><input type="submit" value="Login" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<style>
h2{
text-align: center;
color: blue;

}
table {
  margin-left: auto;
  margin-right: auto;
  color: navy;
}

</style>
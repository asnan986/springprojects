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
	<form:form action="addnewproduct" method="post"
		modelAttribute="product">
		<b>Add new product</b>
		<table>
			<tr>
				<td>Enter the Product Id</td>
				<td><form:input id="pid" path="pid" name="pid" /></td>
			</tr>
			<tr>
				<td>Enter the Product name</td>
				<td><form:input id="pname" path="pname" name="pname" /></td>
			</tr>
			<tr>
				<td>Enter the Quantity</td>
				<td><form:input id="quantity" path="quantity" name="quantity" /></td>
			</tr>
			<tr>
				<td>Enter the Price</td>
				<td><form:input id="price" path="price" name="price" /></td>
			</tr>
			<tr><td><input type="submit" value="Add product"/></td>
			<td><input type="reset" value="cancel selections"/></td>
			</tr>
			</table>
	</form:form>
</body>
</html>
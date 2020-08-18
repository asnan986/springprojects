<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="calculateCost" method="post" modelAttribute="ticket">
		<h1>Movie Ticket Booking</h1>
		<table>
			<tr>
				<td>Movie Name</td>
				<td><form:input path="movieName" id="movieName"
						name="movieName" /></td>
			</tr>
			<tr>
				<td>Choose Circle</td>
				<td><form:select path="circleType" name="circleType"
						id="circleType">
						<form:option value="${circleList['250'] }" selected="selected">${circleList['250']}</form:option>
						<form:option value="${circleList['150'] }" >${circleList['150']}</form:option>
					</form:select></td>
			<tr><td>Number of Tickets</td>
				<td><form:input path="noOfTickets" name="noOfTickets"
						id="noOfTickets" /></td>
			</tr>
			<tr><td><input type="submit" value="CalculateCost"/>
		</table>
	 </form:form>
</body>
</html>
<style>
h1{
text-align:center;

}
table{
margin-left: auto;
margin-right: auto;
}
</style>
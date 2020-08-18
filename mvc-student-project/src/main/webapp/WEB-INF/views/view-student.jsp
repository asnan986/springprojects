<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="com.dxc.mvc.student.model.Student,java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<thead>
			<tr>
				<td>Product Id</td>
				<td>Product Name</td>
				<td>Quantity</td>
				<td>Price</td>
			</tr>
		</thead>
		
		<tbody>
		<c:if test="${not empty  }"></c:if></tbody>
		<c:forEach var="student" item="">
		<tr><b>
		<td>${student.sname}</td>
		<td>${student.sid}</td>
		<td>${student.sdept}</td>
		<td>${student.sCgpa}</td>
		</b>
		</tr>
		</c:forEach>
</body>
</html>
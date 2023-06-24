<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp List</title>
</head>
<body>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Employees from the Department</caption>
		<c:forEach var="emp" items="${requestScope.emp_list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.email}</td>
				<td>${emp.joinDate}</td>
			</tr>
		</c:forEach>


	</table>
	</form>
</body>
</html>
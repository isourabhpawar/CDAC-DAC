<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<spring:url var="url" value="/emp/list"/>
	<form action="${url}" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<caption>All Departments</caption>
			<tr>
				<td>Select Department</td>
				<td><select name="dept_id">
						<c:forEach var="dept" items="${requestScope.dept_list}">
							<option value="${dept.id}">${dept.departmentName}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Choose Department" /></td>
			</tr>

		</table>
	</form>
</body>
</html>
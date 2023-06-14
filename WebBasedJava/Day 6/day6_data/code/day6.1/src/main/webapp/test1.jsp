<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="custom_err_page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int a = 100;
	int b = 0;
	int c = a / b;
	%>
	<h5>
		Result :
		<%=c%></h5>
</body>
</html>
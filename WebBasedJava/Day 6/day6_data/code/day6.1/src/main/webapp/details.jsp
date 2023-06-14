<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details Page</title>
</head>
<body>
	<h4>Validated User Details : ${sessionScope.user_dtls}</h4>
	<%
	 String encodedURL=response.encodeURL("logout.jsp");
	%>
	<h5>
		<a href="<%= encodedURL %>">Log Me Out</a>
	</h5>
</body>
</html>
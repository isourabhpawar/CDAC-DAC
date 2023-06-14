<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 align="center">JSESSIONID : <%=session.getId() %></h5>
	<h5>
		Welcome 2 JSP @
		<%=LocalDateTime.now()%></h5>
	<h5>
		<a href="comments.jsp">Test Comments</a>
	</h5>
	<h5>
		<a href="login.jsp">Test Scriptlets n Expressions EL syntax</a>
	</h5>
	<h5>
		<a href="login2.jsp">User Login with URL Rewriting</a>
	</h5>
	<h5>
		<a href="test1.jsp">Centralized Error Handling in JSP</a>
	</h5>
	<h5>
		<a href="test2.jsp">include directive</a>
	</h5>
	<h5>
		<a href="test4.jsp?nm=brown_bread&price=50">forward action</a>
	</h5>
	<h5>
		<a href="test6.jsp?nm=pizza&price=150">include action</a>
	</h5>
</body>
</html>
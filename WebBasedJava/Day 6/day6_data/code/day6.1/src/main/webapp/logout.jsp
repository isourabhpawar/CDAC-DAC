<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--session.getAttribute("user_dtls").getFullName() --clnt --%>
	<h5>Hello , ${sessionScope.user_dtls.fullName}</h5>
	<%-- <%
	session.invalidate();
	%> --%>
	${pageContext.session.invalidate()}
	<h5>You have logged out...</h5>
	<h5>
		<a href="index.jsp">Visit Again</a>
	</h5>
</body>
</html>
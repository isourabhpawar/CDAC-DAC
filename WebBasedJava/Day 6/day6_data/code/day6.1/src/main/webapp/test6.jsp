<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>From 1st page....</h5>
	<%
	out.flush();
	String pName = request.getParameter("nm");
	int price = Integer.parseInt(request.getParameter("price"));
	request.setAttribute("product_dtls", "Product Name " + pName + "sold @ " + price);
	%>
	<jsp:include page="test7.jsp">
		<jsp:param value="eatables" name="category" />
	</jsp:include>
	<h5>contents post inclusion....</h5>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<jsp:setProperty property="*" name="user" />
<body>
	<%--session.getAttribute("user") : UserBean .validateUser() --%>
	<%-- <h5>Nav status : ${sessionScope.user.validateUser()}</h5> --%>
	<%--redirect the clnt to the next page in the NEXT request --%>
	<%--response.sendRedirect(response.encodeRedirectURL(session.getAttribute("user").validateUser().concat(".jsp"));--%>
	<c:redirect url="${sessionScope.user.validateUser()}.jsp" />
</body>
</html>





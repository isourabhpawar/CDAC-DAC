<%@page import="pojos.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Validation Page</title>
</head>
<%!//JSP declaration block
	HashMap<String, User> users;

	public void testMe() {
	}

	public void jspInit() {
		System.out.println("in jsp init");
		users = new HashMap<>();
		//populate HM
		//email, String password, String fullName, int age
		users.put("rama@gmail.com", new User("rama@gmail.com", "1234", "Rama Kher", 30));
		users.put("mihir@gmail.com", new User("mihir@gmail.com", "2234", "Mihir Sen", 40));
	}%>
<body>
	<h5>From validate.jsp ......</h5>
	<%
	//scriptlet
	//1. get rq params
	String email = request.getParameter("em");
	String pwd = request.getParameter("pass");
	//2 . hm based validation
	User user = users.get(email);
	if (user != null) {
		//email : valid --> chk pwd
		if (pwd.equals(user.getPassword())) {
			//login success , store validated user details : under session scope
			session.setAttribute("user_dtls", user);
			//redirect + URL rewriting
			response.sendRedirect(response.encodeRedirectURL("details.jsp"));

		} else {
			//invalid pwd -- err mesg n retry link
	%>
	<h5 style="color: red;">
		Invalid Password <a href="login2.jsp">Retry?</a>
	</h5>
	<%
	}
	} else {
	//invalid email : err mesg n register link
	%>
	<h5 style="color: red;">
		Invalid Email <a href="register.jsp">Register ?</a>
	</h5>
	<%
	}
	%>
</body>
<%!public void jspDestroy() {
		System.out.println("in jsp destroy");
		users = null;
	}%>
</html>
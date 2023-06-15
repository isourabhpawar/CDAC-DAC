<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>In admin page</h5>


	<table style="background-color: lightgrey; margin: auto">
		<caption>Top 2 Candidate List</caption>
		<tr>
			<th>Candidate ID</th>
			<th>Candidate Name</th>
			<th>Party Name</th>
			<th>Votes</th>
		</tr>
		<c:forEach var="c" items="${sessionScope.candidate.topCandidates}">
			<tr>
				<td>${c.candidateId}</td>
				<td>${c.name}</td>
				<td>${c.party}</td>
				<td>${c.votes}</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<table style="background-color: lightgrey; margin: auto">
		<caption>Partywise votes analysis</caption>
		<tr>
			<th>Party Name</th>
			<th>Votes</th>
		</tr>
		<c:forEach var="entry"
			items="${sessionScope.candidate.fetchPartyVotes()}">
			<tr>
				<td>${entry.key}</td>
				<td>${entry.value}</td>
			</tr>
		</c:forEach>
	</table>
	<%--clean up daos --%>
	${sessionScope.user.userDao.cleanUp()}
	${sessionScope.candidate.candidateDao.cleanUp()}
	${pageContext.session.invalidate()}
	<h5>You have logged out...</h5>
	<h5>
		<a href="login.jsp">Visit Again</a>
	</h5>
</body>
</html>
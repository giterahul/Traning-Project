<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP list user records</title>
</head>
<body bgcolor=green>
	<sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/jsplogin" user="root" password="" />

	<sql:query var="ListUsers" dataSource="${myDS}">
	SELECT * FROM form;
	</sql:query>

	<div align="center">
		<table border="1" cellpadding="5" bgcolor="yellow">
			<caption>
				<h2>list of user</h2>
			</caption>
			<tr>
				<th>Fistname</th>
				<th>Lastname</th>
				<th>Username</th>
				<th>Userpass</th>
			</tr>
			<c:forEach var="user" items="${ListUsers.rows}">
				<tr>
					<td><font color="brown"><c:out value="${user.fname }" /></font></td>
					<td><font color="blue"><c:out value="${user.lname }" /></font></td>
					<td><font color="green"><c:out value="${user.uname }" /></font></td>
					<td><font color="gray"><c:out value="${user.upass }" /></font></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
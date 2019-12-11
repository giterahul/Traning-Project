<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.LoginDAOImpl"%>
<%@page import="com.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<table style="width:100%" >
  <tr>
 	 
  	 <th>Id</th>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Username</th>
    <th>Password</th>
  </tr>

	<%
		LoginDAO imp = new LoginDAOImpl();
		ArrayList<User> list = imp.listUser();
		Iterator<User> it = list.iterator();
	%>
	<%
		while (it.hasNext()) {
			User u = new User();
			u = (User) it.next();
			%>
			<tr>
			<td><%out.print(u.getUserid()); %></td>
			<td><%out.print(u.getFirstName()); %></td>
			<td><%out.print(u.getLastName()); %></td>
			<td><%out.print(u.getUsername()); %></td>
			<td><%out.print(u.getPassword()); %></td>
			</tr>
			<% }%>
		
	
	
	</table>
	<br>
	<br>
	<a href="Home.html">Home Page</a>
	<br>
	<br>
</body>
</html>
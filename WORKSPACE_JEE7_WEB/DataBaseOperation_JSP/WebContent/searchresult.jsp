<%@page import="com.bean.User"%>
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

<%
String id=request.getParameter("userid");
int userid=Integer.parseInt(id);

LoginDAO impl=new LoginDAOImpl();
try {
	User u=impl.searchUser(userid);
System.out.print(u);

%>
<table style="width:100%" >
  <tr>
  <th>UserId</th>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Username</th>
    <th>Password</th>
  </tr>
  
  <tr>
  <th><%out.print(u.getUserid()); %></th>
    <th><%out.print(u.getFirstName()); %></th>
    <th><%out.print(u.getLastName()); %></th>
    <th><%out.print(u.getUsername()); %></th>
    <th><%out.print(u.getPassword()); %></th>
  </tr>
  
  <%
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  
} %>


</body>
</html>
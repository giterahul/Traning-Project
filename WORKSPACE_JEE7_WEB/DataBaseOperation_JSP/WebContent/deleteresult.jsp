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
</head>
<body>
<%
String id=request.getParameter("userid");
int userid=Integer.parseInt(id);

LoginDAO impl=new LoginDAOImpl();
try {
	boolean status=impl.deleteUser(userid);
if(status==true)
{
	out.print("<h2>data deleted</h2>");
}
else
{
	out.print("<h2>data not deleted</h2>");
}


} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  
} %>
<br>
	<br>
	<a href="Home.html">Home Page</a>
	<br>
	<br>


</body>
</html>
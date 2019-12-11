<%@page import="com.dao.LoginDAOImpl"%>
<%@page import="com.dao.LoginDAO"%>
<%@page import="com.bean.User"%>
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
  User user=new User();
  
  user.setFirstName(request.getParameter("fname"));
  user.setLastName(request.getParameter("lname"));
  user.setUsername(request.getParameter("username"));
  user.setPassword(request.getParameter("password"));
  String uid=(String)session.getAttribute("id");
  int id=Integer.parseInt(uid);
  user.setUserid(id);

  LoginDAO imp=new LoginDAOImpl();
  boolean status=imp.updateUser(user);
  if(status==true)
  {
	  out.print("<h2>record updated successifully</h2>");
  }
  else
  {
	  out.print("data not updated .....something went wrong");
  }
  %>
</body>
</html>
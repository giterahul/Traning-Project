<%@page import="com.service.LoginDao"%>
<%@page import="com.controller.LoginDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="login" class="com.pojo.Login" scope="session"></jsp:useBean>
<jsp:setProperty property="username" name="login" param="username"/>
<jsp:setProperty property="password" name="login" param="password"/>
  
  <%

  LoginDao logindao=new LoginDaoImpl();
	boolean result=logindao.validation(login);
	if(result==true)
	{
		request.getRequestDispatcher("succ.jsp").forward(request, response);
	}

	else
	{
		request.getRequestDispatcher("fai.jsp").forward(request, response);
	}
%> 
</body>
</html>
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
int num1=Integer.parseInt(request.getParameter("number1"));
int num2=Integer.parseInt(request.getParameter("number2"));

int result=num1+num2;
int result1=num1-num2;

%>
the result is:<%= result %>
the result is sub:<%= result1 %>
</body>
</html>
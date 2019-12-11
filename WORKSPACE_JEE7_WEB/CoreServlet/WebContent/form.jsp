<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1> using java bean in jsp</h1>
<jsp:useBean id="test" class=com.servlet.TestBean></jsp:useBean>
<jsp:setProperty name="test" property="message" value="Hello jsp.."/>
<p>
got message...</p>
<jsp:getProperty name="test" property="message"/>
</center>
</body>
</html>
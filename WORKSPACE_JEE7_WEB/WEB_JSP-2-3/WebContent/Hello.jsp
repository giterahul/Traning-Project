<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page importt="java.util.Dtae" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
int count=10;
public void increment()
{
count++;
}
%>
welcome to jsp world..<br>
The date on Server is<%= new java.util.Date() %>
<% increment(); %>
</body>
</html>
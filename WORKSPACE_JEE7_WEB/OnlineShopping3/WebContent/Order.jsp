<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of All Product</h1>

<table border=1>

	<tr>
	
	<th>OrderID</th>
	<th>OrderDate</th>
	<th>OrderStatus</th>
	<td>Add To Cart List</td>
	<th>OrderPrice</th>
	
	</tr>

	<c:forEach items="${order111}" var="order1">
<tr>

<td>${order1.order_id}</td>
<td>${order1.date}</td>
<td>${order1.oreder_status}</td>
<td>${order1.addToCartList}</td>
<td>${order1.price}</td>
</tr>
</c:forEach>

</table>
</body>
</html>
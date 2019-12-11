<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ProductController" method="post">
		<c:if test="${param.action eq 'edit'}">
			<input type="hidden" name="action" value="update">
		</c:if>
		<c:if test="${param.action eq 'edit'}">
			<input type="hidden" name="action" value="save">
		</c:if>
		<table border="2">
			<tr>
				<td>ID:<input type="text" name="id" id="id"
					value="${product.id}" /></td>
			</tr>

			<tr>
				<td>Code:<input type="text" name="code" id="code"
					value="${product.code}" /></td>
			</tr>
			<tr>
				<td>Desc:<input type="text" name="description" id="description"
					value="${product.description}" /></td>
			</tr>
			<tr>
				<td>Price:<input type="text" name="price" id="price"
					value="${product.price}" /></td>
			</tr>

			<tr>

				<td>Date:<fmt:formatDate value="${product.date}"
						pattern="dd/mm/yyyy" var="manfDate" /> 
						<input type="text"
					name="date" value="${manfDate}"></td>
			<tr>
				<td><input type="submit" /></td>
				<td><input type="reset" /></td>
			</tr>


		</table>
	</form>
</body>
</html>
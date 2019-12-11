<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="VehicleController" method="post">  
Vehicle Number:  <input type="text" placeholder="Enter VehicleNumber" name="vehiclenumber" required="required"><br><br>
 <button type="submit">Next</button><br><br> 
 <a href="next.jsp">Proceed without Vehicle number</a>   <br>
</form>
<form action="Login.jsp">
<br>
<button type="submit">Login</button><br>
</form>
<form action="Register.jsp"><br>
<button type="submit">Register</button>
</form>
</body>
</html>

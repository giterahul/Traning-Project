<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="RegisterServlet" method="post">  
FirstName:  <input type="text" placeholder="Enter FirstName" name="fname" required="required"><br><br>
LastName:  <input type="text" placeholder="Enter LastNmae" name="lname" required="required"><br><br>

  Username:  <input type="text" placeholder="Enter Username" name="username" required="required"><br><br>

  Password:    <input type="password" placeholder="Enter Password" name="password" required="required"><br><br>
   
    <button type="submit">Register</button><br><br>
     
</form>

</body>
</html>
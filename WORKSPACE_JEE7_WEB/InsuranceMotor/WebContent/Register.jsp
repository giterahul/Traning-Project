<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerController" method="">

    <label for="first_name"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="first_name" required="required">
	<br><br>
    <label for="last_name"><b>Last Name</b></label>
    <input type="text" placeholder="Enter last_name" name="last_name" required>
	<br><br>
	<label for="contact_no"><b>Contact Number</b></label>
    <input type="text" placeholder="Enter contact_no" name="contact_no" required>
	<br><br>
	<label for="email"><b>Email Address</b></label>
    <input type="text" placeholder="Enter email" name="email" required>
	<br><br>
	<label for="state"><b>State</b></label>
    <input type="text" placeholder="Enter state" name="state" required>
	<br><br>
	<label for="city"><b>City</b></label>
    <input type="text" placeholder="Enter city" name="city" required>
	<br><br>
	
	<label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" required>
	<br><br>
	
	<label for="pin_code"><b>Pin Code</b></label>
    <input type="text" placeholder="Enter pin_code" name="pin_code" required>
	<br><br>
	
	<label for="username"><b>User Name</b></label>
    <input type="text" placeholder="Enter username" name="username" >
	<br><br>
	
	<label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter password" name="password" >
	<br><br>
    <button type="submit">Register</button>
 
 </form>   
</body>
</html>
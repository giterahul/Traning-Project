<%@page import="com.bean.User"%>
<%@page import="com.dao.LoginDAOImpl"%>
<%@page import="com.dao.LoginDAO"%>
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
 String id=request.getParameter("userid");
int userid=Integer.parseInt(id);

LoginDAO impl=new LoginDAOImpl();

	User u=impl.searchUser(userid);
    System.out.print(u); 
    int uid=u.getUserid();
   String ussid= Integer.toString(uid);
    session.setAttribute("id", ussid);

%>

<form action="updatestatus.jsp" method="post">  

FirstName:  <input type="text" placeholder="Enter FirstName" name="fname" value="<%out.print(u.getFirstName()); %>"  required="required"><br><br>
LastName:  <input type="text" placeholder="Enter LastNmae" name="lname" value="<%out.print(u.getLastName()); %>"  required="required"><br><br>

Username:  <input type="text" placeholder="Enter Username" name="username" value="<%out.print(u.getUsername()); %>"  required="required"><br><br>

  Password:    <input type="password" placeholder="Enter Password" name="password" value="<%out.print(u.getPassword()); %>" required="required"><br><br>
  
  
  
  
  
  
 
  
   
    <button type="submit">Update</button><br><br>
      <br>
	<br>
	<a href="Home.html">Home Page</a>
	<br>
	<br>
</form>





	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
Connection con=null;
public void jspInit()
{
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/allianz","root","");  
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
}
public void jspDestory()
{
	try{
		con.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
}


%>

<%
try
{
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from Student");  

while(rs.next())  
{
	

	out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
	
}
  
}catch(Exception e)
{
	System.out.println(e);
}
	
%>

</body>
</html>
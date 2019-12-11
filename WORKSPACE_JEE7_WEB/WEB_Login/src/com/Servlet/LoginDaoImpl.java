package com.Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
	public LoginDaoImpl()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	private  Connection getConnect()throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/login1","root","");
		
	}
	@Override
	public boolean validation(Login login) {
		// TODO Auto-generated method stub
		String sql="select * from login_table where username=? and password=?";
		boolean wrong=false;
		try(Connection connection=getConnect(); PreparedStatement prepared=connection.prepareStatement(sql);)
		{
			prepared.setString(1,login.getUsername());
			prepared.setString(2,login.getPassword());
			ResultSet rs=prepared.executeQuery();
			if(rs.next())
			{
				wrong=true;
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return wrong; 
	} 

}
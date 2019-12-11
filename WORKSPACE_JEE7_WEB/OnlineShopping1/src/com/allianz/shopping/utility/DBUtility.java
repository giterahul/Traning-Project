package com.allianz.shopping.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import org.apache.naming.java.javaURLContextFactory;

public class DBUtility {
	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz","root","");
			
		 
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}
	public String dateToString(Date date)
	{
		return null;
	}
	public static java.sql.Date convertUtilToSql(Date date)
	{
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		return sqldate;
	}

}

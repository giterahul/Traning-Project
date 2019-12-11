package com.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.eclipse.jdt.internal.compiler.batch.ClasspathSourceJar;

public class InsertImage {
 public static void main(String[] args) {
	 try
	 {
		 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		 
		 String mysqlurl="jdbc:mysql://localhost:3306/allianz";
		 
		 Connection con=DriverManager.getConnection(mysqlurl,"root","");
		 System.out.println("connection establish");
		 
		 PreparedStatement pre=con.prepareStatement("insert into emp1 values(?,?)");
		 pre.setString(1, "sample image");
		 
		 InputStream in=new FileInputStream("D:\\images\\cat.PNG");
		 pre.setBlob(2, in);
		 pre.execute();
		 System.out.println("succssful");
		 
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
	
	
	
}
}

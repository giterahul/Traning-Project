package com.jdbc;

public class Test_Meta_Data {
	public static void main(String[] args) {
		
		String dbDriver="com.mysql.jdbc.Driver";
		String dbUrl="jdbc:mysql://localhost:3306/Allianz";
		String dbUsername="root";
		String dbPassword="";
		String sql="SELECT * FROM STUDENT";
		
		try {
			Class.forName(dbDriver);
			System.out.println("test_meta_data->Driver loaded...");
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println(0);
	
		}
		
		
	}
}

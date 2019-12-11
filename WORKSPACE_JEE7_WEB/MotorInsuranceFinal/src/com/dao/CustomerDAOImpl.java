package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Customer;
import com.utility.DBUtility;

public class CustomerDAOImpl implements CustomerDAO{
Connection con;
	@Override
	public Customer getCustomerByCustomerId(Integer customerId) {
		String sql="select * from tbl_customer where customer_id=?";
	     con=DBUtility.getConnection();
	     System.out.println("connection created");
	    Customer customer=new Customer();
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				
				pst.setInt(1, customerId);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
				customer.setCustomerId(rs.getInt(1));
				customer.setFirstName(rs.getString(2));
				customer.setLastName(rs.getString(3));
				customer.setContactNumber(rs.getString(4));
				customer.setEmail(rs.getString(5));
				customer.setState(rs.getString(6));
				customer.setCity(rs.getString(7));
				customer.setAddressLine(rs.getString(8));
				customer.setPinCode(rs.getInt(9));
				
				return customer;	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
	
	}
	@Override
	public boolean registration(Customer customer) {
		Connection con=DBUtility.getConnection();
		try
		{
			String sql="INSERT INTO tbl_customer(first_name,last_name,contact_no,email,state,city,address_line,pin_code,user_name,password) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,customer.getFirstName());
			ps.setString(2, customer.getLastName());
			ps.setString(3, customer.getContactNumber());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getState());
			ps.setString(6, customer.getCity());
			ps.setString(7, customer.getAddressLine());
			ps.setInt(8, customer.getPinCode());
			ps.setString(9, customer.getUserName());
			ps.setString(10, customer.getPassword());
			int res=ps.executeUpdate();
			if(res>=1)
			{
				System.out.println("Register");
				return true;
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	
	}
	@Override
	public boolean validate(String userName, String password) {
		Connection con=DBUtility.getConnection();
		try
		{
			String sql="SELECT * FROM tbl_customer where user_name=? and password=?";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("valid user");
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

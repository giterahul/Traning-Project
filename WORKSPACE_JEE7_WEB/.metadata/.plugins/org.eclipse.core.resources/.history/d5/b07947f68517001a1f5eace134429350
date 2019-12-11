package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Customer;
import com.model.Vehicle;
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

}

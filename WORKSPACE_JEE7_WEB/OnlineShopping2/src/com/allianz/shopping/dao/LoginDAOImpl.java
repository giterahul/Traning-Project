package com.allianz.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Customer;
import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DBUtility;

public class LoginDAOImpl implements LoginDAO {
Connection con;

@Override
public boolean validate(Customer customer) throws ClassNotFoundException 
{
	String sql = "select * from tbl_customer where username=? and password=?";
	con=DBUtility.getConnection();
try {
	PreparedStatement pst=con.prepareStatement(sql);
	pst.setString(1, customer.getUsername());
	pst.setString(2, customer.getPassword());

	ResultSet rs = pst.executeQuery();

if (rs.next())
{
	System.out.println("valid user");
	return true;
}

}catch (SQLException e1) {
	e1.printStackTrace();
	}

	return false;
}

@Override
public boolean registerUser(Customer customer) throws ClassNotFoundException 
{
	String sql = "insert into tbl_customer(firstname,lastname,username,password,mob_no)" + " values(?,?,?,?,?)";

	con=DBUtility.getConnection();
try {
	PreparedStatement pst=con.prepareStatement(sql);

	pst.setString(1, customer.getFirstname());
	pst.setString(2, customer.getLastname());
	pst.setString(3, customer.getUsername());
	pst.setString(4, customer.getPassword());
	pst.setString(5, customer.getMobno());
	int result = pst.executeUpdate();
	System.out.println(result);
if (result >= 1) {
	System.out.println("Registration completed");
	return true;
	}

} catch (SQLException e1) {
	e1.printStackTrace();
	}

	return false;
	}

}


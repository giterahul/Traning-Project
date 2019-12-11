package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Policy;
import com.model.Vehicle;
import com.utility.DBUtility;

public class PolicyDAOImpl implements PolicyDAO{
Connection con;
VehicleDAO vehicleDAO=new VehicleDAOImpl();
	@Override
	public Policy getPolicyByPolicyNo(int policyNo) {
		String sql="select * from tbl_policy where policy_no=?";
	     con=DBUtility.getConnection();
	    Policy policy=new Policy();
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				
				pst.setInt(1, policyNo);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
				policy.setPolicyNo(rs.getInt(1));
				policy.setPolicyType(rs.getString(2));
				policy.setPolicyStartDate(rs.getDate(3));
				policy.setPolicyEndDate(rs.getDate(4));
				policy.setSumInsured(Float.parseFloat(rs.getString(5)));
				policy.setPremiumAmount(Float.parseFloat(rs.getString(6)));
				int customerId=rs.getInt(7);
				String vehicleNo=rs.getString(8);
				return policy;
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;

	}
	@Override
	public List<Policy> getPolicyByCustomerId(int customerId) {
		String sql="select * from tbl_policy where customer_id=?";
		List<Policy> policyList=new ArrayList<Policy>();
	     con=DBUtility.getConnection();
	  
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				
				pst.setInt(1, customerId);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					  Policy policy=new Policy();
				policy.setPolicyNo(rs.getInt(1));
				policy.setPolicyType(rs.getString(2));
				policy.setPolicyStartDate(rs.getDate(3));
				policy.setPolicyEndDate(rs.getDate(4));
				policy.setSumInsured(Float.parseFloat(rs.getString(5)));
				policy.setPremiumAmount(Float.parseFloat(rs.getString(6)));
				int customerID=rs.getInt(7);
				String vehicleNo=rs.getString(8);
				policy.setVehicle(vehicleDAO.getVehicleByVehicleNumber(vehicleNo));
				policyList.add(policy);
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return policyList;
	}

}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Vehicle;
import com.utility.DBUtility;

public class VehicleDAOImpl implements VehicleDAO {
Connection con;
CustomerDAO customerDAO=new CustomerDAOImpl();
	@Override
	public Vehicle getVehicleByVehicleNumber(String vehicleNumber) {
		String sql="select * from tbl_rto where vehicle_no=?";
	     con=DBUtility.getConnection();
	     System.out.println("connection created");
	     Vehicle vehicle=new Vehicle();
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				
				pst.setString(1, vehicleNumber);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
				vehicle.setVehicleNumber(rs.getString(1));
				vehicle.setVehicleType(rs.getString(2));
				vehicle.setManufacturer(rs.getString(3));
				vehicle.setVehicleModel(rs.getString(4));
				vehicle.setEngineCC(rs.getString(5));
				vehicle.setFuelType(rs.getString(6));
				vehicle.setPassingYear(rs.getString(7));
				vehicle.setVehicleCost(rs.getFloat(8));
				vehicle.setChassisNo(rs.getString(9));
				vehicle.setVehicleColour(rs.getString(10));
				Integer customerId=rs.getInt(11);
				vehicle.setCustomer(customerDAO.getCustomerByCustomerId(customerId));
				
				return vehicle;	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
	}

}

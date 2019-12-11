package com.allianz.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.AddToCart;
//import com.allianz.shopping.model.AddToCart;
import com.allianz.shopping.model.Order;
import com.allianz.shopping.utility.DBUtilityConnection;
import com.allianz.shopping.utility.DateUtility;

public class OrderDAOImpl implements OrderDAO
{

	@Override
	public int addOrder(Order o) {
		int orderID = 0;
		Connection con=DBUtilityConnection.getConnection();
		String sql;
		
		try
		{
			sql="INSERT INTO orders(Order_Date,Status,Username,Total_Price) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			ps.setDate(1, DateUtility.convertUtilDateToSQLDate(o.getDate()));
			ps.setString(2,o.getOreder_status());
			ps.setString(3, o.getUserName());
			ps.setFloat(4, o.getPrice());
			int no=ps.executeUpdate();
			if(no>0)

			{
				try(ResultSet generateKeys=ps.getGeneratedKeys())
				{
					if(generateKeys.next())
					{
						orderID=generateKeys.getInt(1);
						System.out.println(orderID);
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return orderID;
	}

	

	@Override
	public Order getOrderById(int order_id) {
		Connection connection=null;
		AddToCartDAO addToCartDAO=new AddToCartDAOimpl();
		try {
			
			
			connection=DBUtilityConnection.getConnection();
			String sql="SELECT * FROM orders WHERE order_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,order_id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next())
			{
				Order order=new Order();
				order.setOrder_id(rs.getInt(1));
				order.setDate(rs.getDate(2));
				order.setOredr_status(rs.getString(3));
				order.setUserName(rs.getString(4));
				order.setPrice(rs.getFloat(5));
				order.setAddToCartList((List<AddToCart>) addToCartDAO.getAddToCartByOrderId(order.getOrder_id()));
				
				
				return order;
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}



	@Override
	public List<Order> getAllOrder() {
		Connection connection=null;
		AddToCartDAO addToCartDAO=new AddToCartDAOimpl();
		List<Order> orderList=new ArrayList<Order>();
		try {
			
			
			connection=DBUtilityConnection.getConnection();
			
			String sql="SELECT * FROM orders";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next())
			{
				Order order=new Order();
				order.setOrder_id(rs.getInt(1));
				order.setDate(rs.getDate(2));
				order.setOredr_status(rs.getString(3));
				order.setUserName(rs.getString(4));
				order.setPrice(rs.getFloat(5));
				order.setAddToCartList((List<AddToCart>) addToCartDAO.getAddToCartByOrderId(order.getOrder_id()));
				orderList.add(order);
				
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return orderList;
	}
}

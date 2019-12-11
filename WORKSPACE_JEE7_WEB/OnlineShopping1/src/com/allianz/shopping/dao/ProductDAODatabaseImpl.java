package com.allianz.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DBUtility;



public class ProductDAODatabaseImpl implements ProductDAO
{

	@Override
	public boolean addProduct(Product product) {
		Connection conn=DBUtility.getConnection();
		String sql="insert into shopping values(?,?,?,?,?)";
		
		try
		{
			
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, product.getId());
			pst.setString(2, product.getCode());
			pst.setString(3, product.getDescription());
			pst.setFloat(4, product.getPrice());
			pst.setDate(5, DBUtility.convertUtilToSql(product.getDate()));
			int i=pst.executeUpdate();
			if(i<0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		Connection conn=DBUtility.getConnection();
		String sql="update shopping set id=?,code=? ,Description=?,Price=?,Date=? where id=?";
		
		try
		{
			
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, product.getId());
			pst.setString(2, product.getCode());
			pst.setString(3, product.getDescription());
			pst.setFloat(4, product.getPrice());
			pst.setDate(5, DBUtility.convertUtilToSql(product.getDate()));
			int i=pst.executeUpdate();
			if(i<0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return false;
	

	}

	@Override
	public boolean deleteProduct(int id) {
		Connection conn=DBUtility.getConnection();
		String sql="delete from shopping where id=?";
		
		try
		{
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			
			int i=preparedstatement.executeUpdate();
			if(i<0)
			{
			
				return true;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		Connection conn=DBUtility.getConnection();
		String sql="select * from shopping";
		 List<Product> productList = new ArrayList<Product>();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Product product=new Product();
				product	.setId(rs.getInt(1));
				product.setCode(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				product.setDate(rs.getDate(5));
				//System.out.println(product);
				productList.add(product);
				
			}
			//Statement.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return productList;
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		return null;
	}

	@Override
	public List<Product> getAllProductsbyPrice(float min, float max) {
		
		return null;
	}

	@Override
	
	public Product getProductById(int id) {
		String sql="Select id,code,Description,Price,Date1 from shopping where id=?";
	//	List<Product> productList = new ArrayList<Product>();
		Connection conn=DBUtility.getConnection();
		Product product=new Product();
		try
		{
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				product.setId(rs.getInt(1));
				product.setCode(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				product.setDate(rs.getDate(5));
				return product;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}

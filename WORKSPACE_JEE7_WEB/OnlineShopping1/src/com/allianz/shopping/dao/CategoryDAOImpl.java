package com.allianz.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.allianz.shopping.model.Category;
import com.allianz.shopping.utility.DBUtility;

public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public boolean addCategory(Category category) {

		Connection conn=DBUtility.getConnection();
		String sql="insert into shopping values(?,?,?,?,?)";
		
		try
		{
			
			PreparedStatement pst=conn.prepareStatement(sql);
			//pst.setInt(1, category.getCategoryId());
			pst.setString(2, category.getCategoryCode());
			pst.setString(3, category.getCatDesc());
			//pst.setFloat(4, category.getPrice());
			//pst.setDate(5, DBUtility.convertUtilToSql(category.getDate()));
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
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCategory(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategoryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategorybyPrice(float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.allianz.shopping.dao;

import java.util.List;

import com.allianz.shopping.model.Category;


public interface CategoryDAO {
	public boolean addCategory(Category category) ;
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int id);
	public List<Category> getAllCategory();
	public List<Category> getAllCategoryByName(String name);
	public List<Category> getAllCategorybyPrice(float min,float max);
	public Category getCategoryById(int id);

}

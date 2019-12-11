package com.allianz.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DateUtility;

public class ProductDaoImpl implements ProductDAO {
	private static List<Product> productList=new ArrayList<Product>();
	static 
	{
		productList.add(new Product(101, "colgate1", "cogate1 Tube ", 50,DateUtility.convertStringToDate("10/11/19")));
		productList.add(new Product(102, "colgate2", "cogate2 Tube ", 60,DateUtility.convertStringToDate("11/11/19")));
		productList.add(new Product(103, "colgate3", "cogate3 Tube ", 70,DateUtility.convertStringToDate("12/11/19")));
		productList.add(new Product(104, "colgate4", "cogate4 Tube ", 80,DateUtility.convertStringToDate("13/11/19")));
		
	}

	@Override
	public boolean addProduct(Product product) {
		productList.add(product);
		return true;
		
	}

	@Override
	public boolean updateProduct(Product product) {
		if(productList!=null && productList.size()>0)
		{
			for(int i=0;i<productList.size();i++)
			{
				Product productTemp=productList.get(i);
				if(productTemp.getId()==product.getId())
				{
					productList.set(i, product);
					return true;
					
				}
				
			}
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		if(productList!=null && productList.size()>0)
		{
			for(int i=0;i<productList.size();i++)
			{
				Product productTemp=productList.get(i);
				if(productTemp.getId()==id)
				{
					productList.remove(i);
					return true;
					
				}
				
			}
		}
		return false;
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productList;
	}

	@Override
	public List<Product> getAllProductsByNmae(String namePattern) {
		List<Product> productlisTemp=new ArrayList<Product>();
		if(productList!=null && productList.size()>0)
		{
			for(int i=0;i<productList.size();i++)
			{
				Product productTemp=productList.get(i);
				if(productTemp.getDescription().toLowerCase().contains(namePattern.toLowerCase()))
				{
					productlisTemp.add(productTemp);
					
					
				}
				
			}
			return productlisTemp;
		}
	

		return null;
	}

	@Override
	public List<Product> getAllProductsByPrice(float min, float max) {
		List<Product> productlisTemp=new ArrayList<Product>();
		if(productList!=null && productList.size()>0)
		{
			for(int i=0;i<productList.size();i++)
			{
				Product productTemp=productList.get(i);
				if(productTemp.getPrice()>=min && productTemp.getPrice()<=max)
				{
					productlisTemp.add(productTemp);
					
					
				}
				
			}
			return productlisTemp;
		}
	

		return null;
	}

	@Override
	public Product getProductById(int id) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product productTemp = productList.get(i);
				if (productTemp.getId() == id) {
					return productTemp;

				}
			}
		}
		return null;
	}
		
	

}

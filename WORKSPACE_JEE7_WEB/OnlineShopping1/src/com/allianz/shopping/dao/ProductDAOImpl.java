package com.allianz.shopping.dao;

import java.util.ArrayList;
import java.util.List;

import com.allianz.shopping.model.Product;
import com.allianz.shopping.utility.DateUtility;

public class ProductDAOImpl implements ProductDAO {
	private static List<Product> productList = new ArrayList<Product>();
	static {
		productList.add(new Product(101, "Colgate1", "Colgate1", 70,DateUtility. convertStringToDate("10/11/2019")));
		productList.add(new Product(102, "Colgate2", "Colgate2", 60,DateUtility. convertStringToDate("10/11/2019")));
		productList.add(new Product(103, "Colgate3", "Colgate3", 80,DateUtility. convertStringToDate("10/11/2019")));
		productList.add(new Product(104, "Colgate4", "Colgate4", 90,DateUtility. convertStringToDate("10/11/2019")));

	}

	@Override
	public boolean addProduct(Product product) {
		productList.add(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product productTemp = productList.get(i);
				if (productTemp.getId() == product.getId()) {
					productList.set(i, product);
					return true;

				}
			}
		}

		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		if (productList != null && productList.size() > 0) {
			for (int i = 0; i < productList.size(); i++) {
				Product productTemp = productList.get(i);
				if (productTemp.getId() == id) {
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
	public List<Product> getAllProductsByName(String name) {
		if (productList != null && productList.size() > 0) {
			List<Product> temp = new ArrayList<Product>();
			for (int i = 0; i < productList.size(); i++) {
				Product productTemp = productList.get(i);
				if (productTemp.getCode().toLowerCase().contains(name.toLowerCase())) {	
					temp.add(productList.get(i));
				}
			}
			
			return temp;
		}
		return null;
	}

	@Override
	public List<Product> getAllProductsbyPrice(float min, float max) {
		if (productList != null && productList.size() > 0) {
			List<Product> temp = new ArrayList<Product>();
			for (int i = 0; i < productList.size(); i++) {
				Product productTemp = productList.get(i);
				if (productTemp.getPrice()>=min && productTemp.getPrice() <= max) {	
					temp.add(productList.get(i));
				}
			}
			
			return temp;
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

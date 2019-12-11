package com.dao;

import com.model.Customer;

public interface CustomerDAO {
	public Customer getCustomerByCustomerId(Integer customerId);
	public boolean registration(Customer customer); 
	public int validate(String userName, String password);
}

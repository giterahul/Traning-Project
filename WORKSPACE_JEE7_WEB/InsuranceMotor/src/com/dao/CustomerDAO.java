package com.dao;

import com.model.Customer;

public interface CustomerDAO {
	public Customer getCustomerByCustomerId(Integer customerId);
	public boolean registration(Customer customer); 
	public boolean validate(String userName, String password);
}

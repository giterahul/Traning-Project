package com.dao;

import com.model.Customer;

public interface CustomerDAO {
	public Customer getCustomerByCustomerId(Integer customerId);
}

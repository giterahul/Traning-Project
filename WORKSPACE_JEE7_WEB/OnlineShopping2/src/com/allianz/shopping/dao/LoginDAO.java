package com.allianz.shopping.dao;

import com.allianz.shopping.model.Customer;

public interface LoginDAO {
	public boolean validate(Customer customer)throws ClassNotFoundException;
	public boolean registerUser(Customer customer)throws ClassNotFoundException;

}

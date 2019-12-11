package com.dao;

import java.util.ArrayList;

import com.bean.User;

public interface LoginDAO {
	
	public boolean validate(User login) throws ClassNotFoundException;
	public boolean registerUser(User user) throws ClassNotFoundException;
	public ArrayList<User> listUser() throws ClassNotFoundException;
	public User searchUser(int id) throws ClassNotFoundException;
	public boolean deleteUser(int id) throws ClassNotFoundException;
	public boolean updateUser(User u) throws ClassNotFoundException;

}

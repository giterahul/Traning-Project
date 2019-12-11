package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.User;

public class LoginDAOImpl implements LoginDAO {
	public LoginDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz", "root", "");

	}

	@Override
	public boolean validate(User login) throws ClassNotFoundException {

		String sql = "select * from tbl_user where username=? and password=?";

		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {

			statement.setString(1, login.getUsername());
			statement.setString(2, login.getPassword());

			ResultSet rs = statement.executeQuery();

			if (rs.next()) {
				System.out.println("valid user");
				return true;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean registerUser(User user) throws ClassNotFoundException {
		String sql = "insert into tbl_user(firstname,lastname,username,password)" + " values(?,?,?,?)";

		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {

			statement.setString(1, user.getFirstName());
			statement.setString(2, user.getLastName());
			statement.setString(3, user.getUsername());
			statement.setString(4, user.getPassword());

			int result = statement.executeUpdate();
			System.out.println(result);
			if (result >= 1) {
				System.out.println("Registration completed");
				return true;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return false;
	}

	@Override
	public ArrayList<User> listUser() throws ClassNotFoundException {
		ArrayList<User> userlist = new ArrayList<User>();
		String sql = "select * from tbl_user";

		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {

			

		ResultSet rs=statement.executeQuery();
			 
			
			while (rs.next()) {
				User u=new User();
				u.setUserid(rs.getInt(1));
				u.setFirstName(rs.getString(2));
				u.setLastName(rs.getString(3));
				u.setUsername(rs.getString(4));
				u.setPassword(rs.getString(5));
				System.out.println(u);
				userlist.add(u);
				
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return userlist;
	}

	@Override
	public User searchUser(int id) throws ClassNotFoundException {
		String sql = "select * from tbl_user where userid=?";
		User u=new User();
		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {

			statement.setInt(1, id);
			

			ResultSet rs = statement.executeQuery();
			
			while (rs.next()) {
				u.setUserid(rs.getInt(1));
				u.setFirstName(rs.getString(2));
				u.setLastName(rs.getString(3));
				u.setUsername(rs.getString(4));
				u.setPassword(rs.getString(5));
				//System.out.println(u);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return u;

	}

	@Override
	public boolean deleteUser(int id) throws ClassNotFoundException {
		String sql = "delete from tbl_user where userid=?";

		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {

			statement.setInt(1, id);
			

			int result = statement.executeUpdate();
			System.out.println(result);
			if (result >= 1) {
				System.out.println("User Deleted");
				return true;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateUser(User u) throws ClassNotFoundException {
		
		String sql = "update tbl_user set firstname=?,lastname=?,username=?,password=? where userid=?";

		try (Connection con = getConnection(); PreparedStatement statement = con.prepareStatement(sql);) {
			
			statement.setString(1, u.getFirstName());
			statement.setString(2, u.getLastName());
			statement.setString(3, u.getUsername());
			statement.setString(4, u.getPassword());
			statement.setInt(5, u.getUserid());
			

			int result = statement.executeUpdate();
			System.out.println(result);
			if (result >= 1) {
				System.out.println("User Updated");
				return true;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return false;
	}

	
}

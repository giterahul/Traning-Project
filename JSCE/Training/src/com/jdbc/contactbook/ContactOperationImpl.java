package com.jdbc.contactbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.collection.list.Contact;



public class ContactOperationImpl implements ContactOperation {
	ArrayList<Contact> listcontact;
	static Connection con;
	
	public ContactOperationImpl(int size) throws ClassNotFoundException, SQLException  {
		
		listcontact=new ArrayList<Contact>(5);
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactbook","root",""); 
	
	}

	@Override
	public boolean addContact(Contact contact) {
		
		
		String sql = "INSERT INTO contact_table(FirstName, LastName, Mail,Phone) VALUES (?, ?, ?, ?)";
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, contact.getFirstname());
			 statement.setString(2, contact.getLastname());
			 statement.setString(3, contact.getMail());
			 statement.setString(4, contact.getPhone());
			 listcontact.add(contact);
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new Contact inserted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
		
		
		
		
		

	}

	@Override
	public boolean deleteContact(String firstname) {
		String sql = "DELETE FROM contact_table WHERE firstname=?";
		 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			
			statement.setString(1, firstname);
			 statement.executeUpdate();
			//System.out.println("dataaa");
			System.out.println("done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Contact> findContact(String fname) {
	
		String sql = "SELECT * FROM contact_table WHERE firstname=?"; 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			
			statement.setString(1, fname);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				Contact c =new Contact();
				c.setFirstname(rs.getString(1));
				c.setLastname(rs.getString(2));
				c.setMail(rs.getString(3));
				c.setPhone(rs.getString(4));
				listcontact.add(c);
				//System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listcontact;
		
	}

	@Override
	public void listAll() {
		
		String sql = "SELECT * FROM contact_table"; 
		PreparedStatement statement;
		
			try {
				statement = con.prepareStatement(sql);
				ResultSet rs=statement.executeQuery();
				while(rs.next())
				{
					
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	

	
}
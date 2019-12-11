package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBimplContact {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/rahul", "root", "");
			Statement stat = connection.createStatement();
			String sql = "Select * from contactbook";
			ResultSet rs = stat.executeQuery(sql);
			System.out.println("ContactBook");
			while (rs.next()) {
				System.out.println(rs.getInt("ID") + "\t" + rs.getString("FIRSTNAME") + "\t" + rs.getString("LASTNAME")
						+ "\t" + rs.getString("PHONENUMBER"));
			}
			
				System.out.println(
						"1.Insert Data \n 2.Search Contact using id \t 3.Delete Contact using id \n 4.Update Contact using id");
				System.out.println("Enter Your Choice");
				Scanner sc = new Scanner(System.in);
				int ch = sc.nextInt();

				DaoContact daoContact = new DaoContact(stat, "contactbook");
				switch (ch) {
				case 1:
					// Insert
					daoContact.addContact("Rakesh", "Patil", "789898989");
					System.out.println("\nInserted data\n");
					rs = stat.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("ID") + "\t" + rs.getString("FIRSTNAME") + "\t"
								+ rs.getString("LASTNAME") + "\t" + rs.getString("PHONENUMBER"));

					}
				
					break;
				case 2:
					// Find Data
					System.out.println("\nData after Search\n");
					rs = daoContact.findContact(1);
					while (rs.next()) {
						System.out.println(rs.getInt("ID") + "\t" + rs.getString("FIRSTNAME") + "\t"
								+ rs.getString("LASTNAME") + "\t" + rs.getString("PHONENUMBER"));
					}
				
					break;

				case 3:
					// Delete Contact
					System.out.println("\nData after Delation\n");
					daoContact.deleteContact(2);
					rs = stat.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("ID") + "\t" + rs.getString("FIRSTNAME") + "\t"
								+ rs.getString("LASTNAME") + "\t" + rs.getString("PHONENUMBER"));
					}
			
					break;

				case 4:

					// Update Contacts
					System.out.println("\nData after Update\n");

					daoContact.update(4, "Vaishnav", "Pawar", "7879890887");
					rs = stat.executeQuery(sql);
					while (rs.next()) {
						System.out.println(rs.getInt("ID") + "\t" + rs.getString("FIRSTNAME") + "\t"
								+ rs.getString("LASTNAME") + "\t" + rs.getString("PHONENUMBER"));
					}
					
					break;
				default:
					System.out.println("Please Insert Valid choice");
				
				}
			
			rs.close();
			stat.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


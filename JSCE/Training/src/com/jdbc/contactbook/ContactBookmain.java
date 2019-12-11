package com.jdbc.contactbook;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

//import com.collection.list.Contact;




public class ContactBookmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int option;
		Scanner sc;
		
		
		ContactOperationImpl contactoperation=new ContactOperationImpl(3);
		do {
			sc=new Scanner(System.in);
			System.out.println("Welcome To Contact Book");
			System.out.println(
					"Enter choice\n 1.Add Contact \n 2.Delete Contact \n 3.Find By First Name\n 4.list all\n 5.Exit ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter firstname ,lastname,email,mobNo");
				String fname=sc.next();
				String lname=sc.next();
				String email=sc.next();
				String phone=sc.next();
				Contact contact=new Contact(fname, lname, email, phone);
				System.out.println(contactoperation.addContact(contact));
				
				break;
			case 2:
				System.out.println("Enter First name");
				String fn = sc.next();
				contactoperation.deleteContact(fn);	
				break;
			case 3:
				System.out.println("Enter First name");
				String fname1 = sc.next();
				//System.out.println(fname1);
				List<Contact> contact1=contactoperation.findContact(fname1);
				System.out.println(contact1);
				break;
			case 4:
				contactoperation.listAll();
				break;
			case 5:

				break;

			}

			System.out.println("You want to continue press0");
			option = sc.nextInt();

		} while (option == 0);


	

	}

}


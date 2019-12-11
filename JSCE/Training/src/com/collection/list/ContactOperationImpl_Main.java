package com.collection.list;

import java.util.Scanner;

public class ContactOperationImpl_Main {
	static Scanner sc=new Scanner(System.in);
	
	static public String getInput(String message)
	{
		System.out.println("\n" +message);
		String input=sc.next();
		return input;
		
		
	}
	static public Contact getContactInput()
	{
		Contact contact=null;
		String firstName,lastName,email,phone;
		firstName=getInput("enter first name");
		lastName=getInput("enter last name");
		email=getInput("enter email");
		phone=getInput("enter phone no");
		contact= new Contact(firstName,lastName,email,phone);
		return contact;
	}
	public static void main(String[] args) {
		ContactOperationImpl_Array contactoperation=new ContactOperationImpl_Array();
		int choice=0;
		do {
			System.out.println("welcome to contact book...");
			System.out.println("1.add Contact");
			System.out.println("2.Delete Contact");
			System.out.println("3.find Contact");
			System.out.println("4.list Contact");
			choice =sc.nextInt();
			
			Contact contact=null;
			
			switch(choice)
			{
			case 1:
				
				contact=getContactInput();
				boolean isAdded= contactoperation.addContact(contact);
				System.out.println("\t\t::==>contact created"+isAdded);
				break;
			case 2:
				String deleteName=getInput("enter first name to delete");
				boolean isDeleted=false;
				isDeleted=contactoperation.deleteContact(deleteName);
				System.out.println("\\t\\t::==>contact delete"+isDeleted);
				break;
			}
		}while(choice !=4);
	}

}

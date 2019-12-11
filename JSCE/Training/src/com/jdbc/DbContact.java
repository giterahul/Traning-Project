package com.jdbc;

public class DbContact {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected long phoneNumber;
	/**
	 * @param name
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 */
	
	//Constructor
	
	public DbContact(String firstName, String lastName, long phoneNumber) {
		//super();
		setFirstName(firstName);
		setLastName(lastName);
		//setId(id);
		setPhoneNumber(phoneNumber);
		
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

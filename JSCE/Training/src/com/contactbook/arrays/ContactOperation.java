package com.contactbook.arrays;

public interface ContactOperation {
	public boolean addContact(Contact contact);
	public boolean deleteContact(String firstname);
	public Contact findContact(String firstname);
	public void list();
	

}

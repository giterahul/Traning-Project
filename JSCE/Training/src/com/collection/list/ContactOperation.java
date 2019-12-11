package com.collection.list;

import com.contactbook.arrays.Contact;

public interface ContactOperation {
	
		public boolean addContact(Contact contact);
		public boolean deleteContact(String firstname);
		public Contact findContact(String firstname);
		public void list();
		

	}




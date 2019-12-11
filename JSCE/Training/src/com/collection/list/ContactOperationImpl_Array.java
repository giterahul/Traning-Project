package com.collection.list;

import java.util.ArrayList;

import com.contactbook.arrays.Contact;
import com.contactbook.arrays.ContactOperation;

public class ContactOperationImpl_Array implements ContactOperation{
	ArrayList<Contact> listContact;
	
	public ContactOperationImpl_Array()
	{
		super();
		listContact=new ArrayList<Contact>(5);
	}
	@Override
	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		return listContact.add(contact);
		
	}
	@Override
	public boolean deleteContact(String firstname) {
		// TODO Auto-generated method stub
		int index=getContactIndex(firstname)
				{
			System.out.println(index-1);
			listContact.remove(index-1);
			return true;
			
				}
		
		return false;
	}
	@Override
	public Contact findContact(String firstname) {
		// TODO Auto-generated method stub
		Contact contact=null;
		int contactIndex= getContactIndex(firstname);
		if(contactIndex !=-1) {
			listContact.remove(contactIndex);
		}
		return null;
	}
	//@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println(listContact);
		
		
	}

}

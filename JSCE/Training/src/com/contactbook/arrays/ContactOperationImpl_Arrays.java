package com.contactbook.arrays;

public class ContactOperationImpl_Arrays implements ContactOperation{
	Contact[] contacts;
	public ContactOperationImpl_Arrays(int size)
	{
		super();
		contacts=new Contact[size];
	}
	@Override
	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		boolean isAdd=false;
		for(int index=0;index<contacts.length;index++) {
			if(contacts[index]==null) {
				contacts[index]=contact;
				isAdd=true;
				break;
			}
		}
		return false;
	}
	@Override
	public boolean deleteContact(String firstname) {
		// TODO Auto-generated method stub
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
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	
	

}

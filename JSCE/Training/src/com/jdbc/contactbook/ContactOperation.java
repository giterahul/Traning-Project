package com.jdbc.contactbook;

import java.util.List;

//import com.collection.list.Contact;

public interface ContactOperation {
public boolean addContact(Contact contact);
public boolean deleteContact(String firstname);
public List<Contact> findContact(String  fname);
public void listAll();

}
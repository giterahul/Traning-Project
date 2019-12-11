package com.pojo;

public class User {
	int userid;
	String name;
	String address;
	String contact;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	public User() {
		super();
	}
	public User(int userid, String name, String address, String contact) {
		super();
		this.userid = userid;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	

}

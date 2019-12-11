package com.bean;

public class User {
String username,password;
String firstName,lastName;
int userid;


public String getFirstName() {
	return firstName;
}

 public void setFirstName(String firstName) {
	this.firstName = firstName;
} 

public String getLastName() {
	return lastName;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}



@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
			+ lastName + ", userid=" + userid + "]";
}

public void setPassword(String password) {
	this.password = password;
}

public User(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}

public User() {
	super();
}

}

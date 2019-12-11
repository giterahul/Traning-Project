package com.model;

public class Customer {
	String firstName, lastName, email, state, city, addressLine,contactNumber;
	Integer customerId, pinCode;
	public Customer() {
		super();
	}
	public Customer(String firstName, String lastName, String email, String state, String city, String addressLine,
			String contactNumber, Integer customerId, Integer pinCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.state = state;
		this.city = city;
		this.addressLine = addressLine;
		this.contactNumber = contactNumber;
		this.customerId = customerId;
		this.pinCode = pinCode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", state=" + state
				+ ", city=" + city + ", addressLine=" + addressLine + ", contactNumber=" + contactNumber
				+ ", customerId=" + customerId + ", pinCode=" + pinCode + "]";
	}
	

}

package com.model;

import java.util.Date;

public class Policy {
 String policyType;
 Integer policyNo;
 Date purcheseDate,policyStartDate,policyEndDate;
 Float sumInsured,premiumAmount;
Vehicle vehicle;
Customer customer;
public Policy() {
	super();
}


@Override
public String toString() {
	return "Policy [policyType=" + policyType + ", policyNo=" + policyNo + ", purcheseDate=" + purcheseDate
			+ ", policyStartDate=" + policyStartDate + ", policyEndDate=" + policyEndDate + ", sumInsured=" + sumInsured
			+ ", premiumAmount=" + premiumAmount + ", vehicle=" + vehicle + ", customer=" + customer + "]";
}


public Integer getPolicyNo() {
	return policyNo;
}


public void setPolicyNo(Integer policyNo) {
	this.policyNo = policyNo;
}


public Vehicle getVehicle() {
	return vehicle;
}


public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}


public Customer getCustomer() {
	return customer;
}


public void setCustomer(Customer customer) {
	this.customer = customer;
}


public String getPolicyType() {
	return policyType;
}
public void setPolicyType(String policyType) {
	this.policyType = policyType;
}
public Date getPurcheseDate() {
	return purcheseDate;
}
public void setPurcheseDate(Date purcheseDate) {
	this.purcheseDate = purcheseDate;
}
public Date getPolicyStartDate() {
	return policyStartDate;
}
public void setPolicyStartDate(Date policyStartDate) {
	this.policyStartDate = policyStartDate;
}
public Date getPolicyEndDate() {
	return policyEndDate;
}
public void setPolicyEndDate(Date policyEndDate) {
	this.policyEndDate = policyEndDate;
}
public Float getSumInsured() {
	return sumInsured;
}
public void setSumInsured(Float sumInsured) {
	this.sumInsured = sumInsured;
}
public Float getPremiumAmount() {
	return premiumAmount;
}
public void setPremiumAmount(Float premiumAmount) {
	this.premiumAmount = premiumAmount;
}
 
}

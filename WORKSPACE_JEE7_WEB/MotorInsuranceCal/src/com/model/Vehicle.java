package com.model;

public class Vehicle {
	String vehicleNumber, vehicleType, manufacturer, vehicleModel, engineCC, fuelType, passingYear, chassisNo,
			vehicleColour;
	Float vehicleCost;
	Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleNumber, String vehicleType, String manufacturer, String vehicleModel, String engineCC,
			String fuelType, String passingYear, String chassisNo, String vehicleColour, Float vehicleCost) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.manufacturer = manufacturer;
		this.vehicleModel = vehicleModel;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.passingYear = passingYear;
		this.chassisNo = chassisNo;
		this.vehicleColour = vehicleColour;
		this.vehicleCost = vehicleCost;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getVehicleColour() {
		return vehicleColour;
	}
	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}
	public Float getVehicleCost() {
		return vehicleCost;
	}
	public void setVehicleCost(Float vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", manufacturer="
				+ manufacturer + ", vehicleModel=" + vehicleModel + ", engineCC=" + engineCC + ", fuelType=" + fuelType
				+ ", passingYear=" + passingYear + ", chassisNo=" + chassisNo + ", vehicleColour=" + vehicleColour
				+ ", vehicleCost=" + vehicleCost + "]";
	}
	
	
}

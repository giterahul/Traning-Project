package com.allianz.shopping.model;

import java.util.Date;

public class Product {
	private int id;
	private String code;
	private String description;
	private float price;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String code, String description, float price,Date date) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
		this.date = date;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}


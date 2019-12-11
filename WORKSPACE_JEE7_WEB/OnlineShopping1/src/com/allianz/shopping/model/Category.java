package com.allianz.shopping.model;

public class Category {
	 int categoryId;
	String categoryCode,catDesc;
	
	public Category() {
		super();
	}
	public int categoryId() {
		return categoryId;
	}
	public void categoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryCode=" + categoryCode + ", catDesc=" + catDesc
				+ "]";
	}
	public Category(int categoryId, String categoryCode, String catDesc) {
		super();
		this.categoryId = categoryId;
		this.categoryCode = categoryCode;
		this.catDesc = catDesc;
	}
	 
	
	
}

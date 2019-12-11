package com.allianz.shopping.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productID")
	private Integer id;
	
	@Column(name="productCode")
	private String code;
	
	@Column(name="productDescription")
	private String description;
	
	@Column(name="productPrice")
	private Float price;
	
	@Column(name="productDate")
	private Date manfDate;
	@Transient
	private List<Category> categoryList=new ArrayList<Category>();

	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	public Integer getId() {
		return id;
	}
	public Product() {
		super();
		this.id = 0;
		this.code = null;
		this.description = null;
		this.price = 0.0f;
		this.manfDate = null;
	}

	public Product(Integer id, String code, String description, float price, Date manfDate) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
		this.manfDate = manfDate;
	}

	public void setId(Integer id) {
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Date getManfDate() {
		return manfDate;
	}

	public void setManfDate(Date manfDate) {
		this.manfDate = manfDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + ", price=" + price
				+ ", manfDate=" + manfDate + "]";
	}



}

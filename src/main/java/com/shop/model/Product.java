package com.shop.model;

public class Product {

	private Long id;
	private String name;
	private float price;
	private String description;
	private Subcategory idSubcategory;

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public Subcategory getIdSubcategory() {
		return idSubcategory;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdSubcategory(Subcategory idSubcategory) {
		this.idSubcategory = idSubcategory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

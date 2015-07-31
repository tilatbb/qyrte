package com.shop.model;

public class Subcategory {

	private Long id;
	private String name;
	private Category idCategory;

	public Long getId() {
		return id;
	}

	public Category getIdCategory() {
		return idCategory;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdCategory(Category idCategory) {
		this.idCategory = idCategory;
	}

	public void setName(String name) {
		this.name = name;
	}

}

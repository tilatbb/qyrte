package com.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity(name="Subcategories")
public class Subcategory {

	@Id
	@GeneratedValue
	@Column(name="SUBCATEGORY_ID")
	private Long id;

	@Column(name="SUBCATEGORY_NAME")
	private String name;
	
	@ManyToOne
	private Category category;
	
	
	@Column(name="CATEGORY_ID_FK")
	private Long categoryId;

	@OneToMany(mappedBy="subcategory", cascade=CascadeType.ALL)
	List<Product> products = new ArrayList<Product>();

	public Category getCategory() {
		return category;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

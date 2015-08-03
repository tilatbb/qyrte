package com.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Category {

	@Id
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	private Long id;
	
	@Column(name="CATEGORY_NAME")
	private String name;

	@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
	List<Subcategory> subcategories = new ArrayList<Subcategory>();
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

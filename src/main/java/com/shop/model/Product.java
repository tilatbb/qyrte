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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long id;

	@Column(name = "PRODUCT_NAME")
	private String name;

	@Column(name = "PRODUCT_PRICE")
	private float price;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String description;

	@Column(name = "PRODUCT_IMAGE_URL")
	private String url;

	@OneToOne
	private Comment comment;

	@ManyToOne
	private Command commands;

	@ManyToOne
	private Subcategory subcategoris;

	public Command getCommands() {
		return commands;
	}

	public Comment getComment() {
		return comment;
	}

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public Subcategory getSubcategoris() {
		return subcategoris;
	}

	public String getUrl() {
		return url;
	}

	public void setCommands(Command commands) {
		this.commands = commands;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setSubcategoris(Subcategory subcategoris) {
		this.subcategoris = subcategoris;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

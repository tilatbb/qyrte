package com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comment {

	@Id
	@GeneratedValue
	@Column(name="COMMENT_ID")
	private Long id;
	
	private String comment;
	
	@ManyToOne
	private User user;

	
	@ManyToOne
	private Product product;

	public String getComment() {
		return comment;
	}
	//Start Getters and Setters
	public Long getId() {
		return id;
	}
	public Product getProduct() {
		return product;
	}
	public User getUser() {
		return user;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setUser(User user) {
		this.user = user;
	}

	//End Getters and Setters
	
	
}

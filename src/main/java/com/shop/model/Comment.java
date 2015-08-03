package com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	private User idUser;

	@OneToOne
	private Product idPdoduct;

	//Start Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public User getIdUser() {
		return idUser;
	}
	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}
	public Product getIdPdoduct() {
		return idPdoduct;
	}
	public void setIdPdoduct(Product idPdoduct) {
		this.idPdoduct = idPdoduct;
	}
	//End Getters and Setters
	
	
}

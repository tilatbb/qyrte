package com.shop.model;

public class Comment {

	private Long id;
	
	private String comment;
	
	private User idUser;

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

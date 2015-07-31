package com.shop.model;




public class Command {

	private Long id;
	
	private float total;

	private User idUser;

	private Product idPdoduct;

	//Start Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
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

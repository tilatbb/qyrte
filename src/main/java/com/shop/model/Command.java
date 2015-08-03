package com.shop.model;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Commands")
public class Command {

	@Id
	@GeneratedValue
	@Column(name="COMMAND_ID")
	private Long id;
	
	@Column(name="TOTAL")
	private float total;

	@ManyToOne
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

package com.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private User user;

	@OneToOne
	private Address addressCommand;
	
	@OneToMany(mappedBy="command", cascade=CascadeType.ALL)
	private List<Product> product = new ArrayList<Product>();

	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddressCommand() {
		return addressCommand;
	}
	public void setAddressCommand(Address addressCommand) {
		this.addressCommand = addressCommand;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	//End Getters and Setters
	
}

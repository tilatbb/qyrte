package com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Addresses")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private Long id;
	
	@Column(name="ADDRESS_ADDRESS")
	private String address;
	
	@OneToOne
	private User addressUser;
	
	@OneToOne
	private Command addressCommand;

	public String getAddress() {
		return address;
	}

	public Command getAddressCommand() {
		return addressCommand;
	}

	public User getAddressUser() {
		return addressUser;
	}

	public Long getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressCommand(Command addressCommand) {
		this.addressCommand = addressCommand;
	}

	public void setAddressUser(User addressUser) {
		this.addressUser = addressUser;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

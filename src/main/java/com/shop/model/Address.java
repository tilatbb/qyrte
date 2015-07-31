package com.shop.model;

public class Address {
	
	Long id;
	
	String address;

	public String getAddress() {
		return address;
	}

	public Long getId() {
		return id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

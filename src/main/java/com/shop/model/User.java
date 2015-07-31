package com.shop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Long id;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_PASSWORD")
	private String password;
	
	@OneToOne
	private Address userAddress;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Command> userCommands = new ArrayList<Command>();
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Comment> userComments = new ArrayList<Comment>();

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public Address getUserAddress() {
		return userAddress;
	}

	public List<Command> getUserCommands() {
		return userCommands;
	}

	public List<Comment> getUserComments() {
		return userComments;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	public void setUserCommands(List<Command> userCommands) {
		this.userCommands = userCommands;
	}

	public void setUserComments(List<Comment> userComments) {
		this.userComments = userComments;
	}

}

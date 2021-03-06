package com.geo.play.model;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private String role;
	
	public Employee(){}
	

	public Employee(int id, String firstname, String lastname, String role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}

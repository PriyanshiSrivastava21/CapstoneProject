package com.simplilearn.webservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineer")
public class Engineer {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String engineername;
	private int age;
	private String password;
	
	public Engineer() {}
	
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
	public String getEngineername() {
		return engineername;
	}
	public void setEngineername(String engineername) {
		this.engineername = engineername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Engineer(int id, String firstname, String lastname, String engineername, int age, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.engineername = engineername;
		this.age = age;
		this.password = password;
	}
	
	
}

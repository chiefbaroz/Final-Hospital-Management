package com.hospital.example.pojo;

import javax.persistence.Entity;

@Entity
public class Patient 
{
	private String name;
	private String email;
	private String position;
	
	public Patient() 
	{
		super();
		
	}

	public Patient(String name, String email, String position) 
	{
		super();
		this.name = name;
		this.email = email;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}

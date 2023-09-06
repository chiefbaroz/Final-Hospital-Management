package com.finalhospital.example.pojo;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Administration 
{
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	
	@Embedded
	private Address address;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	

}

package com.finalhospital.example.pojo;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Staffs 
{
	private String first_name;
	private String last_name;
	private String role;
	
	@Embedded
	private Address address;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	

}

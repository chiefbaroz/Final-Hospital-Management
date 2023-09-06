package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Insurance 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String insuranceId;
	private String insuranceName;
	
	
		
	@ManyToMany(mappedBy = "insurance")
	private List<Records> records;	
	
	@ManyToMany(mappedBy = "insurance")
	private List<Bill> bill;	
	
	@ManyToMany(mappedBy = "insurance")
	private List<Patient> patient;


}

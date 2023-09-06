package com.finalhospital.example.pojo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicalDirectorFunctions 
{
	@Id
	@GeneratedValue
	private Integer medicalDirectorFunctionsId;

	//private String medicalDirectorFunctionsId;
	private String assignDoctors;
	private LocalDateTime dateTime;


	@OneToMany(mappedBy = "medicaldirectorfunctions")
	private List<ConsultingRoom> consulting;
	
	@OneToMany(mappedBy = "medicaldirectorfunctions")
	private List<Emergency> emergency;
	
	@OneToMany(mappedBy = "medicaldirectorfunctions")
	private List<Lab> lab;
	
	@OneToMany(mappedBy = "medicaldirectorfunctions")
	private List<Pharmacy> Pharmacy;
	
	@OneToMany(mappedBy = "medicaldirectorfunctions")
	private List<Ward> ward;
	
	@OneToOne(mappedBy = "medicaldirectorfunctions")
	private Report report;
}

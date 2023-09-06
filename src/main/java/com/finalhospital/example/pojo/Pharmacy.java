package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pharmacy 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer pharmacyId;
	private String pharmacyName;
	
	@ManyToMany(mappedBy = "pharmacy")
	private List<PharmacistFunctions>pharmacistfunctions;
		
	@ManyToMany
	@JoinTable(name = "pharmacy_patient", joinColumns = @JoinColumn(name = "pharmacyId"),inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@ManyToOne
	@JoinTable(name = "pharmacy_medicaldirectorfunctions", joinColumns = @JoinColumn(name = "pharmacyId"),inverseJoinColumns = @JoinColumn(name = "medicalDirectorFunctionsId"))
	private MedicalDirectorFunctions medicaldirectorfunctions;

}

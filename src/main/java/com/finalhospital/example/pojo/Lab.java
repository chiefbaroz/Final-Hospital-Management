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
public class Lab 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer labId;
	private String labName;
	
	@ManyToMany
	@JoinTable(name = "lab_patient", joinColumns = @JoinColumn(name = "labId"),inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@ManyToMany
	@JoinTable(name = "lab_labtechnicianfunctions", joinColumns = @JoinColumn(name = "labId"),inverseJoinColumns = @JoinColumn(name = "labTechnicianId"))
	private List<LabTechnicianFunctions> labtechnicianfunctions;

	@ManyToOne
	@JoinTable(name = "lab_labtechnicianfunctions", joinColumns = @JoinColumn(name = "labId"),inverseJoinColumns = @JoinColumn(name = "medicaldirectorId"))
	private MedicalDirectorFunctions medicaldirectorfunctions;



}

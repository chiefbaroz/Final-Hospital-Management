package com.finalhospital.example.pojo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LabTechnicianFunctions 
{
	@Id
	@GeneratedValue
	private Integer labTechnicianFunctionsId;
	
	//private String labTechnicianFunctionsId;
	private String runTest;
	private String results;
	private LocalDateTime dateTime;
	
	@ManyToMany(mappedBy = "labtechnicianfunctions")
	private List<Bill> bill;
	
	@ManyToMany(mappedBy = "labtechnicianfunctions")
	private List<Lab> lab;
	
	@ManyToMany(mappedBy = "labtechnicianfunctions")
	private List<NurseFunctions> nursefunctions;	
	
	@ManyToMany(mappedBy = "labtechnicianfunctions")
	private List<Report> report;
	
	@ManyToMany
	@JoinTable(name = "labtechnicianfunctions_doctorfunctions", joinColumns = @JoinColumn(name = "labTechnicianId"),inverseJoinColumns = @JoinColumn(name = "doctorId"))
	private List<DoctorFunctions> doctorfunctions;
}

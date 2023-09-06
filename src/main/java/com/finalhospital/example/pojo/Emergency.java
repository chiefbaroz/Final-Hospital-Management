package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emergency 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer emergencyId;
	private String emergencyName;
	
	@ManyToMany
	@JoinTable(name = "emergency_doctorfunction", joinColumns = @JoinColumn(name = "emergencyId"), inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId"))
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany
	@JoinTable(name = "emergency_nursefunctions", joinColumns = @JoinColumn(name = "emergencyId"), inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;
	
	@ManyToMany
	@JoinTable(name = "emergency_patient", joinColumns = @JoinColumn(name = "emergencyId"), inverseJoinColumns = @JoinColumn(name = "patientId"))
    private List<Patient> patient;
	
	@OneToMany(mappedBy = "emergency")
	private List<Report> report;
	
	@ManyToOne
	@JoinTable(name = "emergency_medicaldirectorfunction", joinColumns = @JoinColumn(name = "emergencyId"), inverseJoinColumns = @JoinColumn(name = "medicaldirectorFunctionsId"))
    private MedicalDirectorFunctions medicaldirectorfunctions;
		
	@ManyToOne
	@JoinTable(name = "emergency_matron", joinColumns = @JoinColumn(name = "emergencyId"), inverseJoinColumns = @JoinColumn(name = "matronFunctionsId"))
	private MatronFunctions matronfunctions;

}

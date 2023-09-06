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
public class Ward 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer wardId;
	private String wardName;
	
	@ManyToMany
	@JoinTable(name = "ward_emergency", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "emergencyId"))
	private List<Emergency> emergency;
	
	@ManyToMany
	@JoinTable(name = "ward_patient", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@ManyToMany
	@JoinTable(name = "ward_doctorfunction", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId"))
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany
	@JoinTable(name = "ward_nursefunctions", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;
	
	@ManyToMany
	@JoinTable(name = "ward_opd", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "opdId"))
	private List<OPD> opd;
	
	@ManyToOne
	@JoinTable(name = "ward_matronfunctions", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "matronFunctionsId"))
	private MatronFunctions matronfunctions;	
	
	@ManyToOne
	@JoinTable(name = "ward_medicaldirectorfunctions", joinColumns = @JoinColumn(name = "wardId"), inverseJoinColumns = @JoinColumn(name = "medicalDirectorFunctionsId"))
	private MedicalDirectorFunctions medicaldirectorfunctions;	
	
	@ManyToMany(mappedBy = "ward")
	private List<Bill> bill;
	
}


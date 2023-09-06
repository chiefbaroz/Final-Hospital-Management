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
public class NurseFunctions 
{
	@Id
	@GeneratedValue
	private Integer nurseFunctionsId;
	
	//private String nurseFunctionsId;
	private String viewDiagnose;
	private String viewLabResults;
	private String viewTreatment;
	private String checkTemperature;
	private String checkWeight;
	private LocalDateTime dateTime;
	
	@ManyToMany(mappedBy = "nursefunctions")
	private List<Bill> bill;
	
	@ManyToMany(mappedBy = "nursefunctions")
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany(mappedBy = "nursefunctions")
	private List<Emergency> emergency;
	
	@ManyToMany(mappedBy = "nursefunctions")
	private List<Ward> ward;
	
	@ManyToMany(mappedBy = "nursefunctions")
	private List<Triagens> triagens;
	
	@ManyToMany
	@JoinTable(name = "nursefunctions_labtechnicianfunction", joinColumns = @JoinColumn(name = "nurseFunctionsId"),inverseJoinColumns = @JoinColumn(name = "labTechnicianFunctionsId"))
	private List<LabTechnicianFunctions> labtechnicianfunctions;
}

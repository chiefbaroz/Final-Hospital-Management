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
//@NoArgsConstructor
@Data
public class DoctorFunctions 
{
	@Id
	@GeneratedValue
	private Integer doctorFunctionsId;
	
	//private String doctorFunctionsId;
	private String diagnoses;
	private String treatment;
	private String patientComplaints;
	private LocalDateTime dateTime;
	
	public DoctorFunctions()
	{
		
	}
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<ConsultingRoom> consultingroom;
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<Bill> bill;
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<Emergency> emergency;
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<Ward> ward;
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<PharmacistFunctions> pharmacistfunctions;
	
	@ManyToMany(mappedBy = "doctorfunctions")
	private List<LabTechnicianFunctions> labtechnicianfunctions;
	
	@ManyToMany
	@JoinTable(name = "doctorfunctions_doctor", joinColumns = @JoinColumn(name = "doctorFunctionsId"),inverseJoinColumns = @JoinColumn(name = "doctorId"))
	private List<Doctor> doctor;
	
	@ManyToMany
	@JoinTable(name = "doctorfunctions_nursefunctions", joinColumns = @JoinColumn(name = "doctorFunctionsId"),inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;
	

}

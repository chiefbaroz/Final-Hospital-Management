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
public class ConsultingRoom 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer consultingId;
	private String consulting_name;
	
	@ManyToMany
	@JoinTable(name = "consulting_patient", joinColumns = @JoinColumn(name = "consultingId"),inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@ManyToMany
	@JoinTable(name = "consulting_doctorfunaction", joinColumns = @JoinColumn(name = "consultingId"), inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId") )
	private List<DoctorFunctions> doctorfunctions;

//	@OneToMany(mappedBy = "consultingroom") //Bidirectional
//	private List<Hospital> hospital;
	
	@ManyToOne
	@JoinTable(name = "consultingroom_medicaldirectorfunctions", joinColumns = @JoinColumn(name = "consultingId"),inverseJoinColumns = @JoinColumn(name = "medicalDirectorFunctionsId"))
	private  MedicalDirectorFunctions medicaldirectorfunctions;
}


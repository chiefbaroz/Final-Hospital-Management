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
public class PharmacistFunctions 
{
	@Id
	@GeneratedValue
	private Integer pharmacistFunctionsId;
	
	//private String  pharmacistFunctionsId;
	private String viewTreatment;
	private String chargeBill;
	private String servePatients;
	private LocalDateTime dateTime;
	
	@ManyToMany(mappedBy = "pharmacistfunctions")
	private List<Bill> bill;
	
	@ManyToMany(mappedBy = "pharmacistfunctions")
	private List<Report> report;
	
	
	@ManyToMany
	@JoinTable(name = "pharmacistfunctions_doctorfunction", joinColumns = @JoinColumn(name = "pharmacistFunctionsId"),inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId"))
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany
	@JoinTable(name = "pharmacistfunctions_pharmacy", joinColumns = @JoinColumn(name = "pharmacistFunctionsId"),inverseJoinColumns = @JoinColumn(name = "pharmacyId"))
	private List<Pharmacy> pharmacy;


}

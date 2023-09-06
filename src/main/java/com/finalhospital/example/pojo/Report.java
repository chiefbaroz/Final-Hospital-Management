package com.finalhospital.example.pojo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Report 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer reportId;
	private String name;
	private LocalDateTime dateTime;

	@ManyToMany
	@JoinTable(name = "report_accountantfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "accountantFunctionsId"))
	private List<AccountantFunctions> accountantfunctions;
	
	@ManyToMany
	@JoinTable(name = "report_doctorfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId"))
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany
	@JoinTable(name = "report_emergency", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "emergencyId"))
	private List<Emergency> emergency;
	
	@ManyToMany
	@JoinTable(name = "report_labtechnicianfunction", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "labTechnicianFunctionsId"))
	private List<LabTechnicianFunctions> labtechnicianfunctions;
	
	@ManyToMany
	@JoinTable(name = "report_storekeeperfunction", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "storeKeeperFunctionsId"))
	private List<StoreKeeperFunctions> storekeeperfunctions;
	
	@ManyToMany
	@JoinTable(name = "report_nursefunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;
	
	@ManyToMany
	@JoinTable(name = "report_pharmacistfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "pharmacistFunctionsId"))
	private List<PharmacistFunctions> pharmacistfunctions;
	
	@ManyToMany
	@JoinTable(name = "report_recordsstafffunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "recordsStaffFunctionsId"))
	private List<RecordsStaffFunctions> recordsstafffunctions;

	@OneToOne
	@JoinTable(name = "report_medicaldirectorfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "medicalDirectorFunctionsId"))
	private MedicalDirectorFunctions medicaldirectorfunctions;
	
	@OneToOne
	@JoinTable(name = "report_matronfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "matronFunctionsId"))
	private MatronFunctions matronfunctions;
	
	@OneToOne
	@JoinTable(name = "report_administratorfunctions", joinColumns = @JoinColumn(name = "reportId"),inverseJoinColumns = @JoinColumn(name = "administratorFunctionsId"))
	private AdministratorFunctions administratorfunctions;
	


	

}

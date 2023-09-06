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
public class Bill 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer billId;
	private String createBill;
	private double amount;
	private LocalDateTime dateTime;
	
	@ManyToMany
	@JoinTable(name = "bill_labtechicianfunction", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "labTechnicianFunctionsId"))
	private List<LabTechnicianFunctions> labtechnicianfunctions;

	@ManyToMany
	@JoinTable(name = "bill_nursefunctions", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;

	@ManyToMany
	@JoinTable(name = "bill_store", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "storeId"))
	private List<MedicalStore> medicalstore;
	
	@ManyToMany
	@JoinTable(name = "bill_doctorfunction", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "doctorFunctionsId"))
	private List<DoctorFunctions> doctorfunctions;
	
	@ManyToMany
	@JoinTable(name = "bill_pharmacistfunction", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "pharmacistFunctionsId"))
	private List<PharmacistFunctions> pharmacistfunctions;
	
	@ManyToMany
	@JoinTable(name = "bill_recordsstafffunctions ", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "recordsStaffFunctionsId"))
	private List<RecordsStaffFunctions> recordsstafffunctions;
	
	@ManyToMany
	@JoinTable(name = "bill_storekeeperfunction ", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "storeKeeperFunctionsId"))
	private List<StoreKeeperFunctions> storekeeperfunctions;
	
	@ManyToMany
	@JoinTable(name = "bill_insurance ", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "insuranceId"))
	private List<Insurance> insurance;
	
	@ManyToMany
	@JoinTable(name = "bill_ward", joinColumns = @JoinColumn(name = "billId"),inverseJoinColumns = @JoinColumn(name = "wardId"))
	private List<Ward> ward;
	
	@OneToOne(mappedBy = "bill")
	private AdministratorFunctions administratorfunctions;
}

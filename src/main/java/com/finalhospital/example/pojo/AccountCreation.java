package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountCreation 
{
	@Id
	@GeneratedValue
	private Integer accountCreationId;
	
	private String staffId;
	private String role;
	private String password;
	
	
	@ManyToMany
	@JoinTable(name = "accountcreation_accountant", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "accountantId"))
	private List<Accountant> accountant;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_doctor", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "doctorId"))
	private List<Doctor> doctor;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_labtechnician", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "labTechnicianId"))
	private List<LabTechnician> labtechnician;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_matron", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "matronId"))
	private List<Matron> matron;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_medicaldirector", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "medicaldirectorId"))
	private List<MedicalDirector> medicaldirector;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_nurse", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "nurseId"))
	private List<Nurse> nurse;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_pharmacist", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "pharmacistId"))
	private List<Pharmacist> pharmacist;
	
	@ManyToMany
	@JoinTable(name = "accountcreation_recordstaff", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "recordStaffId"))
	private List<RecordsStaff> recordsstaff;
		
	@ManyToMany
	@JoinTable(name = "accountcreation_storekeeper", joinColumns = @JoinColumn(name = "accountCreationId"),inverseJoinColumns = @JoinColumn(name = "storekeeperId"))
	private List<StoreKeeper> storekeeper;









}

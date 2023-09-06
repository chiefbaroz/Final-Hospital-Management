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
public class AccountsOffice 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer accountofficeId;
	private String accountName;
	
	@ManyToMany
	@JoinTable(name = "accountsoffice_patient", joinColumns = @JoinColumn(name = "accountofficeId"),inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@ManyToMany
	@JoinTable(name = "account_accountantfunctions", joinColumns = @JoinColumn(name = "accountofficeId"),inverseJoinColumns = @JoinColumn(name = "accountantFunctionsId"))
	private List<AccountantFunctions> accountantfunctions;
	

		
}

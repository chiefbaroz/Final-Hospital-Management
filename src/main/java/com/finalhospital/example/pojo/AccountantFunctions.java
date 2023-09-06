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
public class AccountantFunctions 
{
	@Id
	@GeneratedValue
	private Integer accountantFunctionsId;
	
	//private String accountantFunctionsId;
	private String indicatePaidCharges;
	private LocalDateTime dateTime;

	
	@ManyToMany
	@JoinTable(name = "accountantfunctions_accountant", joinColumns = @JoinColumn(name = "accountantFunctionsId"),inverseJoinColumns = @JoinColumn(name = "accountantId"))
	private List<Accountant> accountant;
	
	@ManyToMany(mappedBy = "accountantfunctions")
	private List<AccountsOffice> accountsoffice;
	
	@ManyToMany(mappedBy = "accountantfunctions")
	private List<Report> report;

}

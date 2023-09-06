package com.finalhospital.example.pojo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdministratorFunctions 
{
	@Id
	@GeneratedValue
	private Integer administratorFunctionsId;
	
	//private String  administratorFunctionsId;
	private String createStaffs;
	private String manageActivities;
	private String generateBills;
	private LocalDateTime dateTime;

	
	@OneToOne
	@JoinTable(name = "administratorfunctions_bill", joinColumns = @JoinColumn(name = "administratorId"),inverseJoinColumns = @JoinColumn(name = "billId"))
	private Bill bill;
	
	@OneToOne(mappedBy = "administratorfunctions")
	private Report report;


}

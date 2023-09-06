package com.finalhospital.example.pojo;

import java.time.LocalDate;
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
public class StoreKeeperFunctions 
{
	@Id
	@GeneratedValue
	private Integer storeKeeperFunctionsId;

	//private String storeKeeperFunctionsId;
	private double itemQuantity;
	private String manufacturer;
	private LocalDate MfgDate;
	private LocalDate ExpDate;
	private LocalDateTime date_time;
	
	private String requisitionForAllUnits;
	
	@ManyToMany(mappedBy = "storekeeperfunctions")
	private List<MedicalStore> medicalstore;
	
	@ManyToMany(mappedBy = "storekeeperfunctions")
	private List<Report> report;
	
	@ManyToMany(mappedBy = "storekeeperfunctions")
	private List<Bill> bill;
}

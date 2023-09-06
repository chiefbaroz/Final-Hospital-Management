package com.finalhospital.example.pojo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class RecordsStaffFunctions 
{
	@Id
	@GeneratedValue
	private Integer recordStaffFunctionsId;
	
	//private String recordStaffFunctionsId;
	private String generatePatientId; 
	private String activate;
	private String deactivate;
	private LocalDateTime dateTime;
	
	@ManyToMany(mappedBy = "recordsstafffunctions")
	private List<Bill> bill;
	
	@ManyToMany(mappedBy = "recordsstafffunctions")
	private List<Records> records;
	
	@ManyToMany(mappedBy = "recordsstafffunctions")
	private List<Report> report;
}



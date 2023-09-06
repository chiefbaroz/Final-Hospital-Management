package com.finalhospital.example.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DoctorPharmacistFunctions 
{
	private String diagnoses;
	private String treatment;
	private String patient_complaints;
	private String viewTreatment;
	private String chargeBill;
	private String servePatients;
	private LocalDateTime dateTime;
	

}

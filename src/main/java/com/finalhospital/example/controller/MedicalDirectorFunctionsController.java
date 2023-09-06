package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.MedicalDirectorFunctions;
import com.finalhospital.example.service.MedicalDirectorFunctionsService;

@RestController
public class MedicalDirectorFunctionsController 
{
	@Autowired
	private MedicalDirectorFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/medicaldirectorfunction")
	public ResponseEntity<?> medicalDirectorFunctions(@RequestBody MedicalDirectorFunctions medicaldirectorfunctions)
	{
		service.medicalDirectorFunctions(medicaldirectorfunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.DoctorFunctions;
import com.finalhospital.example.service.DoctorFunctionsService;

@RestController
public class DoctorFunctionsController 
{
	@Autowired
	private DoctorFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/diagnose")
	public ResponseEntity<?> doctorFunctionsTab(@RequestBody DoctorFunctions doctorfunctions)
	{
		service.doctorFunctions(doctorfunctions);
		
		return  ResponseEntity.ok("save");
	}

}

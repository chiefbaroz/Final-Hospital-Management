package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.LabTechnicianFunctions;
import com.finalhospital.example.service.LabTechnicianFunctionsService;

@RestController
public class LabTechnicianFunctionsController 
{
	@Autowired
	private LabTechnicianFunctionsService service;
	@RequestMapping(method = RequestMethod.POST, value = "/api/labtechnicianfunction")
	public ResponseEntity<?> labTechnicianFunctionsTab(@RequestBody LabTechnicianFunctions labtechnicianfunctions)
	{
		service.labTechnicianFunctions(labtechnicianfunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.PharmacistFunctions;
import com.finalhospital.example.service.PharmacistFunctionsService;

@RestController
public class PharmacistFunctionsController 
{
	@Autowired
	private PharmacistFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/pharmacistfunction")
	public ResponseEntity<?> pharmacistFunctionsTab(@RequestBody PharmacistFunctions pharmacistfunctions)
	{
		service.pharmacistFunctions(pharmacistfunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

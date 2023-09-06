package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.AdministratorFunctions;
import com.finalhospital.example.service.AdministratorFunctionsService;

@RestController
public class AdministratorFunctionsController 
{
	@Autowired
	private AdministratorFunctionsService service;
	
	@RequestMapping(method =  RequestMethod.POST, value = "/api/administratorfunction")
	public ResponseEntity<?> administratorFunctions(@RequestBody AdministratorFunctions administratorfunctions)
	{
		service.administratorFunctions(administratorfunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

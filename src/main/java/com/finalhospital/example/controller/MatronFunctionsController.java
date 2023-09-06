package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.MatronFunctions;
import com.finalhospital.example.service.MatronFunctionsService;

@RestController
public class MatronFunctionsController 
{
	@Autowired
	private MatronFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/matronfunction")
	public ResponseEntity<?> matronFunctions(@RequestBody MatronFunctions matronfunctions)
	{
		service.matronFunctions(matronfunctions);
		
		return ResponseEntity.ok("save");
	}

}

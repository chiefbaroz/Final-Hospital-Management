package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.NurseFunctions;
import com.finalhospital.example.service.NurseFunctionsService;

@RestController
public class NurseFunctionsController 
{
	@Autowired 
	
	private NurseFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/nursefunction")
	public ResponseEntity<?> nurseFunctionsTab(@RequestBody NurseFunctions nursefunctions)
	{
		service.nurseFunctions(nursefunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

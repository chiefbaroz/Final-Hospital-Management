package com.finalhospital.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.dto.DoctorNurseFunctionsDTO;
import com.finalhospital.example.pojo.DoctorFunctions;
import com.finalhospital.example.service.DoctorNurseFunctionsDTOService;

@RestController
public class DoctorNurseFunctionsDTOController 
{
	@Autowired
	private DoctorNurseFunctionsDTOService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/findall")
	public ResponseEntity<?>getAllDocNurse()
	{
		List <DoctorNurseFunctionsDTO> docnurse = service.getAll();
		
		return ResponseEntity.ok(docnurse);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/api/create" )
	public ResponseEntity<String> createDoctorFunctions(@RequestBody DoctorFunctions doctorfunctions)
	{
		service.create(doctorfunctions);
		
		return  ResponseEntity.ok("DoctorFunctions Created");
	}

}

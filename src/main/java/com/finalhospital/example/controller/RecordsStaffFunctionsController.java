package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.RecordsStaffFunctions;
import com.finalhospital.example.service.RecordsStaffFunctionsService;

@RestController
public class RecordsStaffFunctionsController 
{
	@Autowired
	private RecordsStaffFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/recordsstafffunction")
	public ResponseEntity<?> recordsStaffFunctionsTab(@RequestBody RecordsStaffFunctions recordsstafffunctions)
	{
		service.recordsStaffFunctions(recordsstafffunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

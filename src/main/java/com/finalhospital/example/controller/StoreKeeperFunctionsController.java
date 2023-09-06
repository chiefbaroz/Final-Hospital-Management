package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.StoreKeeperFunctions;
import com.finalhospital.example.service.StoreKeeperFunctionsService;

@RestController
public class StoreKeeperFunctionsController 
{
	@Autowired
	private StoreKeeperFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/storekeeperfunction")
	public ResponseEntity<?> storeKeeperFunctionsTab(@RequestBody StoreKeeperFunctions storekeeperfunctions)
	{
		service.storeKeeperFunctions(storekeeperfunctions);
		
		return ResponseEntity.ok("save");
	}

}

package com.finalhospital.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.pojo.AccountantFunctions;
import com.finalhospital.example.service.AccountantFunctionsService;

@RestController
public class AccountantFunctionsController 
{
	@Autowired
	private AccountantFunctionsService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/accountantfunction")
	public ResponseEntity<?> accountantFunctionsTab(@RequestBody AccountantFunctions accountantfunctions)
	{
		service.accountantFunctions(accountantfunctions);
		
		return ResponseEntity.ok("save");
		
	}

}

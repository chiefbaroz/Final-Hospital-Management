package com.finalhospital.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalhospital.example.dao.AccountCreationDao;
import com.finalhospital.example.pojo.AccountCreation;
import com.finalhospital.example.service.AccountCreationService;

@RestController
public class AccountCreationController 
{
	@Autowired
	private AccountCreationDao dao;
	
	@Autowired
	private AccountCreationService service;
	
	@RequestMapping(method = RequestMethod.POST, value ="/api/account")
	public ResponseEntity<?> creatingAccount(@RequestBody AccountCreation accountcreation)
	{
		AccountCreation acct = service.createAccount(accountcreation);
		
		if(acct == null)
		{
			return new ResponseEntity<String>("already exist" , HttpStatus.OK);	
		}
		return new ResponseEntity<AccountCreation>(acct, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/api/findaccount")
	public ResponseEntity<?> oneAccount(@RequestBody AccountCreation accountcreation)
	{
		AccountCreation account = service.findOneAccount(accountcreation);
		
		if(account != null)
		{
			return new ResponseEntity<AccountCreation>(account, HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("Not Found",HttpStatus.OK);		
	}
	
	@RequestMapping("/api/findallaccount")
	public ResponseEntity<?> allAccounts()
	{
		List <AccountCreation> list = service.findAllAccount();
		
		return ResponseEntity.ok(list);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/api/updateAccount/{accountCreationId}")
	public ResponseEntity<?> updateAccount(@PathVariable Integer accountCreationId , @RequestBody AccountCreation accountcreation)
	{
		AccountCreation acccreation = service.updateAccount(accountCreationId, accountcreation);
		
		if(acccreation != null)
		{
			return new ResponseEntity<AccountCreation>(acccreation,HttpStatus.OK);
		}
		return new ResponseEntity<String>("Not Updated", HttpStatus.OK);
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/deleteaccount/{accountCreationId}")
	public ResponseEntity<?>  deleteAccountById(@PathVariable Integer accountCreationId)
	{
	 boolean del = service.deleteAccount(accountCreationId);
	 
	 if(del == false)
	 {
		 return new ResponseEntity<String>("Not Deleted", HttpStatus.OK);
	 }
	 return new  ResponseEntity<String>("Deleted", HttpStatus.OK);
		
	}


}

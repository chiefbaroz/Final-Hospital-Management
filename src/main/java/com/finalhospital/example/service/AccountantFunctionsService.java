package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.AccountantFunctionsDao;
import com.finalhospital.example.pojo.AccountantFunctions;

@Service
public class AccountantFunctionsService implements AccountantFunctionsImp
{
	@Autowired
	private AccountantFunctionsDao dao;
	
	@Override
	public void accountantFunctions(AccountantFunctions accountantfunctions)
	{
		dao.save(accountantfunctions);
	}


}

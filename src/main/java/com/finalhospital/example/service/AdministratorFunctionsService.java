package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.AdministratorFunctionsDao;
import com.finalhospital.example.pojo.AdministratorFunctions;

@Service
public class AdministratorFunctionsService implements AdministratorFunctionsImp
{
	@Autowired
	private AdministratorFunctionsDao dao;
	
	@Override
	public void administratorFunctions(AdministratorFunctions administratorfunctions)
	{
		dao.save(administratorfunctions);
		
	}

}

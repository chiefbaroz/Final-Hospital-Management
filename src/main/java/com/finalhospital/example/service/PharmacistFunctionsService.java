package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.PharmacistFunctionsDao;
import com.finalhospital.example.pojo.PharmacistFunctions;

@Service
public class PharmacistFunctionsService implements PharmacistFunctionsImp
{
	@Autowired
	private PharmacistFunctionsDao dao;
	
	@Override
	public void pharmacistFunctions(PharmacistFunctions pharmacistfunctions)
	{
		dao.save(pharmacistfunctions);
	}

	
	

}

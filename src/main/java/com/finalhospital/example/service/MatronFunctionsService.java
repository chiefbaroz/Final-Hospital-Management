package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.MatronFunctionsDao;
import com.finalhospital.example.pojo.MatronFunctions;

@Service
public class MatronFunctionsService implements MatronFunctionsImp
{
	@Autowired
	private MatronFunctionsDao dao;
	
	@Override
	public void matronFunctions(MatronFunctions matronfunctions)
	{
		dao.save(matronfunctions);
		
	}

}

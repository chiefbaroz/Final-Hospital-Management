package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.MedicalDirectorFunctionsDao;
import com.finalhospital.example.pojo.MedicalDirectorFunctions;

@Service
public class MedicalDirectorFunctionsService implements MedicalDirectorFunctionsImp
{
	@Autowired
	private MedicalDirectorFunctionsDao dao;
	
	@Override
	public void medicalDirectorFunctions(MedicalDirectorFunctions medicaldirectorfunctions)
	{
		dao.save(medicaldirectorfunctions);
		
	}


}

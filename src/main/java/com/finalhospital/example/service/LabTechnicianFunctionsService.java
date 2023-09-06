package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.LabTechnicianFunctionsDao;
import com.finalhospital.example.pojo.LabTechnicianFunctions;

@Service
public class LabTechnicianFunctionsService implements LabTechnicianFunctionsImp
{
	@Autowired
	private LabTechnicianFunctionsDao dao;
	
	@Override
	public void labTechnicianFunctions(LabTechnicianFunctions labtechnicianfunctions)
	{
		dao.save(labtechnicianfunctions);
		
	}


}

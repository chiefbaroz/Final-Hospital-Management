package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.DoctorFunctionsDao;
import com.finalhospital.example.pojo.DoctorFunctions;

@Service
public class DoctorFunctionsService implements DoctorFunctionsImp
{
	@Autowired
	private DoctorFunctionsDao dao;
	
	@Override
	public void doctorFunctions(DoctorFunctions doctorfunctions)
	{
	    dao.save(doctorfunctions);
	}
	


}

package com.finalhospital.example.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.DoctorPharmacistFunctionsDao;
import com.finalhospital.example.pojo.DoctorFunctions;

@Service
public class DoctorPharmacistFunctionsService 
{
	@Autowired
	private DoctorPharmacistFunctionsDao dao;
	
			
	
}

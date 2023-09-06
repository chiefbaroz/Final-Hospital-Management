package com.finalhospital.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.DoctorFunctionsDao;
import com.finalhospital.example.dto.DoctorNurseFunctionsDTO;
import com.finalhospital.example.pojo.DoctorFunctions;
import com.finalhospital.example.pojo.NurseFunctions;

@Service
public class DoctorNurseFunctionsDTOService implements DoctorNurseFunctionsDTOImp 
{
	@Autowired
	private DoctorFunctionsDao dao;
	
	@Override
	public List<DoctorNurseFunctionsDTO> getAll()
	{
		return dao.findAll()
		.stream()
		.map(this:: mapperGetAll)
		.collect(Collectors.toList());
	
		
	}
	
	private DoctorNurseFunctionsDTO mapperGetAll(DoctorFunctions doctorfunctions)
	{
		DoctorNurseFunctionsDTO doctornurse =  new DoctorNurseFunctionsDTO();
				doctornurse.setDiagnoses(doctorfunctions.getDiagnoses());
				doctornurse.setPatient_complaints(doctorfunctions.getPatientComplaints());
				doctornurse.setTreatment(doctorfunctions.getTreatment());
				
				NurseFunctions nursefunctions = new NurseFunctions();
				doctornurse.setView_treatment(nursefunctions.getViewTreatment());
				doctornurse.setCheck_temperature(nursefunctions.getCheckTemperature());
				doctornurse.setCheck_weight(nursefunctions.getCheckWeight());
				
				return doctornurse;
				
	}
	@Override
	public void create(DoctorFunctions doctorfunctions)
	{
		dao.save(doctorfunctions);
		
	}

}

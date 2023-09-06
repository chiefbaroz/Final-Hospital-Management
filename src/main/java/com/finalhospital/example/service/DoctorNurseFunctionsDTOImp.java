package com.finalhospital.example.service;

import java.util.List;

import com.finalhospital.example.dto.DoctorNurseFunctionsDTO;
import com.finalhospital.example.pojo.DoctorFunctions;

public interface DoctorNurseFunctionsDTOImp 
{
	List<DoctorNurseFunctionsDTO> getAll();
	void create(DoctorFunctions doctorfunctions);

}

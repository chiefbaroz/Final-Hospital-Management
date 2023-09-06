package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.RecordsStaffFunctionsDao;
import com.finalhospital.example.pojo.RecordsStaffFunctions;

@Service
public class RecordsStaffFunctionsService implements RecordsStaffFunctionsImp
{
	@Autowired
	private RecordsStaffFunctionsDao dao;
	
	@Override
	public void recordsStaffFunctions(RecordsStaffFunctions recordsstafffunctions)
	{
		dao.save(recordsstafffunctions);
	}


}

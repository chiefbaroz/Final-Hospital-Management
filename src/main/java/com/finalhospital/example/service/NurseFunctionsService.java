package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.NurseFunctionsDao;
import com.finalhospital.example.pojo.NurseFunctions;

@Service
public class NurseFunctionsService implements NurseFunctionsImp
{
	@Autowired
	private NurseFunctionsDao dao;
	
	@Override
	public void nurseFunctions(NurseFunctions nursefunctions)
	{
		dao.save(nursefunctions);
	}


}

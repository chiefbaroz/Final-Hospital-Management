package com.finalhospital.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.StoreKeeperFunctionsDao;
import com.finalhospital.example.pojo.StoreKeeperFunctions;

@Service
public class StoreKeeperFunctionsService implements StoreKeeperFunctionsImp
{
	@Autowired
	private StoreKeeperFunctionsDao dao;
	
	//@RequestMapping(method = RequestMethod.POST, value = "/api/storekeeperfunction")
	public void storeKeeperFunctions(StoreKeeperFunctions storekeeperfunctions)
	{
		dao.save(storekeeperfunctions);		
		
	}

}

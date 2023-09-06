package com.finalhospital.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.finalhospital.example.dao.AccountCreationDao;
import com.finalhospital.example.pojo.AccountCreation;

@Service
public class AccountCreationService implements AccountCreationImp
{
	@Autowired
	private AccountCreationDao dao;
	
	@Override
	public AccountCreation createAccount(AccountCreation accountcreation)
	{
		AccountCreation acc = new AccountCreation();
		
		acc.setStaffId(accountcreation.getStaffId());
		acc.setRole(accountcreation.getRole());
	
		
		Example<AccountCreation> exam = Example.of(acc);
		
		Optional<AccountCreation> option = dao.findOne(exam);
		
		if(option.isEmpty())
		{	
			return dao.save(accountcreation);
		}
		return null;
	}
	
	@Override
	public AccountCreation findOneAccount(AccountCreation accountcreation)
	{
		AccountCreation creates = new AccountCreation();
		
		creates.setStaffId(accountcreation.getStaffId());
		
		Example<AccountCreation> example = Example.of(creates);
		
		Optional<AccountCreation> optional = dao.findOne(example);
		
		if(optional.isPresent())
		{
			return dao.save(creates);
		}
		 return null;
	}
	
	@Override
	public List<AccountCreation> findAllAccount()
	{
		return dao.findAll();	
	}
	
	@Override
	public AccountCreation updateAccount(Integer accountCreationId ,AccountCreation accountcreation)
	{
		return dao.findById(accountCreationId)
				.map(acct->{
					acct.setStaffId(accountcreation.getStaffId());
					acct.setRole(accountcreation.getRole());
					acct.setPassword(accountcreation.getPassword());
					
					return dao.save(acct);
				})
				.orElseGet(()->{
					accountcreation.setAccountCreationId(accountCreationId);
					return dao.save(accountcreation);
				});
	}
	
	@Override
	public boolean deleteAccount (Integer accountCreationId)
	{
		Optional<AccountCreation> i =	dao.findById(accountCreationId)
    		 .stream()
    		 .filter(x->x.getAccountCreationId() == accountCreationId).findAny();
		
		if(i.isPresent()) {
			dao.deleteById(accountCreationId);
			return true;
		}
		
		return false;
			
	}


}

package com.finalhospital.example.service;

import java.util.List;

import com.finalhospital.example.pojo.AccountCreation;

public interface AccountCreationImp 
{
	AccountCreation createAccount (AccountCreation accountcreation);
    AccountCreation findOneAccount(AccountCreation accountcreation);
	List<AccountCreation> findAllAccount();
	AccountCreation updateAccount(Integer accountCreationId,AccountCreation accountcreation);
	boolean deleteAccount (Integer accountCreationId);
	

}

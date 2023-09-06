package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.AccountantFunctions;

@Repository
public interface AccountantFunctionsDao extends JpaRepository<AccountantFunctions, Integer>
{

}

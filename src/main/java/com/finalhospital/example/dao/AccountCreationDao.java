package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.AccountCreation;

@Repository
public interface AccountCreationDao extends JpaRepository<AccountCreation,Integer>
{


}

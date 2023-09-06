package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.MatronFunctions;

@Repository
public interface MatronFunctionsDao extends JpaRepository<MatronFunctions,Integer>
{

}

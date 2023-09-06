package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.PharmacistFunctions;

@Repository
public interface PharmacistFunctionsDao extends JpaRepository<PharmacistFunctions,Integer>
{

}

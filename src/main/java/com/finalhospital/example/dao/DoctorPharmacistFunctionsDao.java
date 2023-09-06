package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.DoctorFunctions;

@Repository
public interface DoctorPharmacistFunctionsDao extends JpaRepository<DoctorFunctions,Integer>
{

}
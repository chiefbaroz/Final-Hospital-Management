package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.LabTechnicianFunctions;

@Repository
public interface LabTechnicianFunctionsDao extends JpaRepository<LabTechnicianFunctions, Integer>
{

}

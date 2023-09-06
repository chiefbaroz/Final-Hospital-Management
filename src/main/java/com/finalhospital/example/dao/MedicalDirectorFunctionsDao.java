package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.MedicalDirectorFunctions;

@Repository
public interface MedicalDirectorFunctionsDao extends JpaRepository<MedicalDirectorFunctions, Integer>
{

}

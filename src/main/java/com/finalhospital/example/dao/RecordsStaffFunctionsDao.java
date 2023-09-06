package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.RecordsStaffFunctions;

@Repository
public interface RecordsStaffFunctionsDao extends JpaRepository<RecordsStaffFunctions,Integer>
{

}

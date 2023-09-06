package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.NurseFunctions;

@Repository
public interface NurseFunctionsDao extends JpaRepository<NurseFunctions, Integer>
{

}

package com.finalhospital.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalhospital.example.pojo.StoreKeeperFunctions;

@Repository
public interface StoreKeeperFunctionsDao extends JpaRepository<StoreKeeperFunctions,Integer>{

}

package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicalStore 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer storeId;
	private String storeName;
	
	@ManyToMany
	@JoinTable(name = "medicalstore_storekeeperfunctions", joinColumns = @JoinColumn(name = "storeId"),inverseJoinColumns = @JoinColumn(name = "storeKeeperFunctionsId"))
	private List<StoreKeeperFunctions> storekeeperfunctions;

}

package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Accountant extends Staffs
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String accountantId;
	
	@ManyToMany(mappedBy = "accountant")
	private List<AccountCreation> accountcreation;
	
	@ManyToMany(mappedBy = "accountant")
	private List<AccountantFunctions> accountantfunctions;

}

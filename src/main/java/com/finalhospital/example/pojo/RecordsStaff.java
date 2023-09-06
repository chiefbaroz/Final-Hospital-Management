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
public class RecordsStaff extends Staffs
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String recordStaffId;
	
	@ManyToMany(mappedBy = "recordsstaff")
	private List<AccountCreation> accountcreation;

	
	

}

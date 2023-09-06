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
public class Records 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer recordId;
	private String recordName;
	
	@ManyToMany
	@JoinTable(name = "records_insurance", joinColumns = @JoinColumn(name = "recordId"),inverseJoinColumns = @JoinColumn(name = "insuranceId"))
	private List<Insurance> insurance;
	
	@ManyToMany
	@JoinTable(name = "records_recordstafffunctions", joinColumns = @JoinColumn(name = "recordId"),inverseJoinColumns = @JoinColumn(name = "recordStaffFunctionsId"))
	private List<RecordsStaffFunctions> recordsstafffunctions;
	
	@ManyToMany(mappedBy = "records")
	private List<OPD> opd;

}

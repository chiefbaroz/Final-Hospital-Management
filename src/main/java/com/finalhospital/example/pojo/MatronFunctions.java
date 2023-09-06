package com.finalhospital.example.pojo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MatronFunctions 
{
	@Id
	@GeneratedValue
	private Integer matronFunctionsId;
	
	//private String matronFunctionsId;
	private String assignStaffs;
	private LocalDateTime dateTime;

	
	@OneToMany(mappedBy = "matronfunctions")
	private List<Triagens> Triagens;
	
	@OneToMany(mappedBy = "matronfunctions")
	private List<Ward> ward;
	
	@OneToMany(mappedBy = "matronfunctions")
	private List<Emergency> emergency;

	@OneToOne(mappedBy = "matronfunctions")
	private Report report;
	

	
	
}

package com.finalhospital.example.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triagens 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer triagensId;
	private String triagensName;
		
	@ManyToOne
	@JoinColumn(name = "matronId")
	private MatronFunctions matronfunctions;

	@ManyToMany
	@JoinTable(name = "triagensNursefunctions", joinColumns = @JoinColumn(name = "triagensId"), inverseJoinColumns = @JoinColumn(name = "nurseFunctionsId"))
	private List<NurseFunctions> nursefunctions;

	@ManyToMany(mappedBy = "triagens")
	private List<OPD> opd;

}

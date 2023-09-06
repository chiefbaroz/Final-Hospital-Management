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
public class OPD 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer opdId;
	private String opdName;
	
	@ManyToMany
	@JoinTable(name = "opd_patient", joinColumns = @JoinColumn(name = "opdId"), inverseJoinColumns = @JoinColumn(name = "patientId"))
    private List<Patient> patient;
	
	@ManyToMany
	@JoinTable(name = "opd_triagens", joinColumns = @JoinColumn(name = "opdId"), inverseJoinColumns = @JoinColumn(name = "triagensId"))
    private List<Triagens> triagens;
	
	@ManyToMany
	@JoinTable(name = "opd_records", joinColumns = @JoinColumn(name = "opdId"), inverseJoinColumns = @JoinColumn(name = "recordId"))
    private List<Records> records;

}

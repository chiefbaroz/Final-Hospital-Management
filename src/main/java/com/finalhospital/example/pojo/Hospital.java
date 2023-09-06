package com.finalhospital.example.pojo;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hospital 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer hospitalId;
	private String hospitalName;
	
	@ElementCollection
	@CollectionTable(name = "contacts")
	private Set<String>  contact;
	
	@ElementCollection
	@CollectionTable(name = "emails")
	private Set<String> email;
	
	@Embedded
	private Address address;
	
	@OneToMany
	@JoinTable(name = "hospital_consultingroom", joinColumns = @JoinColumn(name = "hospitalId"),inverseJoinColumns = @JoinColumn(name = "consultingId"))
	private List<ConsultingRoom> consultingroom;
	
	@OneToMany
	@JoinTable(name = "hospital_emergency", joinColumns = @JoinColumn(name = "hospitalId"),inverseJoinColumns = @JoinColumn(name = "emergencyId"))
	private List<Emergency> emergency;
	
	@OneToMany
	@JoinTable(name = "hospital_patient", joinColumns = @JoinColumn(name = "hospitalId"),inverseJoinColumns = @JoinColumn(name = "patientId"))
	private List<Patient> patient;
	
	@OneToMany
	@JoinTable(name = "hospital_opd", joinColumns = @JoinColumn(name = "hospitalId"),inverseJoinColumns = @JoinColumn(name = "opdId"))
	private List<OPD> opd;
	
	




}

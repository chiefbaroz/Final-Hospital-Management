package com.finalhospital.example.pojo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient extends Staffs
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String patientId;
	private LocalDate dob;
	private String nextOfKingFirstName;
	private String nextOfKingLastName;
	
	@Transient
	private int age;
	
	@ElementCollection
	@CollectionTable(name = "emails")
	private Set<String> email;
	
	@ElementCollection
	@CollectionTable(name = "contact")
	private Set<String>  next_of_king_contact;
	
	@ManyToMany(mappedBy = "patient")
	private List<ConsultingRoom> consultingroom;
	
	@ManyToMany(mappedBy = "patient")
	private List<Emergency> emergency;	
	
	@ManyToMany(mappedBy = "patient")
	private List<Ward> ward;
	
	@ManyToMany(mappedBy = "patient")
	private List<OPD> opd;
	
	@ManyToMany
	@JoinTable(name = "patien_records", joinColumns = @JoinColumn(name = "patientId"),inverseJoinColumns = @JoinColumn(name = "insuranceId"))
	private List<Insurance> insurance;
	
	@ManyToMany(mappedBy = "patient")
	private List<Lab> lab;
	
	@ManyToMany(mappedBy = "patient")
	private List<Pharmacy> pharmacy;
	
	@ManyToMany(mappedBy = "patient")
	private List<AccountsOffice> accountsoffice;

}

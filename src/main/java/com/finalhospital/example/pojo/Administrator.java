package com.finalhospital.example.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Administrator extends Administration
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String administratorId;
}

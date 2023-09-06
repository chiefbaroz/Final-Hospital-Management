package com.finalhospital.example.pojo;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address 
{
	private int house_number;
	private String street_address;
	private String location;
	private String city;

}

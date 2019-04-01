package com.taco.cloud.entity;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {

	@NotBlank(message="Name is required")
	private String name;
	
	@NotBlank(message="Street is required")
	private String street;
	
	@NotBlank(message="City is required")
	private String city;
	
	@NotBlank(message="State is required")
	private String state;
	
	@NotBlank(message="Zip code is required")
	private String zip;
	
	@CreditCardNumber(message="Not a valid credit card number")
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;

}

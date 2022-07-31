package com.project.Fineros.dto;

import java.io.Serializable;


import com.project.Fineros.model.Customer;

public final class CustomerViewDTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	private final Long customerNumber;
	
	private final String firstName;
	
	private final String lastName;
	
	private CustomerViewDTO(Long customerNumber, String firstName, String lastName) {
		this.customerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	public static CustomerViewDTO view(Customer customer) {
		return new CustomerViewDTO(customer.getCustomerNumber(), customer.getFirstName(), customer.getLastName());
	}
	
	
	

}

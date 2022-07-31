package com.project.Fineros.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.project.Fineros.Repository.CustomerRepository;



public class UniqueEmailValid implements ConstraintValidator<UniqueEmail, String>{
	
	private final CustomerRepository customerRepository;
	
	public UniqueEmailValid(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		
		return !customerRepository.existsCustomerByEmail(email) ;
	}

}

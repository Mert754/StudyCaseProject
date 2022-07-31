package com.project.Fineros.controller;


import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Fineros.Service.CustomerService;
import com.project.Fineros.dto.CustomerCreateDTO;
import com.project.Fineros.dto.PaymentCreateDTO;
import com.project.Fineros.dto.PaymentViewDTO;
import com.project.Fineros.model.Payment;
import com.project.Fineros.shared.GenericResponse;

@RestController  
@RequestMapping("/controller")
public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	// Register new Customer
	@PostMapping("v1/customer")
	public ResponseEntity<?> createNewCustomer(@Valid @RequestBody CustomerCreateDTO customerCreateDTO){
		
		customerService.createNewCustomer(customerCreateDTO);
		return ResponseEntity.ok(new GenericResponse("User Created"));
	}
	
	// Making a payment
	@PostMapping("v1/payment")
	public ResponseEntity<?> makeNewPayment(@RequestBody PaymentCreateDTO paymentCreateDTO){
		customerService.makeNewPayment(paymentCreateDTO);
		 
		return ResponseEntity.ok(new GenericResponse("Payment made"));
	}
	
	
	//Listing All payments of a customer using the credit card number that the customer has(credit card is unique for customers)
	@GetMapping("v1/payments/{cardNumber}")
	public  ResponseEntity<List<Payment>> getPaymentsByCardNumber(@PathVariable(name="cardNumber") String cardNumber ){
		final List<Payment> payments = customerService.getPaymentsByCardNumber(cardNumber);
		return ResponseEntity.ok(payments);
	}
	
	//Getting the payments between the start date and end date 
	@GetMapping("v1/payments")
	public ResponseEntity<List<Payment>> getPaymentsByDate(@RequestParam("startDate") Date startDate,@RequestParam("endDate") Date endDate){
		final List<Payment> payments = customerService.getPaymentsByDate(startDate, endDate);
		return ResponseEntity.ok(payments);
	}

}

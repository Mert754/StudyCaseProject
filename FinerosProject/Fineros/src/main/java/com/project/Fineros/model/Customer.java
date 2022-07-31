package com.project.Fineros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customers") // Create table and gave a name, Customers,.
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerNumber;
	
	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = 50)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "card_number", nullable = false, length = 16)
	private String cardNumber;
	
	@Column(name="expire_date", nullable = false, length = 5)
	private String expDate;
	
	@Column(name= "password", nullable = false, length = 3)
	private String cardPassword;
	
	public Customer() { }
	
	public Customer( String firstName, String lastName, String email, String cardNumber,String expDate, String cardPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cardPassword = cardPassword;
	}
	
	public Long getCustomerNumber() {
		return customerNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public String getExpDate() {
		return expDate;
	}
	
	public String getCardPassword() {
		return cardPassword;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	
	
	
	

	

	
	
	
	
	
		
	
}

package com.project.Fineros.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.project.Fineros.Validation.UniqueCardNumber;
import com.project.Fineros.Validation.UniqueEmail;

public class CustomerCreateDTO {
	
	@NotNull(message = "{fineros.constraints.firstname.NotNull.message}")
	@Size(min=2, max=17, message = "{fineros.constraints.firstname.Size.message}")
	private String firstName;
	
	@NotNull(message = "{fineros.constraints.lastname.NotNull.message}")
	@Size(min=2, max=17, message= "{fineros.constraints.lastname.Size.message}")
	private String lastName;
	
	@NotNull(message = "{fineros.constraints.email.NotNull.message}")
	@Size(min=12, max=50, message= "{fineros.constraints.email.Size.message}")
	@UniqueEmail
	private String email;
	
	@NotNull(message = "{fineros.constraints.cardnumber.NotNull.message}")
	@Size(min=16, max=16, message= "{fineros.constraints.cardnumber.Size.message}")
	@UniqueCardNumber
	private String cardNumber;
	
	@NotNull(message = "{fineros.constraints.expdate.NotNull.message}")
	@Size(min=5, max=5, message= "{fineros.constraints.expdate.Size.message}")
	private String expDate;
	
	@NotNull(message = "{fineros.constraints.cardpassword.NotNull.message}")
	@Size(min=3, max=3, message= "{fineros.constraints.cardpassword.Size.message}")
	private String cardPassword;
	
	public CustomerCreateDTO() { }
	
	public CustomerCreateDTO(String firstName, String lastName, String email, String cardNumber,String expDate, String cardPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cardPassword = cardPassword;
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

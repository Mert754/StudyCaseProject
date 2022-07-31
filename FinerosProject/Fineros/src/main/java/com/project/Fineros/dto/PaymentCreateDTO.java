package com.project.Fineros.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.project.Fineros.Validation.UniqueCardNumber;

public class PaymentCreateDTO {

	@NotNull(message = "{fineros.constraints.cardnumber.NotNull.message}")
	@Size(min=16, max=16, message= "{Fineros.constraints.cardnumber.Size.message}")
	@UniqueCardNumber
	private String cardNumber;
	
	@NotNull(message = "{fineros.constraints.amount.NotNull.message}")
	@Size(min=1, max=10000, message= "{Fineros.constraints.amount.Size.message}")
	private Long amount;
	
	public PaymentCreateDTO() { }
	
	public PaymentCreateDTO(String cardNumber, Long amount) {
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public Long getAmount() {
		return amount;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setAmount(Long amount) {
		this.amount = amount;
	}
}

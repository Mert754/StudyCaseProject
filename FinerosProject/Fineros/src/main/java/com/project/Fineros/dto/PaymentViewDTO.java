package com.project.Fineros.dto;

import java.io.Serializable;


import com.project.Fineros.model.Payment;

public final class PaymentViewDTO implements Serializable {
	
	//private final Long orderId;
	private final String cardNumber;
	
	private final Long amount;
	
	private PaymentViewDTO(String cardNumber, Long amount) {
	//	this.orderId = orderId;
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	
	public static PaymentViewDTO view(Payment payment){
		return new PaymentViewDTO(payment.getCardNumber(), payment.getAmount());
				
	}
}

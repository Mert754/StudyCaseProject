package com.project.Fineros.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="Payments") // Create table and gave a name, Payments,.
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@Column(name = "card_number", nullable = false, length = 16)
	private String cardNumber;
	
	@Column(name = "amount", nullable = false, length = 5)
	private Long amount;

	@CreationTimestamp
	private LocalDateTime dataCreated;
	
	
	public Payment() { }
	
	public Payment(String cardNumber, Long amount) {

		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	
	public Long getOrderId() {
		return orderId;
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

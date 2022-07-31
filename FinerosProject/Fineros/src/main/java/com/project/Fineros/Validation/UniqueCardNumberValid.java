package com.project.Fineros.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.project.Fineros.Repository.PaymentRepository;

public class UniqueCardNumberValid implements ConstraintValidator<UniqueCardNumber, String> {

		private final PaymentRepository paymentRepository;
		
		public UniqueCardNumberValid(PaymentRepository paymentRepository) {
			this.paymentRepository = paymentRepository;
		}
	@Override
	public boolean isValid(String cardNumber, ConstraintValidatorContext context) {
		
		return !paymentRepository.existsPaymentByCardNumber(cardNumber);
	}

}

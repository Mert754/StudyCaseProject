package com.project.Fineros.Service;


import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.Fineros.Repository.CustomerRepository;
import com.project.Fineros.Repository.PaymentRepository;
import com.project.Fineros.dto.CustomerCreateDTO;
import com.project.Fineros.dto.CustomerViewDTO;
import com.project.Fineros.dto.PaymentCreateDTO;
import com.project.Fineros.dto.PaymentViewDTO;
import com.project.Fineros.model.Customer;
import com.project.Fineros.model.Payment;

@Service
public class CustomerServiceImplement implements CustomerService {
	
	private final CustomerRepository customerRepository;
	private final PaymentRepository paymentRepository;
	
	
	public CustomerServiceImplement(CustomerRepository customerRepository, PaymentRepository paymentRepository) {
		this.customerRepository = customerRepository;
		this.paymentRepository = paymentRepository;
		
	}

	@Override
	@Transactional
	public CustomerViewDTO createNewCustomer(CustomerCreateDTO customerCreateDTO) {
		
		final Customer customer = customerRepository.save(new Customer(customerCreateDTO.getFirstName(), 
				customerCreateDTO.getLastName(), customerCreateDTO.getEmail(), customerCreateDTO.getCardNumber(), customerCreateDTO.getExpDate(), customerCreateDTO.getCardPassword()));
		return CustomerViewDTO.view(customer);
	}

	@Override
	@Transactional
	public PaymentViewDTO makeNewPayment(PaymentCreateDTO paymentCreateDTO) {
		final Payment payment = paymentRepository.save(new Payment(paymentCreateDTO.getCardNumber(), paymentCreateDTO.getAmount()));
		return PaymentViewDTO.view(payment);
	}

	
	@Override
	public List<Payment> getPaymentsByCardNumber(String cardNumber) {
		final List<Payment> payments = paymentRepository. findByCardNumber(cardNumber);
		return payments;
		
	}

	@Override
	public List<Payment> getPaymentsByDate(Date startDate, Date endDate) {
		final List<Payment> payments = paymentRepository.findByDataCreatedBetween(startDate, endDate);
		return payments;
	}

	
}
	
	
	
	


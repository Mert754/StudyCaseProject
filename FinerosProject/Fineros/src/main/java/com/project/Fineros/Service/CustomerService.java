package com.project.Fineros.Service;




import java.sql.Date;
import java.util.List;

import com.project.Fineros.dto.CustomerCreateDTO;
import com.project.Fineros.dto.CustomerViewDTO;
import com.project.Fineros.dto.PaymentCreateDTO;
import com.project.Fineros.dto.PaymentViewDTO;
import com.project.Fineros.model.Payment;

public interface CustomerService {

	CustomerViewDTO createNewCustomer( CustomerCreateDTO customerCreateDTO);

	PaymentViewDTO makeNewPayment(PaymentCreateDTO paymentCreateDTO);

	List<Payment> getPaymentsByCardNumber(String cardNumber);

	List<Payment> getPaymentsByDate(Date startDate, Date endDate);

	

}

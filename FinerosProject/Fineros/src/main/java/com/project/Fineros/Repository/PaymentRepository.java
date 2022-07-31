package com.project.Fineros.Repository;




import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Fineros.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	List<Payment> findByCardNumber(String cardNumber);
	
	List<Payment> findByDataCreatedBetween(Date startDate, Date endDate);

	boolean existsPaymentByCardNumber(String cardNumber);
	
}

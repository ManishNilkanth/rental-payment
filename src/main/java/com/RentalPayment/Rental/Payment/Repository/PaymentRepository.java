package com.RentalPayment.Rental.Payment.Repository;

import com.RentalPayment.Rental.Payment.Modules.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,String> {


}

package com.RentalPayment.Rental.Payment.Repository;

import com.RentalPayment.Rental.Payment.Modules.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders,String> {

}

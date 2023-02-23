package com.RentalPayment.Rental.Payment.Repository;

import com.RentalPayment.Rental.Payment.Modules.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}

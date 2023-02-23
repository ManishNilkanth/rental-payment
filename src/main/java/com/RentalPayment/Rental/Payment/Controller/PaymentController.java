package com.RentalPayment.Rental.Payment.Controller;

import com.RentalPayment.Rental.Payment.Modules.Payment;
import com.RentalPayment.Rental.Payment.Payload.PaymentDTO;
import com.RentalPayment.Rental.Payment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/")
    public ResponseEntity<Payment> getPaymentSummary(@RequestBody PaymentDTO payment)
    {
       return ResponseEntity.ok(paymentService.getSummary(payment));
    }

}

package com.RentalPayment.Rental.Payment.Service;

import com.RentalPayment.Rental.Payment.Modules.Payment;
import com.RentalPayment.Rental.Payment.Payload.PaymentDTO;

public interface PaymentService {

    public Payment getSummary(PaymentDTO payment);

}

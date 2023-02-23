package com.RentalPayment.Rental.Payment.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PaymentDTO {

    private String type;

    private String userId;

    private String orderId;
}

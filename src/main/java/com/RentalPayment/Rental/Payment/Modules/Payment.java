package com.RentalPayment.Rental.Payment.Modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {


    @Id
    private String paymentId;

    private Long totalPayment;

    private boolean paymentStatus;

    private String paymentType;

    private Date localDate;


}

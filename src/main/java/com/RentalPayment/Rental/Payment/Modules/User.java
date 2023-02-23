package com.RentalPayment.Rental.Payment.Modules;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    private String name;

    private String phoneNumber;

    private String address;

    private String email;

}

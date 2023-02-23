package com.RentalPayment.Rental.Payment.Modules;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    private String orderId;

    private String productName;

    private Long price;

    private Date addedDate;


}

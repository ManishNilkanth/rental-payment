package com.RentalPayment.Rental.Payment.Payload;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @Email(message = "Invalid Email format please check format")
    @Size(message = "The email field should not empty")
    private String email;

    @NotNull
    @NotBlank(message = "Please enter your name")
    private String name;

    @NotNull
    @NotBlank(message = "Please enter your phone number")
//    I have taken max 17 digit validation because it also includes international mobile Validation.
//    @Size(min = 10, max = 17, message = "Number should have at least 10 or less than 17 digits")
    private String phoneNumber;

    @Size(min = 3,max = 200,message = "The address field should not empty")
    private String address;
}

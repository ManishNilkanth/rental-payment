package com.RentalPayment.Rental.Payment.ExceptionHandling;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

    String ResourceName;
    String fieldName;
    String fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {

        super(String.format("%s is not found with %s : %s",resourceName ,fieldName ,fieldValue));
        ResourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}

package com.RentalPayment.Rental.Payment.Service;

import com.RentalPayment.Rental.Payment.Modules.Orders;
import com.RentalPayment.Rental.Payment.Payload.OrderDto;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

public interface OrderService {

    public Orders getOrderById(String orderId);

    public Orders addProduct(OrderDto orderDto);
}

package com.RentalPayment.Rental.Payment.Service.ServiceImpl;

import com.RentalPayment.Rental.Payment.ExceptionHandling.ResourceNotFoundException;
import com.RentalPayment.Rental.Payment.Modules.Orders;
import com.RentalPayment.Rental.Payment.Modules.Payment;
import com.RentalPayment.Rental.Payment.Modules.User;
import com.RentalPayment.Rental.Payment.Payload.PaymentDTO;
import com.RentalPayment.Rental.Payment.Repository.OrderRepository;
import com.RentalPayment.Rental.Payment.Repository.PaymentRepository;
import com.RentalPayment.Rental.Payment.Repository.UserRepository;
import com.RentalPayment.Rental.Payment.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public Payment getSummary(PaymentDTO payment) {

        String payId = UUID.randomUUID().toString();
        User user = this.userRepository.findById(payment.getUserId())
                .orElseThrow(()->new ResourceNotFoundException("user","userId",payment.getUserId()));

        Orders orders = this.orderRepository.findById(payment.getOrderId())
                .orElseThrow(()->new ResourceNotFoundException("Product","productId",payment.getOrderId()));

        Payment payments = new Payment(payId, orders.getPrice(), true, "Cod", new Date());

        payments = paymentRepository.save(payments);

        return payments;
    }
}

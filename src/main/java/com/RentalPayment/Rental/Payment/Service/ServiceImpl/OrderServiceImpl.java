package com.RentalPayment.Rental.Payment.Service.ServiceImpl;

import com.RentalPayment.Rental.Payment.ExceptionHandling.ResourceNotFoundException;
import com.RentalPayment.Rental.Payment.Modules.Orders;
import com.RentalPayment.Rental.Payment.Payload.OrderDto;
import com.RentalPayment.Rental.Payment.Repository.OrderRepository;
import com.RentalPayment.Rental.Payment.Service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Orders getOrderById(String orderId) {

       Orders order = orderRepository.findById(orderId)
               .orElseThrow(()->new ResourceNotFoundException("Product" ,"orderId",orderId));
       order.setAddedDate(new Date());
        return order;
    }

    @Override
    public Orders addProduct(OrderDto orderDto) {
        String randomOrderId = UUID.randomUUID().toString();
        Orders product = modelMapper.map(orderDto,Orders.class);
        product.setAddedDate(new Date());
        product.setOrderId(randomOrderId);
        Orders saveProduct = orderRepository.save(product);
        return saveProduct;
    }
}

package com.RentalPayment.Rental.Payment.Controller;

import com.RentalPayment.Rental.Payment.Modules.Orders;
import com.RentalPayment.Rental.Payment.Payload.OrderDto;
import com.RentalPayment.Rental.Payment.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{orderId}")
    public ResponseEntity<Orders> getOrderById(@PathVariable String orderId)
    {
        Orders order = orderService.getOrderById(orderId);
        return ResponseEntity.ok(order);
    }

    @PostMapping("/")
    public ResponseEntity<Orders> saveProduct(@RequestBody OrderDto orderDto)
    {
        return new ResponseEntity<>(orderService.addProduct(orderDto), HttpStatus.CREATED);
    }
}

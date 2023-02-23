package com.RentalPayment.Rental.Payment.Controller;

import com.RentalPayment.Rental.Payment.Payload.UserDto;
import com.RentalPayment.Rental.Payment.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
    {
        UserDto createUserDto = userService.createUser(userDto);

        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }
}

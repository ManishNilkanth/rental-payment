package com.RentalPayment.Rental.Payment.Service.ServiceImpl;

import com.RentalPayment.Rental.Payment.Modules.User;
import com.RentalPayment.Rental.Payment.Payload.UserDto;
import com.RentalPayment.Rental.Payment.Repository.UserRepository;
import com.RentalPayment.Rental.Payment.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        User saveUser = userRepository.save(user);

        return modelMapper.map(saveUser,UserDto.class);
    }
}

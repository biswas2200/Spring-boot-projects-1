package com.requestValidation.ExceptionHandling.service;


import com.requestValidation.ExceptionHandling.dao.UserRepository;
import com.requestValidation.ExceptionHandling.dto.UserRequest;
import com.requestValidation.ExceptionHandling.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    public User saveUser(UserRequest userRequest){
//        User user = User.build()
//    }
}

package com.dataTransferOperation.controller;

import com.dataTransferOperation.dto.UserLocationDTO;
import com.dataTransferOperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user-location")
    public List<UserLocationDTO> getAllUserLocation(){
        return userService.getAllUserLocation();
    }
}

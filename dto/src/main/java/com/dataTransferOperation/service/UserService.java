package com.dataTransferOperation.service;

import com.dataTransferOperation.dto.UserLocationDTO;
import com.dataTransferOperation.model.User;
import com.dataTransferOperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUserLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityTodto)
                .collect(Collectors.toList());
    }
    private UserLocationDTO convertEntityTodto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getUserId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }

}

package com.example.travel_event_portal.service;

import com.example.travel_event_portal.dto.UserDTO;
import com.example.travel_event_portal.model.Users;
import com.example.travel_event_portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) {
        Users user = new Users();
        user.setMobileNumber(userDTO.getMobileNumber());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setFullName(userDTO.getFullName());
        user = userRepository.save(user);
        userDTO.setUserId(user.getUser_id());
        return userDTO;
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(user -> {
            UserDTO dto = new UserDTO();
            dto.setUserId(user.getUser_id());
            dto.setMobileNumber(user.getMobileNumber());
            dto.setEmail(user.getEmail());
            dto.setPassword(user.getPassword());
            user.setFullName(user.getFullName());
            return dto;
        }).collect(Collectors.toList());
    }
}

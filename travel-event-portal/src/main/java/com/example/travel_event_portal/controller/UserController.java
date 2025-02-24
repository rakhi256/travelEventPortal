package com.example.travel_event_portal.controller;

import com.example.travel_event_portal.dto.UserDTO;
import com.example.travel_event_portal.model.Users;
import com.example.travel_event_portal.repository.UserRepository;
import com.example.travel_event_portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
}

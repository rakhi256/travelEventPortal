package com.example.travel_event_portal.controller;

import com.example.travel_event_portal.model.Users;
import com.example.travel_event_portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Users createUser(@RequestBody Users users) {
        return userRepository.save(users);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}

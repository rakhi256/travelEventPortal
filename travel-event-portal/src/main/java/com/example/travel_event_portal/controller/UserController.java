package com.example.travel_event_portal.controller;

import com.example.travel_event_portal.request.UserRecord;
import com.example.travel_event_portal.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserRecord createUser(@RequestBody UserRecord userRecord) {
        return userService.createUser(userRecord);
    }
    @GetMapping
    public ResponseEntity<List<UserRecord>> getAllUsers() {
        List<UserRecord> users = userService.getAllUsers();
        return users.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(users);
    }
}

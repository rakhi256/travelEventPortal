package com.example.travel_event_portal.service;

import com.example.travel_event_portal.request.UserRecord;
import com.example.travel_event_portal.model.Users;
import com.example.travel_event_portal.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRecord createUser(UserRecord userRecord) {
        Users user = new Users();
        user.setMobileNumber(userRecord.mobileNumber());
        user.setEmail(userRecord.email());
        user.setPassword(userRecord.password());
        user.setFullName(userRecord.fullName());

        user = userRepository.save(user);
        return new UserRecord(user.getUser_id(), user.getMobileNumber(), user.getEmail(), user.getPassword(), user.getFullName());
    }

    public List<UserRecord> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::mapToUserDTO)
                .toList();
    }

    private UserRecord mapToUserDTO(Users user) {
        return new UserRecord(user.getUser_id(), user.getMobileNumber(), user.getEmail(), user.getPassword(), user.getFullName());
    }
}
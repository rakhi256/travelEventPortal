package com.example.travel_event_portal.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String mobileNumber;
    private String email;
    private String password;
    private String fullName;
}

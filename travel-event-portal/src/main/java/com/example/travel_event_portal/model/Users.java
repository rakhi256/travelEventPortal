package com.example.travel_event_portal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  user_id;

    @Column(unique = true, nullable = false)
    private String mobileNumber;

    private String email;
    private String password;
    private String fullName;
}

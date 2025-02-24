package com.example.travel_event_portal.repository;

import com.example.travel_event_portal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}

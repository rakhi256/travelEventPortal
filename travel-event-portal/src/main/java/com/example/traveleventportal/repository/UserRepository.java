package com.example.traveleventportal.repository;

import com.example.traveleventportal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}

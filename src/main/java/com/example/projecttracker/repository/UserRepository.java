package com.example.projecttracker.repository;

import com.example.projecttracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);
}
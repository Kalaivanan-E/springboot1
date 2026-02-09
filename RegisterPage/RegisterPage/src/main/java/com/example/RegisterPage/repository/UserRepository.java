package com.example.RegisterPage.repository;

import com.example.RegisterPage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

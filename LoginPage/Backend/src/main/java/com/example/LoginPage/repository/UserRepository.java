package com.example.LoginPage.repository;

import com.example.LoginPage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.example.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}

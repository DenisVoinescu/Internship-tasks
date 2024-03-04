package com.example.task2.service;


import org.springframework.stereotype.Service;

import com.example.task2.entity.User;
import com.example.task2.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
     private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);   
     }

    @Override
    public int findNumberOfUsers() {
        return userRepository.findAll().size();
    }

}

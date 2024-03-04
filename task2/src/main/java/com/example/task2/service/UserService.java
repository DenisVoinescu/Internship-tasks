package com.example.task2.service;


import com.example.task2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    int findNumberOfUsers();
}

package com.example.demo.service;

import com.example.demo.model.User;

public interface IUserService {
    User findByUsername(String username);
}

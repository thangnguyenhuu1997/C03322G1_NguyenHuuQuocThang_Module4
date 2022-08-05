package com.example.demo.service.employee;

import com.example.demo.model.employee.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findByUsername(String username);
}

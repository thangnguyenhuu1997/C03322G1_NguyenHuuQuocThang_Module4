package com.example.demo.service.employee;

import com.example.demo.model.employee.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();

    void save(User user);

    Optional<User> findById(Integer id);
}

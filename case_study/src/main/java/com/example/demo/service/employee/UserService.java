package com.example.demo.service.employee;

import com.example.demo.model.employee.User;
import com.example.demo.repository.employee.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return iUserRepository.findByUsername(username);
    }
}

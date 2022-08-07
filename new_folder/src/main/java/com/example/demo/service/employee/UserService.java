package com.example.demo.service.employee;

import com.example.demo.model.employee.User;
import com.example.demo.repository.employee.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }
}

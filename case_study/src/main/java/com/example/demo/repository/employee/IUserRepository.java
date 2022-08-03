package com.example.demo.repository.employee;

import com.example.demo.model.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, String> {

}

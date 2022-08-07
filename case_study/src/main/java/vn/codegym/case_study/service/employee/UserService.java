package vn.codegym.case_study.service.employee;

import vn.codegym.case_study.model.employee.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByUsername(String username);
}

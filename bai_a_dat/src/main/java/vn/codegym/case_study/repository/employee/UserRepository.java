package vn.codegym.case_study.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.employee.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}

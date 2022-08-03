package com.example.demo.repository.employee;

import com.example.demo.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IEducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}
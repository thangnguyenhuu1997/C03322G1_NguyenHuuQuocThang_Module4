package com.example.demo.service.employee;

import com.example.demo.model.employee.EducationDegree;

import java.util.List;
import java.util.Optional;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();

    void save(EducationDegree educationDegree);

    Optional<EducationDegree> findById(Integer id);
}

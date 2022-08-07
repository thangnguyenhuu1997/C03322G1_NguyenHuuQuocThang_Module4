package com.example.demo.service.employee;

import com.example.demo.model.employee.Position;

import java.util.List;
import java.util.Optional;

public interface IPositionService {
    List<Position> findAll();

    void save(Position position);

    Optional<Position> findById(Integer id);
}

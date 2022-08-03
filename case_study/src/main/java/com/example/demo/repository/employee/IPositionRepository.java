package com.example.demo.repository.employee;

import com.example.demo.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IPositionRepository extends JpaRepository<Position, Integer> {
}
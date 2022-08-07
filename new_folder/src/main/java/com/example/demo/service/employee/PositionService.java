package com.example.demo.service.employee;

import com.example.demo.model.employee.Position;
import com.example.demo.repository.employee.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService implements IPositionService{
    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public Optional<Position> findById(Integer id) {
        return Optional.empty();
    }
}

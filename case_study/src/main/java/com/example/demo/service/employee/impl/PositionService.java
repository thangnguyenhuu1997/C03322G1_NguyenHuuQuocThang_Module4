package com.example.demo.service.employee.impl;

import com.example.demo.model.employee.Position;
import com.example.demo.repository.employee.IPositionRepository;
import com.example.demo.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}

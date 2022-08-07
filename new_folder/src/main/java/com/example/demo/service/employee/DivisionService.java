package com.example.demo.service.employee;

import com.example.demo.model.employee.Division;
import com.example.demo.repository.employee.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisionService implements IDivisionService{
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public Optional<Division> findById(Integer id) {
        return Optional.empty();
    }
}

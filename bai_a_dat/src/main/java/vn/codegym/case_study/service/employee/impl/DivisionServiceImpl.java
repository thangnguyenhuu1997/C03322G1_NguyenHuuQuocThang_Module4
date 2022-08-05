package vn.codegym.case_study.service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.employee.Division;
import vn.codegym.case_study.repository.employee.DivisionRepository;
import vn.codegym.case_study.service.employee.DivisionService;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}

package vn.codegym.case_study.service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.employee.EducationDegree;
import vn.codegym.case_study.repository.employee.EducationDegreeRepository;
import vn.codegym.case_study.service.employee.EducationDegreeService;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}

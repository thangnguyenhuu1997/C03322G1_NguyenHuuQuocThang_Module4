package vn.codegym.case_study.service.facility.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.facility.RentType;
import vn.codegym.case_study.repository.facility.RentTypeRepository;
import vn.codegym.case_study.service.facility.RentTypeService;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}

package vn.codegym.case_study.service.customer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.customer.CustomerType;
import vn.codegym.case_study.repository.customer.CustomerTypeRepository;
import vn.codegym.case_study.service.customer.CustomerTypeService;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}

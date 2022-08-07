package com.example.demo.service.customer;

import com.example.demo.model.customer.CustomerType;
import com.example.demo.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> getAllCustomerType() {
        return iCustomerTypeRepository.findAll();
    }
}
package vn.codegym.case_study.service.customer;

import vn.codegym.case_study.model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
}

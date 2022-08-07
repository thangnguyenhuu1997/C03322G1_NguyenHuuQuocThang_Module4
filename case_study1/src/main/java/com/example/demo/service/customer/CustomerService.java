package com.example.demo.service.customer;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;


    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return iCustomerRepository.findAllCustomer(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer.getCustomerType().getCustomerTypeId(), customer.getCustomerName(), customer.getCustomerBirthday(), customer.getCustomerGender(), customer.getCustomerIdCard(), customer.getCustomerPhone(), customer.getCustomerEmail(), customer.getCustomerAddress());
    }

    @Override
    public Customer findByIdCustomer(Integer id) {
        return iCustomerRepository.findByIdCustomer(id);
    }

    @Override
    public void update(Customer customer) {
        iCustomerRepository.update(customer.getCustomerType().getCustomerTypeId(),
                customer.getCustomerName(),
                customer.getCustomerBirthday(),
                customer.getCustomerGender(),
                customer.getCustomerIdCard(),
                customer.getCustomerPhone(),
                customer.getCustomerEmail(),
                customer.getCustomerAddress(),
                customer.getCustomerId());
    }

    @Override
    public void delete(Integer id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public Page<Customer> findAllCustomerByName(Pageable pageable, Customer customer) {
        return iCustomerRepository.findAllCustomerByName(pageable, "%" + customer.getCustomerName() + "%");
    }


}
package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductService iProductService;
    @Override
    public List<Product> findAll() {
        return iProductService.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductService.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductService.save(product);
    }
}

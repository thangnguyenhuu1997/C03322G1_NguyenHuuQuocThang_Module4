package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAllProduct(Pageable pageable) {
        return iProductRepository.findAllProduct(pageable);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product.getName(), product.getPrice(), product.getCountry());
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findByIdProduct(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product.getName(), product.getPrice(), product.getCountry(),product.getId());
    }

    @Override
    public void remove(Product product) {
        iProductRepository.delete(product.getId());
    }

    @Override
    public Page<Product> findAllProductByName(Pageable pageable, Product product) {
        return iProductRepository.findAllProductByName(pageable, product.getName());
    }


}
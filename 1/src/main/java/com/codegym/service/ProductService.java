package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<Product> selectAllProduct() {
        return iProductRepository.selectAllProduct();
    }

    @Override
    public Product selectProduct(int id) {
        return iProductRepository.selectProduct(id);
    }

    @Override
    public void insertProduct(Product product) {
        iProductRepository.insertProduct(product);
    }

    @Override
    public void update(int id, Product product) {
        iProductRepository.update(id,product);
    }

    @Override
    public void remove(int id) {
        iProductRepository.remove(id);
    }
}

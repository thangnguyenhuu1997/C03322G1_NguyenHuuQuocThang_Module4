package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct();

    Product selectProduct(int id);

    void insertProduct(Product product);

    void update(int id, Product product);

    void remove(int id);

    List<Product> searchProduct(String keyword);
}

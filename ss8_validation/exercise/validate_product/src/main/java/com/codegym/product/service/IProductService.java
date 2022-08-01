package com.codegym.product.service;

import com.codegym.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAllProduct(Pageable pageable);

    void save(Product product);

    Product findById(Integer id);

    void update(Product product);

    void remove(Product product);

    Page<Product> findAllProductByName(Pageable pageable, Product product);
}

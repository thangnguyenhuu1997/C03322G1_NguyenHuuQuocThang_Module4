package com.example.demo.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.demo.model.Product;

public interface IProductService {
    Page<Product> findAllProduct(Pageable pageable);

    void save(Product product);

    Product findById(Integer id);

    void update(Product product);

    void remove(Product product);

    Page<Product> findAllProductByName(Pageable pageable, Product product);
}

package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "But", 3000, "VN"));
        products.put(2, new Product(2, "Banh", 2000, "VN"));
        products.put(3, new Product(3, "Keo", 1000, "VN"));
    }
    @Override
    public List<Product> selectAllProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product selectProduct(int id) {
        return products.get(id);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchProduct(String keyword) {
        List <Product> productList = new ArrayList<>();
        for (Product product: products.values()) {
            if (product.getName().contains(keyword)){
                productList.add(product);
            }
        }
        return productList;
    }
}

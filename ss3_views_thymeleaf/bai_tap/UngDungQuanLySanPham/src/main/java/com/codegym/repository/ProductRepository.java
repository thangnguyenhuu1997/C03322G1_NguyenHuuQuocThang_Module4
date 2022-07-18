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
        products.put(1, new Product(1, "Bút", 3000, "Việt Nam"));
        products.put(2, new Product(2, "Bánh", 2000, "Việt Nam"));
        products.put(3, new Product(3, "Kẹo", 1000, "Việt Nam"));
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
    public void insertProduct(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

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

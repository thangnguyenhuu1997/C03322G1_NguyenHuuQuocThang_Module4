package com.codegym.repository;

import com.codegym.model.Product;
import com.mysql.cj.Session;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ProductRepository implements IProductRepository {
    Session session = null;
    List<Product> productList = null;
    @Override
    public List<Product> selectAllMusic() {
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            productList = session.createQuery("from Product ").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product selectProduct(int id) {
        return null;
    }

    @Override
    public void insertProduct(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

}

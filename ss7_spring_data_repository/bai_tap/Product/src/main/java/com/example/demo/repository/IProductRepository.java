package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product where status_delete = 1", nativeQuery = true)
    Page<Product> findAllProduct(Pageable pageable);

    @Modifying
    @Query(value = "insert into product (name, price, country, status_delete) values (:name, :price, :country, 1)", nativeQuery = true)
    void save(@Param("name") String name, @Param("price") Double price, @Param("country") String country);

    @Query(value = "select * from product where id = :id", nativeQuery = true)
    Product findByIdProduct(@Param("id") Integer id);

    @Modifying
    @Query(value = "update product set name = :name, price = :price, country = :country where id = :id", nativeQuery = true)
    void update(@Param("name") String name, @Param("price") Double price, @Param("country") String country, @Param("id") Integer id);

    @Modifying
    @Query(value = "update product set status_delete = 0 where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "select * from product where name = :name", nativeQuery = true,
            countQuery="select count(*) from product where name = :name")
    Page<Product> findAllProductByName(Pageable pageable, @Param("name") String name);

}

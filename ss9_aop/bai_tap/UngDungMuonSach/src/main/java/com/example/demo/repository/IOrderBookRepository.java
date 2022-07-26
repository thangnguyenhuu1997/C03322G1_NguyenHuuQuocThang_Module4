package com.example.demo.repository;

import com.example.demo.model.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IOrderBookRepository extends JpaRepository<OrderBook, Integer> {

    OrderBook findByOrderBookCode(Integer code);
}

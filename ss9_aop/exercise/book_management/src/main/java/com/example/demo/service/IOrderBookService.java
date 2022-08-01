package com.example.demo.service;

import com.example.demo.model.OrderBook;

public interface IOrderBookService {
    void save(OrderBook orderBook);

    OrderBook findByOrderBookCode(Integer code);

    void delete(OrderBook orderBook);
}

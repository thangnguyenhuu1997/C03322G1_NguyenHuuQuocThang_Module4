package com.example.demo.service.impl;

import com.example.demo.model.OrderBook;
import com.example.demo.repository.IOrderBookRepository;
import com.example.demo.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class OrderBookService implements IOrderBookService {

    @Autowired
    private IOrderBookRepository iOrderBookRepository;

    @Override
    public void save(OrderBook orderBook) {
        iOrderBookRepository.save(orderBook);
    }

    @Override
    public OrderBook findByOrderBookCode(Integer code) {
        return iOrderBookRepository.findByOrderBookCode(code);
    }

    @Override
    public void delete(OrderBook orderBook) {
        iOrderBookRepository.delete(orderBook);
    }
}

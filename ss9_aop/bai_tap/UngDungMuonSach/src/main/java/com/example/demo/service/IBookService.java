package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);

    Book findById(Integer id);

    void update(Book book);

    void giveBack(Book book);

    boolean checkQuantity(Integer quantity);

}

package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.IBookRepository;
import com.example.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return iBookRepository.findById(id).get();
    }

    @Override
    public void update(Book book) {
        book.setQuantity(book.getQuantity() - 1);
        iBookRepository.save(book);
    }

    @Override
    public void giveBack(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public boolean checkQuantity(Integer quantity) {
        if (quantity == 0) {
            return false;
        } else {
            return true;
        }
    }

}

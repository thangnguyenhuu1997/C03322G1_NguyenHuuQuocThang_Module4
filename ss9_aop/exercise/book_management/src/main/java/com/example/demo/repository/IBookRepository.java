package com.example.demo.repository;

import com.example.demo.model.Book;
;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {
    @Modifying
    @Query(value = "insert into book (book_code , book_name, author, type, publish_year, quantity) values (:code, :name, :author, :type, :year, :quantity)", nativeQuery = true)
    void save(@Param("code") String code, @Param("name") String name, @Param("author") String author, @Param("type") String type, @Param("year") String year, @Param("quantity") Integer quantity);
}
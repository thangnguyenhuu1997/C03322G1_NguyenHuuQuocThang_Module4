package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> find(String keyword, Pageable pageable);
}

package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    Optional<Blog> findById(Integer id);

    void saveBlog(Blog blog);

    void update(Blog blog);

    void remove(Integer id);
}

package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAllCategory();

    void save(Category category);

    Category findByIdCategory(Integer id);

    void update(Category category);

    void delete(Integer id);
}

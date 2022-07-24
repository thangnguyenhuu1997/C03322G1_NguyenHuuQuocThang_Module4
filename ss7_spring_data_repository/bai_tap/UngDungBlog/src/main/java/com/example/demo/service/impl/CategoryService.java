package com.example.demo.service.impl;

import com.example.demo.model.Category;
import com.example.demo.repository.ICategoryRepository;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAllCategory() {
        return iCategoryRepository.findAllCategory();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category.getNameCategory());
    }

    @Override
    public Category findByIdCategory(Integer id) {
        return iCategoryRepository.findByIdCategory(id);
    }

    @Override
    public void update(Category category) {
        iCategoryRepository.update(category.getNameCategory(), category.getIdCategory());

    }

    @Override
    public void delete(Integer id) {
        iCategoryRepository.delete(id);

    }
}

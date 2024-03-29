package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByNameContains(String name, Pageable pageable);
}

package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAll();

    void save();

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Optional<Blog> findByIdBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set name = :name, status = :status, content = :content where id = :id", nativeQuery = true)
    void update(@Param("name") String name, @Param("status") String status, @Param("content") String content, @Param("id") Integer id);

}

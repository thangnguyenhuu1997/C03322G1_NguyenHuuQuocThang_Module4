package com.example.blog222.repository;

import com.example.blog222.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where status =1", nativeQuery = true)
    List<Blog> findAllBlog();

    @Modifying
    @Query(value = "insert into blog (name , status, content) values (:name, :status, :content)", nativeQuery = true)
    void save(@Param("name") String name, @Param("status") String status, @Param("content") String content);

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findByIdBlog(@Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set name = :name, status = :status, content = :content where id = :id", nativeQuery = true)
    void update(@Param("name") String name, @Param("status") String status, @Param("content") String content, @Param("id") Integer id);

    @Modifying
    @Query(value = "update blog set status = 0 where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);
}

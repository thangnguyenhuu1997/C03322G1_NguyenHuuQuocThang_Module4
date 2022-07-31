package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.IBlogRepository;
import com.example.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return iBlogRepository.findAllBlog(pageable);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog.getNameBlog(), blog.getAuthor(), blog.getDescription(), blog.getDateCreate(), blog.getCategory().getIdCategory());
    }

    @Override
    public Blog findByIdBlog(Integer id) {
        return iBlogRepository.findByIdBlog(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getNameBlog(), blog.getAuthor(), blog.getDescription(), blog.getDateCreate(), blog.getIdBlog(), blog.getCategory().getIdCategory());
    }

    @Override
    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }

    @Override
    public Page<Blog> findAllBlogByName(Pageable pageable, Blog blog) {
        return iBlogRepository.findAllBlogByName(pageable, "%" + blog.getNameBlog() + "%");
    }

}

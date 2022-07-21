package com.example.ung_dung_blog.service;

import com.example.ung_dung_blog.model.Blog;
import com.example.ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAllBlog() {
        return iBlogRepository.findAllBlog();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog.getName(), blog.getStatus(), blog.getContent());
    }

    @Override
    public Blog findByIdBlog(Integer id) {
        return iBlogRepository.findByIdBlog(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getName(), blog.getStatus(), blog.getContent(),blog.getId());
    }

    @Override
    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }
}

package com.coiggahou.blog.service;


import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getPreviewById(Long id) {
        return blogMapper.selectPreviewById(id);
    }

    @Override
    public List<Blog> getAllPreviews() {
        return blogMapper.selectAllPreviews();
    }

    @Override
    public Blog getContentById(Long id) {
        return blogMapper.selectContentById(id);
    }

    @Override
    public Boolean addNewBlog(Blog blog) {
        return blogMapper.insertNewBlog(blog);
    }
}

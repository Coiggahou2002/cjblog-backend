package com.coiggahou.blog.service;


import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getById(Long id) {
        return blogMapper.selectById(id);
    }
}

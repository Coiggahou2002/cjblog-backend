package com.coiggahou.blog.service;

import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.entity.blog.Tag;

import java.util.List;

public interface BlogService {
    Blog getPreviewById(Long id);

    List<Blog> getAllPreviews();

    Blog getContentById(Long id);

    Boolean addNewBlog(Blog blog);
}

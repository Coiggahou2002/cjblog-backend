package com.coiggahou.blog.service;


import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.entity.blog.Tag;
import com.coiggahou.blog.mapper.BlogMapper;
import com.coiggahou.blog.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private TagMapper tagMapper;

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
        // 前端传标签名数组过来到 Dao 把这些标签的 ID 选出来，供后续插入
        List<Tag> tagsWithoutId = blog.getTags();
        List<Tag> tagsWithId = tagMapper.selectByNames(tagsWithoutId);
        blogMapper.insertNewBlogWithoutTags(blog);
        for (Tag tag : tagsWithId) {
            blogMapper.insertTagForNewBlog(blog, tag);
        }
        return true;
    }
}

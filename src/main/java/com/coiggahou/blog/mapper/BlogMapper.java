package com.coiggahou.blog.mapper;

import com.coiggahou.blog.entity.blog.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BlogMapper {
    Blog selectPreviewById(@Param("blog_id") Long id);

    List<Blog> selectAllPreviews();

    Blog selectContentById(@Param("blog_id") Long id);

    Boolean insertNewBlog(@Param("blog") Blog blog);
}

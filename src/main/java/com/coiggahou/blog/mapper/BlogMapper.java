package com.coiggahou.blog.mapper;

import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.entity.blog.Tag;
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

    Boolean insertNewBlogWithoutTags(@Param("blog") Blog blog);

    Boolean insertTagForNewBlog(@Param("blog") Blog blog, @Param("tag") Tag tag);
}

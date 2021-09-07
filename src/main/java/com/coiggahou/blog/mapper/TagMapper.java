package com.coiggahou.blog.mapper;

import com.coiggahou.blog.entity.blog.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TagMapper {
    List<Tag> selectTopByLimit(Integer limit);
    List<String> selectAllTagNames();
    List<Tag> selectByNames(@Param("tags") List<Tag> tagsWithoutId);
    // Boolean insertTagsForNewBlog(@Param("blog_id") Long blogId, @Param("tag_ids") List<Long> tagIds);
}

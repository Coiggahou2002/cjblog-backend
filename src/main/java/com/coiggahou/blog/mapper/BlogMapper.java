package com.coiggahou.blog.mapper;

import com.coiggahou.blog.entity.blog.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BlogMapper {
    Blog selectById(@Param("id") Long id);
}

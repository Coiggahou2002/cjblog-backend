package com.coiggahou.blog.service;

import com.coiggahou.blog.entity.blog.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getTopTagsByLimit(Integer limit);

    List<String> getAllTagNames();
}

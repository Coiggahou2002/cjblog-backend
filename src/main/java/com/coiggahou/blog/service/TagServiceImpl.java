package com.coiggahou.blog.service;

import com.coiggahou.blog.entity.blog.Tag;
import com.coiggahou.blog.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> getTopTagsByLimit(Integer limit) {
        return tagMapper.selectTopByLimit(limit);
    }
}

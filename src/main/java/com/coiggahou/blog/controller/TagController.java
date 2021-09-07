package com.coiggahou.blog.controller;

import com.coiggahou.blog.entity.blog.Tag;
import com.coiggahou.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/admin/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/get_top_tags_by_limit")
    @ResponseBody
    List<Tag> getTopTagsByLimit(@RequestParam Integer limit) {
        return tagService.getTopTagsByLimit(limit);
    }

    @GetMapping("/get_all_tag_names")
    @ResponseBody
    List<String> getAllTagNames() {
        return tagService.getAllTagNames();
    }
}

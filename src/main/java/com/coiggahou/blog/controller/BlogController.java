package com.coiggahou.blog.controller;

import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping("/admin/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/get_by_id")
    @ResponseBody
    Blog getById(@RequestParam Long id) {
        return blogService.getById(id);
    }
}

package com.coiggahou.blog.controller;

import com.coiggahou.blog.entity.blog.Blog;
import com.coiggahou.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/admin/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/get_preview_by_id")
    @ResponseBody
    Blog getPreviewById(@RequestParam Long id) {
        return blogService.getPreviewById(id);
    }

    @GetMapping("/get_all_previews")
    @ResponseBody
    List<Blog> getAllPreviews() {
        return blogService.getAllPreviews();
    }

    @GetMapping("/get_content_by_id")
    @ResponseBody
    Blog getContentById(@RequestParam Long id) {
        return blogService.getContentById(id);
    }

    @PostMapping("/add_new_blog")
    @ResponseBody
    Boolean addNewBlog(@RequestBody Blog blog) {
        return blogService.addNewBlog(blog);
    }


}

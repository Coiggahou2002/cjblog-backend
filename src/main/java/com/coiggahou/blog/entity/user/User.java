package com.coiggahou.blog.entity.user;

import com.coiggahou.blog.entity.blog.Blog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;

    private Date createTime;

    private Date updateTime;


    private List<Blog> blogs = new ArrayList<>();
}

package com.coiggahou.blog.entity.blog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comment {

    private Long id;
    private String email;
    private String content;
    private String avatar;

    private Date createTime;

    private Date updateTime;


    private Blog blog;


    private Comment parentComment;


    private List<Comment> replyComments = new ArrayList<>();
}

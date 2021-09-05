package com.coiggahou.blog.entity.blog;

import com.coiggahou.blog.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private Long id;
    private String title;
    private String subtitle;
    private String digest;
    private String author;
    private String content;
    private String bannerPicture;
    private String flag;
    private Integer viewTimes;
    private Boolean appreciationOn;
    private Boolean reprintStatementOn;
    private Boolean commentOn;
    private Boolean isPublished;
    private Boolean isRecommended;
    private Date createTime;
    private Date updateTime;


    private Type type;

    private List<Tag> tags;

    private User user;

    private List<Comment> comments = new ArrayList<>();
}

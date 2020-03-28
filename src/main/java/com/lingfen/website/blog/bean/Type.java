package com.lingfen.website.blog.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Type {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int blogs;//该type对应的博客数量

    public Type() {
    }

    public int getBlogNums() {
        return blogs;
    }

    public void setBlogNums(int blogNums) {
        this.blogs = blogNums;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.travelblog.domain;

import java.util.Date;

public class Post_comment {

    private int post_comment_id;
    private int post_id;
    private int parent_id;
    private String published;
    private Date createdAt;
    private Date publishedAt;
    private String content;

    public int getPost_comment_id() {
        return post_comment_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public String getPublished() {
        return published;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setPost_comment_id(int post_comment_id) {
        this.post_comment_id = post_comment_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

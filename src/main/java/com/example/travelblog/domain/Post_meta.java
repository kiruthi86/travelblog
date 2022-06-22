package com.example.travelblog.domain;

public class Post_meta {
    private int id;
    private int post_Id;
    private String meta_key;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPost_Id() {
        return post_Id;
    }

    public void setPost_Id(int post_Id) {
        this.post_Id = post_Id;
    }

    public String getMeta_key() {
        return meta_key;
    }

    public void setMeta_key(String meta_key) {
        this.meta_key = meta_key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.example.travelblog.controller;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_Category;
import com.example.travelblog.services.PostCategoryService;
import com.example.travelblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostCategoryController {
    @Autowired
    PostCategoryService service;


    @GetMapping("/category/{post_id}")
    public List<Post_Category> findPostById(@PathVariable int post_id) {

        return service.getCategories(post_id);
    }


}

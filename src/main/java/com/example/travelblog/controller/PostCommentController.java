package com.example.travelblog.controller;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_comment;
import com.example.travelblog.services.PostCommentService;
import com.example.travelblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostCommentController {
    @Autowired
    PostCommentService postService;


    @GetMapping("/postComment/{post_id}")
    public List<Post_comment> findPostById(@PathVariable int post_id) {

        return postService.getCommentsByPostId(post_id);
    }
}

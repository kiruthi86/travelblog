package com.example.travelblog.controller;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_meta;
import com.example.travelblog.services.PostMetaService;
import com.example.travelblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostMetaController {

    @Autowired
    PostMetaService service;



    @GetMapping("/meta/{post_id}")
    public List<Post_meta> findPostById(@PathVariable int post_id) {

        return service.getMetadetailsbyPostId(post_id);
    }


}

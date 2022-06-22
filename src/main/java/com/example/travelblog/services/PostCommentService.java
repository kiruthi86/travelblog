package com.example.travelblog.services;

import com.example.travelblog.domain.Category;
import com.example.travelblog.domain.Post_comment;
import com.example.travelblog.repository.CategoryRepository;
import com.example.travelblog.repository.PostCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCommentService {
    @Autowired
    PostCommentRepository postCommentRepository;

    public List<Post_comment> getCommentsByPostId(int postId){return postCommentRepository.getCommentsByPostId( postId);};





}

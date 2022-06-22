package com.example.travelblog.services;

import com.example.travelblog.domain.Category;
import com.example.travelblog.domain.Post_meta;
import com.example.travelblog.repository.CategoryRepository;
import com.example.travelblog.repository.PostMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostMetaService {
    @Autowired
    PostMetaRepository postMetaRepository;

    public List<Post_meta> getMetadetailsbyPostId(int postId){return postMetaRepository.getMetdataDetails(postId);};





}

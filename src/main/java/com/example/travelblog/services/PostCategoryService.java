package com.example.travelblog.services;

import com.example.travelblog.domain.Category;
import com.example.travelblog.domain.Post_Category;
import com.example.travelblog.repository.CategoryRepository;
import com.example.travelblog.repository.PostCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCategoryService {
    @Autowired
    PostCategoryRepository repository;

    public List<Post_Category> getCategories(int postId){return repository.getPostsByUser(postId);};





}

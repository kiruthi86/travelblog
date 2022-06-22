package com.example.travelblog.services;

import com.example.travelblog.domain.Category;
import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.User;
import com.example.travelblog.repository.CategoryRepository;
import com.example.travelblog.repository.PostRepository;
import com.example.travelblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.getCategories( );};





}

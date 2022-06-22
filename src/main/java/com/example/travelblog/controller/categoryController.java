package com.example.travelblog.controller;

import com.example.travelblog.domain.Category;
import com.example.travelblog.domain.User;
import com.example.travelblog.services.CategoryService;
import com.example.travelblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class categoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllcategories(){
        return categoryService.getCategories() ;
    }


}

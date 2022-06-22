package com.example.travelblog.repository;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostCategoryRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post_Category> getPostsByUser(int postId){
        String mySql = "select * from post_category  where post_id = ?";
        List<Post_Category> postList =  jdbcTemplate.query(mySql, new PostCategoryRowMapper(), postId);

        return postList;
    }

    private class PostCategoryRowMapper implements RowMapper<Post_Category>
    {
        public Post_Category mapRow(ResultSet rs, int rowNum) throws SQLException {


            Post_Category post_category =new Post_Category();
            post_category.setCategoryId(rs.getInt("category_id"));
            post_category.setPostId(rs.getInt("post_id"));
            return post_category;
        }
    }
}

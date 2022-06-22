package com.example.travelblog.repository;

import com.example.travelblog.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Category> getCategories(){
        String mySql = "select * from category;";
        List<Category> postList =  jdbcTemplate.query(mySql, new CategoryRowMapper());

        return postList;
    }


    private class CategoryRowMapper implements RowMapper<Category>
    {
        public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
            Category category1 = new Category();
            category1.setCategory_id(rs.getInt("category_id"));
            category1.setTitle(rs.getString("title"));
            category1.setMetaTitle(rs.getString("metaTitle"));
            category1.setParent_id(rs.getInt("parent_id"));
            category1.setSlug(rs.getString("slug"));
            category1.setContent(rs.getString("content"));

            return category1;
        }
    }
}

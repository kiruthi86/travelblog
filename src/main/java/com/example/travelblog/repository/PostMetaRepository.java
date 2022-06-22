package com.example.travelblog.repository;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostMetaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post_meta> getMetdataDetails(int id){
        String mySql = "select * from post_meta   where post_Id = ?";
        List<Post_meta> postList =  jdbcTemplate.query(mySql, new MetaRowMapper(), id);

        return postList;
    }

    private class MetaRowMapper implements RowMapper<Post_meta>
    {
        public Post_meta mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post_meta post = new Post_meta();
            post.setPost_Id(rs.getInt("post_id"));
            post.setContent(rs.getString("content"));
            post.setMeta_key(rs.getString("meta_key"));
            post.setId(rs.getInt("post_meta_id"));
            return post;
        }
    }
}

package com.example.travelblog.repository;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.Post_comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostCommentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post_comment> getCommentsByPostId(int id){
        String mySql = "select * from post_comment  where post_id = ?";
        List<Post_comment> postList =  jdbcTemplate.query(mySql, new PostCommentRowMapper(), id);

        return postList;
    }

    private class PostCommentRowMapper implements RowMapper<Post_comment>
    {
        public Post_comment mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post_comment postComment = new Post_comment();
            postComment.setPost_id(rs.getInt("post_id"));
            postComment.setPost_comment_id(rs.getInt("post_comment_id"));
            postComment.setContent(rs.getString("content"));
            postComment.setParent_id(rs.getInt("parent_id"));
            postComment.setCreatedAt(rs.getDate("createdAt"));
            postComment.setPublished(rs.getString("published"));
            postComment.setPublishedAt(rs.getTime("publishedAt"));

            return postComment;
        }
    }
}

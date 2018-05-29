package com.dac.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dac.model.PostClass;

public class PostDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate =new JdbcTemplate(dataSource);
	}

	public List<Map<String, Object>> readAllPost() {

		String sql = "SELECT * FROM POST";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		//System.out.println(list);
		return list;
	}

	public void updatePost() {
		String sql = "UPDATE POST SET POST=? WHERE ID=?";
		String updatePostValue = "WINTER IS COMING";
		int id = 1;
		jdbcTemplate.update(sql, updatePostValue, id);
	}

	public void insertPost(PostClass post){
		String sql="INSERT INTO POST (POST, LIKE_COUNT, DISLIKE_COUNT) VALUES(?, ?, ?)";
		jdbcTemplate.update(sql,post.getPost(), post.getLike_count(), post.getDislike_count());
	}

}





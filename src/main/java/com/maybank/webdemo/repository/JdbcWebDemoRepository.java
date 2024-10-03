package com.maybank.webdemo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maybank.webdemo.model.WebDemo;

@Repository
public class JdbcWebDemoRepository implements WebDemoRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Optional<WebDemo> findById(int id) {
		
		String sql = "select id,text from webdemo where id = ?";
		
		return jdbcTemplate.query(
				sql, (resultSet, rowNum) -> new WebDemo(resultSet.getInt("id"), resultSet.getString("text")), id)
				.stream().findFirst();
	}
	
	

}

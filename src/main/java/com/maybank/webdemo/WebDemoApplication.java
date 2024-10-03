package com.maybank.webdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableJdbcRepositories("com.maybank.webdemo.repository")
public class WebDemoApplication {
	
	@Autowired
    JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}
	

}

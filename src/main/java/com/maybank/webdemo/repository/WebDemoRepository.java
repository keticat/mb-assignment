package com.maybank.webdemo.repository;

import java.util.Optional;

import com.maybank.webdemo.model.WebDemo;

public interface WebDemoRepository {
	
	Optional<WebDemo> findById(int id);

}

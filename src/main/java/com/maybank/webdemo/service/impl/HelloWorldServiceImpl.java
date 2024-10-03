package com.maybank.webdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maybank.webdemo.model.WebDemo;
import com.maybank.webdemo.repository.WebDemoRepository;
import com.maybank.webdemo.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{
	
	@Autowired
	WebDemoRepository webDemoRepository;

	@Override
	public String getTextById(int id) {
		return webDemoRepository.findById(id).orElse(new WebDemo()).getText();
	}

}

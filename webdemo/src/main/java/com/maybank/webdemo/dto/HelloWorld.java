package com.maybank.webdemo.dto;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

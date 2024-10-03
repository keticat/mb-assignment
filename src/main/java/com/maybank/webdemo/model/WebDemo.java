package com.maybank.webdemo.model;


public class WebDemo {

	private int id;
	private String text;

	public WebDemo(int id, String text) {
		this.id = id;
		this.text = text;
	}

	public WebDemo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

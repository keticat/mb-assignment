package com.maybank.webdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maybank.webdemo.service.HelloWorldService;

@Controller
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;

	// Display hello world
	@GetMapping("/helloWorld")
	public String displayHelloWorld(Model model) {
		
		model.addAttribute("statement", helloWorldService.getTextById(1));
		
		return "helloworld";
	}
	
}

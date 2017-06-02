package com.web.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloMvc {
	
	@GetMapping
	@RequestMapping("/first")
	public String sayHello() {
		return "HELLO WORLD";
	}
	
	
	
	
}

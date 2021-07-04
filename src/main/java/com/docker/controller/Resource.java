package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	@GetMapping("/how are you")
	public String result() {
		return "I am Fine";
	}

}

package com.example.jenkinsdemo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCtrl {
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello, World!";
	}

}

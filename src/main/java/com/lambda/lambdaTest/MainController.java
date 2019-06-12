package com.lambda.lambdaTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/test")
	public String test(@RequestParam String name) {
		
		return "Hello "+name;
	}
}

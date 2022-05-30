package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoProjectNewApplication {

	@RequestMapping("/")
	@ResponseBody
	
	String homepage() {
		return "Welcom to Spring Boot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoProjectNewApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microsoft.applicationinsights.attach.ApplicationInsights;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
    		ApplicationInsights.attach();
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure World!";
	}
}

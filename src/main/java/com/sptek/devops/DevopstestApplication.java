package com.sptek.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopstestApplication {

	@RequestMapping("/")
	String home() {
		return "데브옵스를 위한 테스트 웹입니다.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopstestApplication.class, args);
	}

}

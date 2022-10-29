package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {
	
	private AppConfiguration appConfiguration;  
	
	public Demo1Application( AppConfiguration appConfiguration) {
		this.appConfiguration = appConfiguration; 
	} 
	
	@Value("${app.message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@GetMapping("/inicio")
	public String inicio( ) {
		return message;
	}
	
	@GetMapping("/config")
	public String config() {
		return appConfiguration.getMessage();
	}
	

}

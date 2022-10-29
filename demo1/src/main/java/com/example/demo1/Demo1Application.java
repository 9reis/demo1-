package com.example.demo1;

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

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	
	@GetMapping("/inicio")
	public String inicio( ) {
		return "<h1> Projeto Spring iniciado </h1>";
	}
	
	@GetMapping("/config")
	public String config() {
		return appConfiguration.getMessage();
	}
	

}

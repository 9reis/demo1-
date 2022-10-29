package com.example.demo1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	public String getMessage() {
		return "Texto de configuração";
	}

}

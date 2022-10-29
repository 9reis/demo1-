package com.example.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	public String getMessage() {
		return "<h1>Texto de configuração<h1>";
	}
	
	@Bean 
	public void init() {
		System.out.println("<h1> Inicializado com o BEAN </h1>");
	}

}

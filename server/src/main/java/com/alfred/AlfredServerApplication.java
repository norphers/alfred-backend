package com.alfred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AlfredServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlfredServerApplication.class, args);
	}

	public static final String[] STANDARD_ORIGIN = { "*" };

	public static final String[] STANDARD_METHODS = { "GET", "POST", "PUT", "DELETE" };

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins(STANDARD_ORIGIN).allowedMethods(STANDARD_METHODS);
			}
		};
	}

}
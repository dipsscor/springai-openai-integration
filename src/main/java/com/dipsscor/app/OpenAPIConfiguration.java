package com.dipsscor.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfiguration {
	
	
	@Bean
	public OpenAPI openAPIConfig() {
		
		Info info = new Info()
				.title("Spring AI Open AI Integration Service")
				.description("Spring-AI Open AI Integration Service with GPT 4.0")
				.version("1.0");
		
		return new OpenAPI().info(info);
				
		

	}
	

}

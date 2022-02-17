package com.mondee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mondee")
public class ApplicationConfig {
	
	@Bean
	public Student studentBean() {
		return new Student();
		
	}

}

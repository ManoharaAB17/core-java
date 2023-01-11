package com.xworkz.mavenjan11.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class RubberConfiguration {

	@Bean
	public String rname() {
		return "Apsara";
	}
	
	@Bean
	public String type() {
		return "Pencil Eraser";
	}
	
	@Bean
	public String color() {
		return "White";
	}
	
	@Bean
	public String shape() {
		return "Rectangle";
	}
	
	@Bean
	public boolean stolen() {
		return true;
	}
	
	@Bean
	public double size() {
		return 3.5;
	}
	
	
}

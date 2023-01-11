package com.xworkz.mavenjan11.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class PencilConfiguration {

	@Bean
	public String pname() {
		return "Nataraja";
	}

	@Bean
	public String type() {
		return "Pencil";
	}

	@Bean
	public int price() {
		return 10;
	}
	
	@Bean
	public String color() {
		return "Red and Black";
	}
	
	@Bean
	public boolean sharp() {
		return true;
	}
	
	@Bean
	public boolean stolen() {
		return false;
	}

}

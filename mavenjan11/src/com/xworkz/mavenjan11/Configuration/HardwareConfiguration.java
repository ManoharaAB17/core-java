package com.xworkz.mavenjan11.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class HardwareConfiguration {
	@Bean
	public int id() {
		return 07;
	}
	
	@Bean
	public String name() {
		return "Moon Hardware and Engineering Wroks";
	}
	
	@Bean
	public String gstNo() {
		return "17JULY1999";
	}
	
	@Bean
	public String ownerName() {
		return "Manohara A B";
	}
	
	@Bean
	public String address() {
		return "Shimogga";
	}
        
}

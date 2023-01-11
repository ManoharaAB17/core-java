package com.xworkz.mavenjan11.Configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class SoftwareEngineerConfiguration {	
	@Bean
	public String name2() {
		return "Manohara A B";
	}
	@Bean
	public double salary() {
		return 34300.0;
	}
	@Bean
	public String companyName() {
		return "6D Technologies";
	}
	
	@Bean
	public double exp() {
		return 2.3;
	}

}

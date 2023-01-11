package com.xworkz.mavenjan11.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavenjan11")
public class MonnWishesConfiguration {
	
	@Bean
	public String mname() {
		return "Manohara A B ";
	}
	@Bean
	public byte memory() {
		return 2;
	}
	@Bean
	public short height() {
		return 167;
	}
	
	@Bean
	public int weight() {
		return 58;
	}
	
	@Bean
	public long bones() {
		return 206L;
	}
	
	@Bean
	public float bv() {
		return 60000;
	}
	@Bean
	public double eyes() {
		return 2.0;
	}
	
	@Bean
	public boolean dem() {
		return false;
	}
	
	@Bean
	public char gender() {
		return 'M';
	}
	
}

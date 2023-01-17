package com.xworkz.mavjan16browser.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavjan16browser")
public class Config {
	public Config(){
		System.out.println("Configuration Construtor");
	}
}

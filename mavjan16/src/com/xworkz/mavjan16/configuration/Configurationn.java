package com.xworkz.mavjan16.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mavjan16")
public class Configurationn {
	public Configurationn() {
		System.out.println("Configuration Construtor");
	}
}

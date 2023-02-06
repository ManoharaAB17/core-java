package com.xworkz.manu.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.manu")
@Configuration
public class ManuConfiguration {
	public ManuConfiguration() {
		System.out.println("Created  : " + this.getClass().getSimpleName());
	}
}

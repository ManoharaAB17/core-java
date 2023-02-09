package com.xworkz.bekary.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bekary")
public class BekaryConfiguration {
	public BekaryConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}

package com.xworkz.laser.spring.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xorkz.laser.spring")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println(this.getClass().getSimpleName());
	}
	
}

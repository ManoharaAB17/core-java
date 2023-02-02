package com.xworkz.interview.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.interview")
public class InterviewConfig {
	public InterviewConfig() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}

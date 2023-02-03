package com.xworkz.task.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.task")
public class TaskConfiguration {
	public TaskConfiguration() {
		System.out.println("Created  : " + this.getClass().getSimpleName());
	}
}

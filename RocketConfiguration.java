package com.xworkz.tsakjan10.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.tsakjan10.thing.Rocket;

@Component
@ComponentScan("com.xworkz.tsakjan10")
public class RocketConfiguration {
	public RocketConfiguration() {
		System.out.println("Default Rocket cofiguration Constructor\n");
	}
	
	@Bean
	public Rocket rock1() {
		System.out.println("Rocket 1 Bean\n");
		Rocket rock = new Rocket();
		return rock;
	}
	
	@Bean
	public Rocket rock2() {
		System.out.println("Rocket 2 Bean\n");
		Rocket rock = new Rocket();
		return rock;
	}

}

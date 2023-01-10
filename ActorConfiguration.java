package com.xworkz.tsakjan10.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.tsakjan10.thing.Actor;

@Component
@ComponentScan("com.xorkz.tsakjan10")
public class ActorConfiguration {
	public ActorConfiguration() {
		System.out.println("Default constructor of actor");
	}
	
	@Bean
	public Actor act() {
		Actor ac = new Actor("Darshan","Kannada",45);
		return ac;
	}
	
	@Bean
	public Actor act1() {
		Actor ac = new Actor("Yash","Kannada",37);
		return ac;
	}
}


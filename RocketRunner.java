package com.xworkz.tsakjan10.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.tsakjan10.Configuration.RocketConfiguration;
import com.xworkz.tsakjan10.thing.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
		ApplicationContext rock2 = new AnnotationConfigApplicationContext(RocketConfiguration.class);

		Rocket ref = rock2.getBean("rock1", Rocket.class);

		System.out.println("Rocket Name : " + ref.getName());
		System.out.println("Rocket madein Country : " + ref.getCountry());
		System.out.println("Rocket Budget : " + ref.getPrice());

		Rocket ref1 = rock2.getBean("rock2", Rocket.class);

		System.out.println("Rocket Name : " + ref1.getName());
		System.out.println("Rocket madein Country : " + ref1.getCountry());
		System.out.println("Rocket Budget : " + ref1.getPrice());

	}

}

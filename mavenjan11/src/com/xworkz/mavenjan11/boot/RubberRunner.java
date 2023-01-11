package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.RubberConfiguration;
import com.xworkz.mavenjan11.thing.Rubber;

public class RubberRunner {

	public static void main(String[] args) {
		ApplicationContext pr = new AnnotationConfigApplicationContext(RubberConfiguration.class);
		Rubber r = pr.getBean(Rubber.class);
		System.out.println(r);

	}

}

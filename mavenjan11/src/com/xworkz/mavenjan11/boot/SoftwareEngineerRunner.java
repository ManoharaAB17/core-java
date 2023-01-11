package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.SoftwareEngineerConfiguration;
import com.xworkz.mavenjan11.thing.SoftwareEngineer;

public class SoftwareEngineerRunner {

	public static void main(String[] args) {
		ApplicationContext ser = new AnnotationConfigApplicationContext(SoftwareEngineerConfiguration.class);
		SoftwareEngineer se = ser.getBean(SoftwareEngineer.class);
		System.out.println(se);
	}

}

package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.SoftwareConfiguration;
import com.xworkz.mavenjan11.thing.Software;

public class SoftwareRunner {

	public static void main(String[] args) {
		ApplicationContext swr = new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		Software sw = swr.getBean(Software.class);
		System.out.println(sw);

	}

}

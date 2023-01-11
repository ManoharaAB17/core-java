package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.HardwareConfiguration;
import com.xworkz.mavenjan11.thing.Hardware;

public class HardwareRunner {

	public static void main(String[] args) {
		ApplicationContext hwr = new AnnotationConfigApplicationContext(HardwareConfiguration.class);
		
		Hardware hw = hwr.getBean(Hardware.class);
		System.out.println(hw);
	}

}

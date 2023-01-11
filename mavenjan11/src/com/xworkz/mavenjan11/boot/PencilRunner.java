package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.PencilConfiguration;
import com.xworkz.mavenjan11.thing.Pencil;

public class PencilRunner {

	public static void main(String[] args) {
		ApplicationContext pr = new AnnotationConfigApplicationContext(PencilConfiguration.class);
		Pencil p = pr.getBean(Pencil.class);
		System.out.println(p);
	}

}

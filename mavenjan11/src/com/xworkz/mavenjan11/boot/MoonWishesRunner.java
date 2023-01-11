package com.xworkz.mavenjan11.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenjan11.Configuration.MonnWishesConfiguration;
import com.xworkz.mavenjan11.thing.MoonWishes;

public class MoonWishesRunner {

	public static void main(String[] args) {
		ApplicationContext mwr = new AnnotationConfigApplicationContext(MonnWishesConfiguration.class);
		
		MoonWishes mw = mwr.getBean(MoonWishes.class);
		System.out.println(mw);

	}

}

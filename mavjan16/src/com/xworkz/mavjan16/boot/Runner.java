package com.xworkz.mavjan16.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavjan16.configuration.Configurationn;
import com.xworkz.mavjan16.thing.PetrolBunk;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext rnr = new AnnotationConfigApplicationContext(Configurationn.class);
		PetrolBunk bunk =rnr.getBean(PetrolBunk.class);
	    bunk.purchase();
	}

}

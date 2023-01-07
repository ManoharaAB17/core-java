package com.xworkx.spring.thing;
import org.springframework.stereotype.Component;

@Component
public class Patient extends Object {
	
	public Patient() {
		super();
		System.out.println("Create Patient by Spring");
	}

}
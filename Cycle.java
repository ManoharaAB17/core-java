package com.xworkx.spring.thing;
import org.springframework.stereotype.Component;

@Component
public class Cycle extends Object {
	
	public Cycle() {
		super();
		System.out.println("Create Cycle by Spring");
	}

}
package com.xworkx.spring.thing;
import org.springframework.stereotype.Component;

@Component
public class Milk extends Object {
	
	public Milk() {
		super();
		System.out.println("Create Milk by Spring");
	}

}
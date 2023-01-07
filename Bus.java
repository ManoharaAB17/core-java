package com.xworkx.spring.thing;
import org.springframework.stereotype.Component;

@Component
public class Bus extends Object {
	
	public Bus() {
		super();
		System.out.println("Create Bus by Spring");
	}

}

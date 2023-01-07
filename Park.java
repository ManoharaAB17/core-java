package com.xworkx.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Park extends Object {
	
	public Park() {
		super();
		System.out.println("Create Park by Spring");
	}

}

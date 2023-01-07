package com.xworkx.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Temple extends Object {
	
	public Temple() {
		super();
		System.out.println("Create Temple by Spring");
	}

}
package com.xworkx.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Application extends Object {
	
	public Application() {
		super();
		System.out.println("Create Application by Spring");
	}

}

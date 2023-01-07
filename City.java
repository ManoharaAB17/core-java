package com.xworkx.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class City extends Object {
	
	public City() {
		super();
		System.out.println("Create City by Spring");
	}

}
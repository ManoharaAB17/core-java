package com.xworkz.mavjan16.thing;

import org.springframework.stereotype.Component;

@Component
public class Pertorl implements Fuel {

	@Override
	public void consume() {
		System.out.println("consume prtrol");
	}

}

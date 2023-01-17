package com.xworkz.mavjan16browser.thing;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	@Override
	public void connect() {
		System.out.println("Aritel provider connect");
		
	}

}

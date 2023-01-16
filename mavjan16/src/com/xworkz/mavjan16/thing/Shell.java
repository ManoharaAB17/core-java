package com.xworkz.mavjan16.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	
	
	@Autowired
	@Qualifier("pertorl")
	private Fuel fuel;// interface ref  : petrol or diesl


	public void purchase() {
		System.out.println("Purchse shell ");
     //fuel.consume();
	}

}

package com.xworkz.mavjan16browser.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Firebox implements Browser {
   @Autowired
   @Qualifier("airtel")   
   private Airtel airtel;

	@Override
	public void browse() {
		System.out.println("Firebox browser");
		airtel.connect();
	}

}

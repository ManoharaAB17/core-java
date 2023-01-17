package com.xworkz.mavjan16browser.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Crome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	public Airtel airtel;
	
	@Autowired
	@Qualifier("jio")
	public Jio jio;

	@Override
	public void browse() {
		System.out.println("This is Crome browser ");
	   airtel.connect();
	   jio.connect();
	}

}

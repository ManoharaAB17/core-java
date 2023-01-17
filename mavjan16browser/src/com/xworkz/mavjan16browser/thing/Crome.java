package com.xworkz.mavjan16browser.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Crome implements Browser {
	
	  @Autowired
	  @Qualifier("jio")
	  private Provider provider;
//	    
//	  @Autowired
//	  @Qualifier("airtel")
//	  private Provider provider1;
//	  
	
	@Override
	public void browse() {
		System.out.println("This is Crome browser ");
	    provider.connect();
//	    provider1.connect();
	}

}

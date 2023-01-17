package com.xworkz.mavjan16browser.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavjan16browser.configuration.Config;
import com.xworkz.mavjan16browser.thing.Airtel;
import com.xworkz.mavjan16browser.thing.Browser;
import com.xworkz.mavjan16browser.thing.Crome;
import com.xworkz.mavjan16browser.thing.Firebox;
import com.xworkz.mavjan16browser.thing.Network;
import com.xworkz.mavjan16browser.thing.Provider;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext ref = new AnnotationConfigApplicationContext(Config.class);

		Crome crome=ref.getBean(Crome.class);
		crome.browse();
		
		Firebox fb = ref.getBean(Firebox.class);
		fb.browse();
	
		 
	
	}

}

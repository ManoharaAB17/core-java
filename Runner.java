package com.xworkx.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkx.spring.configuration.SpringConfiguration;
import com.xworkx.spring.thing.Application;
import com.xworkx.spring.thing.Area;
import com.xworkx.spring.thing.Bus;
import com.xworkx.spring.thing.City;
import com.xworkx.spring.thing.Cycle;
import com.xworkx.spring.thing.FIsh;
import com.xworkx.spring.thing.Girl;
import com.xworkx.spring.thing.God;
import com.xworkx.spring.thing.Mall;
import com.xworkx.spring.thing.Milk;
import com.xworkx.spring.thing.Park;
import com.xworkx.spring.thing.Road;
import com.xworkx.spring.thing.Temple;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref = spring.getBean(Road.class);
		//System.out.println(ref.toString());
		
		Bus ref1 = spring.getBean(Bus.class);
		Cycle ref2 = spring.getBean(Cycle.class);
		Girl ref3 = spring.getBean(Girl.class);
		Milk ref4 = spring.getBean(Milk.class);
		Area ref5 = spring.getBean(Area.class);
		City ref6 =spring.getBean(City.class);
		FIsh ref7 = spring.getBean(FIsh.class);
		Temple ref8 = spring .getBean(Temple.class);
		God ref9 =spring.getBean(God.class);
		Park ref10 = spring.getBean(Park.class);
		Mall ref11 = spring.getBean(Mall.class);
		Application ref12 = spring.getBean(Application.class);
		
		
	}

}

package com.xworkz.mavenjan11.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MoonWishes {
	@Autowired
	@Qualifier("mname")
     private String name;
	@Autowired
	@Qualifier("memory")
     private byte  memory;
	@Autowired
	@Qualifier("height")
     private short height;
	@Autowired
	@Qualifier("weight")
     private int weight;
	@Autowired
	@Qualifier("bones")
     private long bones;
	@Autowired
	@Qualifier("bv")
     private float bloodvessels;
	@Autowired
	@Qualifier("eyes")
     private double eyes; 
     @Autowired
 	@Qualifier("dem")
     private boolean dem;
     @Autowired
 	@Qualifier("gender")
     private char gender;
	@Override
	public String toString() {
		return "MoonWishes [name=" + name + ", memory=" + memory + ", height=" + height + ", weight=" + weight
				+ ", bones=" + bones + ", bloodvessels=" + bloodvessels + ", eyes=" + eyes + ", dem=" + dem
				+ ", gender=" + gender + "]";
	}
     
     
     
}

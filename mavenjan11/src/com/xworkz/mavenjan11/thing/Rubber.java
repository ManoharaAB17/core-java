package com.xworkz.mavenjan11.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rname")
	private String name;
	
	@Autowired
	@Qualifier("type")
	private String type;
	
	@Autowired
	@Qualifier("price")
	private int price;
	
	@Autowired
	@Qualifier("color")
	private String color;
	
	@Autowired
	@Qualifier("shape")
	private String shape;
	
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;
	
	@Autowired
	@Qualifier("size")
	private double size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}

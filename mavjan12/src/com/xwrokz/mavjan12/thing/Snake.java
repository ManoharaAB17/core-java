package com.xwrokz.mavjan12.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Value("12.5")
	private double length;
	@Value("Balck With gold")
	private String colour;
	private String type;
	private boolean poisnous;
	
	@Autowired
	public Snake(@Qualifier("sName")  String name,@Qualifier("sType") String type, @Qualifier("sPos") boolean poisnous) {
		super();
		this.name = name;
		this.type = type;
		this.poisnous = poisnous;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisnous="
				+ poisnous + "]";
	}
	
	
	
		
	
	
}

package com.xworkz.tsakjan10.thing;

import org.springframework.stereotype.Component;

@Component
public class Actor {
	private String name;
	private String language;
	private int age;
	
	public Actor(String name, String language, int age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public int getAge() {
		return age;
	}

}

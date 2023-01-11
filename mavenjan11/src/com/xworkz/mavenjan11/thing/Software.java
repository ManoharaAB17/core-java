package com.xworkz.mavenjan11.thing;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("name1")
	private String name;
	@Autowired
	@Qualifier("version")
	private String version;
	@Autowired
	@Qualifier("devloper")
	private String Devloper;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	@Qualifier("free")
	private boolean free;

	public Software() {
		System.out.println("Default constructor of Software class\n ");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", Devloper=" + Devloper + ", date=" + date
				+ ", free=" + free + "]";
	}

	
}

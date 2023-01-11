package com.xworkz.mavenjan11.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardware {
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String address;

	public Hardware() {
		System.out.println("Default constuctor of HaedwareSHop");
	}

	@Override
	public String toString() {
		return "Hardware [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName + ", address="
				+ address + "]";
	}

	

}

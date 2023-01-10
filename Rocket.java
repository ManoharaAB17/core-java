package com.xworkz.tsakjan10.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("PSLV-C54")
	private String name;
	@Value("India")
	private String country;
	@Value("200.0")
	private double price;

	public Rocket() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public double getPrice() {
		return price;
	}

}

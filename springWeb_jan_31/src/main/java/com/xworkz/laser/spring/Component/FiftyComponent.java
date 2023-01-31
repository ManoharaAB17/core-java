package com.xworkz.laser.spring.Component;

import org.springframework.stereotype.Component;

@Component
public class FiftyComponent {
	public FiftyComponent() {
		System.out.println(this.getClass().getSimpleName());
	}
}

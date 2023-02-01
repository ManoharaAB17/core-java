package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping
public class FoodItem {
	public FoodItem() {
		System.out.println("Food Item Component");
	}
	
	@PostMapping("/food")
	public String onSend(@RequestParam String name, @RequestParam String type,@RequestParam String quantity, @RequestParam double price) {
		
		System.out.println("Name : " +name);
		System.out.println("Type : " +type);
		System.out.println("Quantity : " +quantity);
		System.out.println("Price : " +price);
		 return "display.jsp";
	}
}

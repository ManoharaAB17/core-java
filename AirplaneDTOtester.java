/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.AirplaneDTO;

public class AirplaneDTOtester {

	
	public static void main(String[] args) {
		AirplaneDTO bd= new AirplaneDTO();
		bd.setName("INDIGO");
		bd.setId(2376);
		bd.setModelNumber("Airbus A321-200/P2F	");
		bd.setCountryOfOrigin("India");
		bd.setPrice(1.25);
		bd.setWeight("80000kg");
		bd.setManufacturer("Rahul Bhatia");
		
		System.out.println("ID  "+bd.getId() +"\n Model Number : "+ bd.getModelNumber()+"\n Name: "+ bd.getName()+" \n Country :"+bd.getCountryOfOrigin()+"\n Manufacture : "+bd.getManufacturer()+"\n Price in Crore : "+bd.getPrice()+"\n Weight : "+bd.getWeight());
		
	}

}

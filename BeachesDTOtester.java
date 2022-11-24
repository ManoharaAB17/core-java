/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.BeachesDTO;

public class BeachesDTOtester {

	public static void main(String[] args) {
		BeachesDTO bd= new BeachesDTO();
		bd.setName("GOA");		
		bd.setCountryOfOrigin("India");
		bd.setFamousFor("Tourist");	
		bd.setPopulation(18.2);
		
		System.out.println("\n Name : "+ bd.getName() +" \n Country :"+bd.getCountryOfOrigin()+"\n Famous : "+bd.getFamousFor()+"\n Population in Laks : "+bd.getPopulation());
		

	}

}

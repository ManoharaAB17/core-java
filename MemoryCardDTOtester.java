/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.BusDTO;
import com.xworkz.beachesapp.beach.MemoryCardDTO;

public class MemoryCardDTOtester {

	public static void main(String[] args) {
		MemoryCardDTO md= new MemoryCardDTO();
		md.setName("Sony_Memory_Cards");
		md.setStorage("16GB");
		md.setId(76);
		md.setCountryOfOrigin("India");
		md.setPrice(3000);
		md.setWeight("2grams");
		md.setManufacturer("Sony");
		
		System.out.println("Name : "+md.getName()+"\n Storage capacity : "+md.getStorage()+"\n ID : "+md.getId()+"\n Country : "+md.getCountryOfOrigin()+"\n Price : "+md.getPrice()+"\n Weight : " + md.getWeight()+"\n Manufature : "+md.getManufacturer());
	}

}

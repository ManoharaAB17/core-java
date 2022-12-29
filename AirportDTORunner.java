/**
 * 
 */
package com.xworkz.collectionsapp.dec28;

import java.util.ArrayList;
import java.util.Collection;

public class AirportDTORunner {

	
	public static void main(String[] args) {
		AirportDTO ap1 = new AirportDTO("Kempegowda International Airport","International","Bengaluru");
		AirportDTO ap2 = new AirportDTO("Manglore International Airport ","International","Manglore");
		AirportDTO ap3 = new AirportDTO("Kempegowda International Airport","International","Bengaluru");
		AirportDTO ap4 = new AirportDTO("Hubbali International Airport","International","Hubbali");
		AirportDTO ap5 = new AirportDTO("Shimogga","National","Shimogga");
		
		boolean equals= ap1.equals(ap3);
		System.out.println(equals);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		Collection<AirportDTO> col = new ArrayList<AirportDTO>();
		col.add(ap1);
		col.add(ap2);
		col.add(ap3);
		col.add(ap4);
		col.add(ap5);
		
		col.contains(ap5);
		col.contains(ap4);
		col.contains(ap3);
		col.contains(ap2);
		col.contains(ap1);
		
	}

}

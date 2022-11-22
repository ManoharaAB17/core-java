/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.BeachesDTO;

/**
 * @author DELL
 *
 */
public class BeachesDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeachesDTO bd= new BeachesDTO();
		 bd.setId(8);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("Goa");
		 System.out.println("Name = " +bd.getName());

	}

}

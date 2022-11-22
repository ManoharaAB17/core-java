/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.SpaceJetDTO;

/**
 * @author DELL
 *
 */
public class SpaceJetDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpaceJetDTO bd= new SpaceJetDTO();
		 bd.setId(549);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("PSLV_025");
		 System.out.println("Name = " +bd.getName());
	}

}

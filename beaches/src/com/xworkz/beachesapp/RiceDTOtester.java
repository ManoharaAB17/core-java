/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.RiceDTO;

/**
 * @author DELL
 *
 */
public class RiceDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RiceDTO bd= new RiceDTO();
		 bd.setId(04332);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("Sona-masuri_48");
		 System.out.println("Name = " +bd.getName());
	}

}

/**
 * 
 */
package com.xworkz.beachesapp;


import com.xworkz.beachesapp.beach.BusDTO;

/**
 * @author DELL
 *
 */
public class BusDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusDTO bd= new BusDTO();
		 bd.setId(234);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("AshokLealand");
		 System.out.println("Name = " +bd.getName());
	}

}

/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.HospitalDTO;

/**
 * @author DELL
 *
 */
public class HospitalDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HospitalDTO bd= new HospitalDTO();
		 bd.setId(03214);
		 System.out.println("id = " +bd.getId());
		  
		 bd.setName("Nanjappa Life Care");
		 System.out.println("Name = " +bd.getName());
	}

}

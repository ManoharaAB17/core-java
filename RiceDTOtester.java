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
		RiceDTO rd= new RiceDTO();
		 rd.setId(76);
		 rd.setName("Sona-Masuri");
		 rd.setPrice(2000);
		 
		 System.out.println("ID : "+rd.getId()+"\n Name : "+rd.getName()+"\n Price : "+rd.getPrice());
	}

}

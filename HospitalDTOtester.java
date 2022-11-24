/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.HospitalDTO;

public class HospitalDTOtester {

	public static void main(String[] args) {
		HospitalDTO hd= new HospitalDTO();
		 hd.setName("JSS HOSPITAL");
		 hd.setFounder("Basangouda Patil Yatnal");
		 hd.setPlace("Bijapura");
		 
		 System.out.println("Hospital Name : "+hd.getName()+"\n Founder : "+hd.getFounder()+"\n Place : "+hd.getPlace());
	}

}

/**
 * 
 */
package com.xworkz.beachesapp;
import com.xworkz.beachesapp.beach.BusDTO;
public class BusDTOtester {
	public static void main(String[] args) {
		BusDTO bd= new BusDTO();
		bd.setName("VRL");
		bd.setId(543);
		bd.setModelNumber("BUS9766VRL");
		bd.setCountryOfOrigin("India");
		bd.setPrice(20);
		bd.setManufacturer("VijayaNanda");
		
		System.out.println("Name: "+ bd.getName() +"\n ID : "+bd.getId()+"\n Country : "+ bd.getCountryOfOrigin()+"\n Model Number : "+bd.getModelNumber()+"\n Price in Laks : "+bd.getPrice()+"\n Manufacture : "+bd.getManufacturer());
		
	}

}

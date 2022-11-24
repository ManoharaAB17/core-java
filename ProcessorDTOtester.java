/**
 * 
 */
package com.xworkz.beachesapp;

import com.xworkz.beachesapp.beach.ProcessorDTO;

/**
 * @author DELL
 *
 */
public class ProcessorDTOtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessorDTO pd= new ProcessorDTO();
		pd.setCountryOfOrigin("INDIA");
		pd.setName("Processor");
		pd.setModelNumber("AMD 5000 Series Ryzen 5 5600 Desktop Processor 6 cores 12 Threads 35 MB Cache 3.5 GHz Upto 4.2 GHz");
		pd.setBrand("AMD RYZEN_5");
		pd.setPrice(15770);
		
		System.out.println("Name : "+pd.getName()+ " \n Brand : "+pd.getBrand()+"\n Model Number : "+pd.getModelNumber()+"\n Country : "+pd.getCountryOfOrigin()+"\n Price in thousand : "+pd.getPrice());
	}

}

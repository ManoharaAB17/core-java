/**
 * 
 */
package com.xworkz.collectionsapp.dec21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		String sc1 = "Infosys",sc2 = "Wipro ", sc3 = " TCS", sc4 = "DXC ",sc5 = "6D tech ",sc6 = "NTT data ",sc7 = "unwired ",sc8 = "FAI ",sc9 = "Acuvate ",sc10 = "IBM ",sc11 = " LG Soft",sc12 = " Luxsoft",sc13 = "vrize ",
				sc14 = "Seminse ",sc15 = "Accenture ",sc16 = "Oracle ",sc17 = "Cognizant ",sc18 = "HCL ",sc19 = " Capgemini",sc20 = " HCL";
		
		Collection<String> companies = new ArrayList();
		
		companies.add(sc1);
		companies.add(sc2);
		companies.add(sc3);
		companies.add(sc4);
		companies.add(sc5);
		companies.add(sc6);
		companies.add(sc7);
		companies.add(sc8);
		companies.add(sc9);
		companies.add(sc10);
		companies.add(sc11);
		companies.add(sc12);
		companies.add(sc13);
		companies.add(sc14);
		companies.add(sc15);
		companies.add(sc16);
		companies.add(sc17);
		companies.add(sc18);
		companies.add(sc19);
		companies.add(sc20);
		
		System.out.println("Size : "+companies.size());
		
		for (String com : companies) {
			System.out.println(com);
			System.out.println("");
		}
		
		Iterator<String> elements = companies.iterator();
		
		System.out.println("Using Iterator \n");
		
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
		
		
	}

}

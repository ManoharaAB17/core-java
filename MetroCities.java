/**
 * 
 */
package com.xworkz.collectionsapp.dec21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author DELL
 *
 */
public class MetroCities {
	public static void main(String[] args) {
		String mc1= "Bengaluru", mc2= "Mumbai ", mc3= "Chennai ", mc4= "Dheli ", mc5= "Pune ";
		
		Collection<String> city = new ArrayList();
		
		city.add(mc5);
		city.add(mc4);
		city.add(mc3);
		city.add(mc2);
		city.add(mc1);
		
		System.out.println("Size : "+city.size());
		
		for (String cts : city) {
			System.out.println(cts);
		}
		
		Iterator<String> elements = city.iterator();
		System.out.println("Using Iterator \n");
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
	}

}

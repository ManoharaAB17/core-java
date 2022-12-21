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
public class Watches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String w1 = "Rolex";
		String w2 ="Luxury ";
		String w3 = "Sonata ";
		String w4 = "HMT";
		String w5 ="FastTrack ";
		
		Collection<String> watches = new ArrayList<String>(); 
		
		watches.add(w5);
		watches.add(w1);
		watches.add(w2);
		watches.add(w3);
		watches.add(w4);
		System.out.println("Size of watches : " +watches.size());
		
		for (String watch : watches) {
			System.out.println(watch);
			System.out.println(" ");
		}
		
		Iterator<String> elements = watches.iterator();
		System.out.println("After Iterator\n");
		
		while(elements.hasNext()) {
			System.out.println(elements.next());
			
		}		
		
 	}

}

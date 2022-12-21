/**
 * 
 */
package com.xworkz.collectionsapp.dec21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		String an1= "Tiger ";
		String an2= "Lion";
		String an3= "Elephnat";
		String an4= "Dog ";
		String an5= "Cat ";
		String an6= "Cow ";
		String an7= "Buffeloo ";
		String an8= "Ox ";
		String an9= " Cheetha";
		String an10= "Deer ";
		
		Collection<String> animal = new ArrayList();
		
		animal.add(an10);
		animal.add(an9);
		animal.add(an8);
		animal.add(an7);
		animal.add(an6);
		animal.add(an5);
		animal.add(an4);
		animal.add(an3);
		animal.add(an2);
		animal.add(an1);
		
		System.out.println("Size : " +animal.size());
		
		for (String animals : animal) {
			System.out.println(animals);
			System.out.println("");
		}
		
		Iterator<String> elements = animal.iterator();
		System.out.println("After Iterator  \n");
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
		
		
	}

}

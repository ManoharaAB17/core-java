
package com.xworkz.collectionsapp.dec20;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		String sw1 ="Champakli ";
		String sw2 ="Barfi ";
		String sw3 ="Kaju ";
		String sw4 ="Laddu ";
		String sw5 ="Jalebi ";
		String sw6 ="Gulab Jamun ";
		String sw7 =" Peda";
		String sw8 ="Darwad Peda ";
		String sw9 ="Rasmali ";
		String sw10 ="Rasgulla ";
		String sw11 ="Carrot Halwa ";
		String sw12="Sompampudi ";
		String sw13 ="PanCake ";
		
		Collection<String> coll =new TreeSet<String>(); 
		
		coll.add(sw1);
		coll.add(sw2);
		coll.add(sw3);
		coll.add(sw4);
		coll.add(sw5);
		coll.add(sw6);
		coll.add(sw7);
		coll.add(sw8);
		coll.add(sw9);
		coll.add(sw10);
		coll.add(sw11);
		coll.add(sw12);
		coll.add(sw13);
		
		System.out.println("Before clear ");
		System.out.println(coll);
		System.out.println(coll.size());
		
		System.out.println("After clear \n");
		coll.clear();
		
	}

}

/**
 * 
 */
package com.xworkz.collectionsapp.dec21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {


	public static void main(String[] args) {
		int ss1= 1,ss2 =2,ss3=3,ss4=4,ss5=5,ss6=6,ss7=7,ss8=8,ss9=9,ss10=10,ss11=11,ss12=12,ss13=13,ss14=14,ss15=15;
		
		Collection<Integer> shoesize = new ArrayList();
		
		shoesize.add(ss1);
		shoesize.add(ss2);
		shoesize.add(ss3);
		shoesize.add(ss4);
		shoesize.add(ss5);
		shoesize.add(ss6);
		shoesize.add(ss7);
		shoesize.add(ss8);
		shoesize.add(ss9);
		shoesize.add(ss10);
		shoesize.add(ss11);
		shoesize.add(ss12);
		shoesize.add(ss13);
		shoesize.add(ss14);
		shoesize.add(ss15);
		
		System.out.println("Size : "+shoesize.size());
		
		for (Integer ss : shoesize) {
			System.out.println(ss);
		}
		
		Iterator<Integer> elements = shoesize.iterator();
		
		System.out.println("using Iterator");
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
		
	}

}

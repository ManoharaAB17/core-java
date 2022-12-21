
package com.xworkz.collectionsapp.dec20;

import java.util.Collection;
import java.util.TreeSet;

public class BIke {

	public static void main(String[] args) {
         String bike1 ="TVS";
         String bike2 ="HERO ";
         String bike3 ="HONDA SHINE ";
         String bike4 ="BAJAJ ";
         String bike5 ="SUZUKI ";
         String bike6 ="JAWA ";
         String bike7 ="ROYAL ENFIELD ";
         String bike8 ="MT ";
         String bike9 ="PULSAR ";
         String bike10 ="APACHE ";
         String bike11 ="DISCOVER";
         String bike12 ="CT100 ";
         String bike13 ="TVS-XL ";
         String bike14 ="PASSION PRO ";
         String bike15 ="KAWASaKI ";
         String bike16 ="YAMAHA ";
         String bike17 ="KTM ";
         String bike18 ="BGAUSS ";
         
         Collection<String> coll = new TreeSet<String>();
         
         coll.add(bike1);
         coll.add(bike2);
         coll.add(bike3);
         coll.add(bike4);
         coll.add(bike5);
         coll.add(bike6);
         coll.add(bike7);
         coll.add(bike8);
         coll.add(bike9);
         coll.add(bike10);
         coll.add(bike11);
         coll.add(bike12);
         coll.add(bike13);
         coll.add(bike14);
         coll.add(bike15);
         coll.add(bike16);
         coll.add(bike17);
         coll.add(bike18);

         	System.out.println("Before");
         	System.out.println(coll);
         	
         	System.out.println("Size  : " +coll.size());
         	
         	coll.clear();
         	
	}

}

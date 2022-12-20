
package com.xworkz.collectionsapp.dec20;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {


	public static void main(String[] args) {
        String cpn1 ="2022DEC203";
        String cpn2 ="2022DEC204";
        String cpn3 ="2022DEC205";
        String cpn4 ="2022DEC206";
        String cpn5 ="2022DEC207";
        String cpn6 ="2022DEC2037";
        String cpn7 ="2022DEC2038";
        String cpn8 ="2022DEC2034";
        String cpn9 ="2022DEC2032";
        String cpn10 ="2022DEC2053";
        String cpn11 ="2022DEC20323";
        String cpn12 ="2022DEC203234";
        
        Collection<String> coll = new TreeSet<String>();   
        
        coll.add(cpn1);
        coll.add(cpn2);
        coll.add(cpn3);
        coll.add(cpn4);
        coll.add(cpn5);
        coll.add(cpn6);
        coll.add(cpn7);
        coll.add(cpn8);
        coll.add(cpn9);
        coll.add(cpn10);
        coll.add(cpn11);
        coll.add(cpn2);
        
        System.out.println("Before");
        System.out.println(coll);
        
        System.out.println("Size "+ coll.size());
        
        coll.clear();
        
	}

}

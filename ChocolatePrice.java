package com.xrokz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolatePrice {

	public static void main(String[] args) {
		
		Map<String, Double> cp = new HashMap<String, Double>();
            cp.put("Dairy Milk", 200.1);
            cp.put("Dairy Milk family Pack", 400.1);
            cp.put("Dark Fantasy", 350.1);
            cp.put("Oreo", 300.1);
            cp.put("5Star", 150.1);
            cp.put("Dark Night", 370.1);
            cp.put("Fuse", 80.1);
            cp.put("Temptation", 540.1);
            cp.put("Mango Bite", 10.1);
            cp.put("Orange bites", 550.1);
            
            System.out.println("Lopping only Keys \n");
            
            Collection<String> key =cp.keySet();
            key.forEach(k-> System.out.println(k));
            
            System.out.println("Lopping only Values \n");
            
            Collection<Double> values =cp.values();
            values.forEach(v-> System.out.println(v));
            
            System.out.println("ENTRIES\n");          
         
            Set<Entry<String, Double>> entries = cp.entrySet();
            for(Entry<String,Double> entry:entries)
            {
            	System.out.println(entry.getKey()+" : " +entry.getValue());
            }
            
            
            
            
	}

}

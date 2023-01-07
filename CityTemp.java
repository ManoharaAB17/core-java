package com.xrokz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CityTemp {

	public static void main(String[] args) {
		Map<String,Integer> ct = new HashMap<String,Integer>();
		ct.put("Shimogga", 24);
		ct.put("Bidar", 38);
		ct.put("Manglore", 28);
		ct.put("Banglore", 30);
		ct.put("Thumkur", 26);
		ct.put("Arasikere", 25);
		ct.put("Davanagere", 32);
		ct.put("Kalburagi", 40);
		ct.put("Ballari", 39);
		ct.put("Mandya", 29);
		
		System.out.println("Lopping only Keys \n");
        
        Collection<String> key =ct.keySet();
        key.forEach(k-> System.out.println(k));
        
        System.out.println("Lopping only Values \n");
        
        Collection<Integer> values =ct.values();
        values.forEach(v-> System.out.println(v));
        System.out.println("ENTRIES\n");          
        
        Set<Entry<String, Integer>> entries = ct.entrySet();
        for(Entry<String,Integer> entry:entries)
        {
        	System.out.println(entry.getKey()+" : " +entry.getValue());
        }
        
		
	}

}

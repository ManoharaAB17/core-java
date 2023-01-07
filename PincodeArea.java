package com.xrokz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PincodeArea {

	public static void main(String[] args) {
		Map<Integer,String> pa = new HashMap<Integer,String>();
		
		pa.put(577201,"Shimogga");
		pa.put(577301,"Bhadravathi");
		pa.put(577401,"Sagara");
		pa.put(577418,"Hoasnagara");
		pa.put(577427,"Shikaripura");
		pa.put(577432,"Thirthahalli");
		pa.put(577429,"Soraba");
		pa.put(577213,"Channagiri");
		pa.put(577217,"Honnali");
		pa.put(577601,"Harihara");
		System.out.println("Lopping only Keys \n");
        
        Collection<Integer> key =pa.keySet();
        key.forEach(k-> System.out.println(k));
        
        System.out.println("Lopping only Values \n");
        
        Collection<String> values =pa.values();
        values.forEach(v-> System.out.println(v));
        
        System.out.println("ENTRIES\n");          
        
        Set<Entry<Integer, String>> entries = pa.entrySet();
        for(Entry<Integer,String> entry:entries)
        {
        	System.out.println(entry.getKey()+" : " +entry.getValue());
        }
        
		
	}

}

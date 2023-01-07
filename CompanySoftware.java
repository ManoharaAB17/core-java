package com.xrokz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CompanySoftware {

	public static void main(String[] args) {
		Map<String,String> sw = new HashMap<String,String>();
			sw.put("Oracle","JDK");
			sw.put("MicroSoft","Windows");
			sw.put("SunMicroSystems","Java");
			sw.put("IDS","SQL");
			sw.put("MysqlAB","Mysql");
			sw.put("Google","GoogleSearchEngine");
			sw.put("Amazon","AWS");
			sw.put("Apple","Ios");
			sw.put("Qualcomm ","SnapDragon Processors");
			sw.put("AMD","AMD processor");
			
            System.out.println("Lopping only Keys \n");
            
            Collection<String> key =sw.keySet();
            key.forEach(k-> System.out.println(k));
            
            System.out.println("Lopping only Values \n");
            
            Collection<String> values =sw.values();
            values.forEach(v-> System.out.println(v));
            
            System.out.println("ENTRIES\n");          
            
            Set<Entry<String, String>> entries = sw.entrySet();
            for(Entry<String,String> entry:entries)
            {
            	System.out.println(entry.getKey()+" : " +entry.getValue());
            }
            
			

	}

}

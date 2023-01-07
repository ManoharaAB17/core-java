package com.xrokz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgnamesFees {

	public static void main(String[] args) {
         Map<String,Double> pg =new HashMap<String, Double>();
         pg.put("Vinayaka Boys Pg", 6000.3);
         pg.put("GiriDama girls pg", 5000.3);
         pg.put("Navarang Boys pg", 6500.3);
         pg.put("Shri NadiShwara Boys Pg", 4500.3);
         pg.put("Shri Guru Boys Pg", 6800.3);
         pg.put("Maruthi Boys Pg", 5400.3);
         pg.put("Srikantu girls Pg", 5800.3);
         pg.put("Golden villa Boys Pg", 8000.3);
         pg.put("Shri baba homens Pg", 4800.3);
         pg.put("Moon Boys Pg", 6000.3);
         System.out.println("Lopping only Keys \n");
         
         Collection<String> key =pg.keySet();
         key.forEach(k-> System.out.println(k));
         
         System.out.println("Lopping only Values \n");
         
         Collection<Double> values =pg.values();
         values.forEach(v-> System.out.println(v));
         
         System.out.println("ENTRIES\n");          
         
         Set<Entry<String, Double>> entries = pg.entrySet();
         for(Entry<String,Double> entry:entries)
         {
         	System.out.println(entry.getKey()+" : " +entry.getValue());
         }
         
         
	}

}

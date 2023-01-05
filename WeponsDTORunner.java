package com.xworkz.collectionsapp.jan04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.*;

public class WeponsDTORunner {

	public static void main(String[] args) {
		
		List<WeponsDTO> wp = new ArrayList();
		wp.add(new WeponsDTO("AK47","Indian Army",LocalDate.of(2021, 04, 02),32038,WeponType.Rifel));
		wp.add(new WeponsDTO("PistolAuto","INDIA",LocalDate.of(2022,03,01),20000,WeponType.Pistol));
		wp.add(new WeponsDTO("Rifle","CHINA",LocalDate.of(2021,05,02),30000,WeponType.Missile));
		wp.add(new WeponsDTO("Shotgun","BELGIUM",LocalDate.of(2020,06,01),40000,WeponType.ShotGun));
		wp.add(new WeponsDTO("Sniper rifle","BANGLADESH",LocalDate.of(2019,11,8),25000,WeponType.Swords));
		wp.add(new WeponsDTO("AK57","Indian Army",LocalDate.of(2001, 04, 02),42038,WeponType.Rifel));
		wp.add(new WeponsDTO("Grenade","CANADA",LocalDate.of(2017,02,11),40000,WeponType.Mace));
		wp.add(new WeponsDTO("Handgun","FRANCE",LocalDate.of(2016,04,12),70000,WeponType.Spear));
		wp.add(new WeponsDTO("Artillery","CHAD",LocalDate.of(2015,05,10),60000,WeponType.Rifel));
		wp.add(new WeponsDTO("Swords","BHUTAN",LocalDate.of(2014,06,25),30200,WeponType.Dragger));
		wp.add(new WeponsDTO("Light machine gun","CAMEROON",LocalDate.of(2013,01,29),15600,WeponType.Firearm));
		wp.add(new WeponsDTO("Spear","BRAZIL",LocalDate.of(2012,07,16),90600,WeponType.Handgun));
		wp.add(new WeponsDTO("Firearm","AMBANIA",LocalDate.of(2011,06,18),95400,WeponType.Missile));
		wp.add(new WeponsDTO("Katana","INDIA",LocalDate.of(2010,11,29),2200,WeponType.Pistol));
		wp.add(new WeponsDTO("Crossbow","CHINA",LocalDate.of(2009,12,28),32300,WeponType.Club));
		wp.add(new WeponsDTO("M4 carbine","CYPRUS",LocalDate.of(2022,10,26),42300,WeponType.Mace));
		wp.add(new WeponsDTO("Dagger","CANADA",LocalDate.of(2020,07,24),12500,WeponType.Club));
		wp.add(new WeponsDTO("AK-97","INDIA",LocalDate.of(2002,06,23),80500,WeponType.Rifel));
		wp.add(new WeponsDTO("Rocket launcher","INDIA",LocalDate.of(2022,05,21),12000,WeponType.Pistol));
		wp.add(new WeponsDTO("Cannon","BELARUS",LocalDate.of(2011,03,17),15200,WeponType.Dragger));
		wp.add(new WeponsDTO("Musket","INDIA",LocalDate.of(2001,02,19),73500,WeponType.Firearm));
		
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons by price greater than 30,000 \n");
		
		wp.stream()
		.filter((a)->{return a.getPrice()>40000;})
		.collect(Collectors.toList())
		.forEach(a-> System.out.println(a));
		
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by madeon and madeby \n");
		
		wp.stream()		
		.forEach(a-> System.out.println(" \n Made by --- " +a.getMadeby() +"\n Made On --- " + a.getMadeon() ));
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by name in descending order \n");
		
		wp.stream()
		.sorted((a,b)-> b.getName().compareTo(a.getName()))
		.forEach(a-> System.out.println(a));
		
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons  sort by madeby \n");
		
		wp.stream()
		.sorted((a,b)-> a.getMadeby().compareTo(b.getMadeby()))
		.forEach(a-> System.out.println(a));
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by madeOn \n");
		
		wp.stream()
		.sorted((a,b)-> a.getMadeon().compareTo(b.getMadeon()))
		.forEach(a-> System.out.println(a));
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by price \n");
		
		wp.stream()
		.sorted((a,b)->Double.compare( a.getPrice(),b.getPrice()))
		.forEach(a-> System.out.println(a));
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by price descending order \n");
		
		wp.stream()
		.sorted((a,b)->Double.compare( b.getPrice(),a.getPrice()))
		.forEach(a-> System.out.println(a));
		
		
		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by name and madeon  in acescending order \n");
	
		
		wp.stream()
		.sorted((a,b)-> a.getName().compareTo(b.getName()) )
		.sorted((a,b)-> a.getMadeon().compareTo(b.getMadeon()))
		.collect(Collectors.toList())
		.forEach(a-> System.out.println(" \n Name --- " +a.getName() +"\n Made On --- " + a.getMadeon() ));

		System.out.println("\n ================================");
		System.out.println("Find and print all weapons sort by type and madeby  in descending order \n");
		
		wp.stream()
		.sorted((a,b)-> a.getType().compareTo(b.getType()))
		.collect(Collectors.toList())
		.forEach(a-> System.out.println("\n Type --- " + a.getType()+ "\n Name "+ a.getName() +" \n Made by  --- " + a.getMadeby()));
		
		
		
	}
}

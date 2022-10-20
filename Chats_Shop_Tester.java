package com.xworkz.chatscenterapp;

import com.xworkz.chatscenterapp.new_chats_center.Chats_Shop;

public class Chats_Shop_Tester {
	
	public static void main(String[] args) {
	String staffNames[]= new String[3];
		staffNames[0] = "XXX";
		staffNames[1] = "YYY";
		staffNames[2] = "ZZZ";
	    	
	String menu[] = new String [5];
		menu[0] = "Dhai Puri"; 
		menu[1] = "Masal Puri";
		menu[2] = "Aalu puri"; 
		menu[3] = "Gobi manchurian";
		menu[4] = "Save puri";
	int price[] = new int[5];
	   price[0]=90;
	   price[1]=40;
	   price[2]=35;
	   price[3]=50;
	   price[4]=40;
	   
	String billingMethod[] = new String[3];
		billingMethod[0]="Cash";
		billingMethod[1]="Ceridt Card  /  Debit Card ";
		billingMethod[2]="UPI";
		
		Chats_Shop ch= new Chats_Shop("Moon Chats Shop","Shivamogga", "AAYWT23r8dhh352dg53276",staffNames,menu,price,billingMethod);

	
		ch.dispalyInfo();
		
		/*
		 * Chats_Shop ch= new Chats_Shop(); ch.gstNo= "JRU3HJDS487DFBHJ4"; ch.address
		 * ="Shivamogga"; ch.name =" '' Moon's  Chats_Shops'' ";
		 * 
		 * ch.staffNames= new String [3]; ch.staffNames[0] = "XXXXX"; ch.staffNames[1] =
		 * "YYYYY"; ch.staffNames[2] = "ZZZZZ";
		 * 
		 * ch.menu = new String [5]; ch.menu[0] = "Dhai Puri"; ch.menu[1] =
		 * "Masal Puri"; ch.menu[2] = "Aalu puri"; ch.menu[3] = "Gobi manchurian";
		 * ch.menu[4] = "Save puri";
		 * 
		 * ch.price = new int [5]; ch.price[0] = 90; ch.price[1] = 40; ch.price[2] =35;
		 * ch.price[3] = 50; ch.price[4] = 40; ch.billingMethod = new String[3];
		 * ch.billingMethod[0]="Cash";
		 * ch.billingMethod[1]="Ceridt Card  /  Debit Card "; ch.billingMethod[2]="UPI";
		 * 
		 * ch.dispalyInfo();
		 */
	}
	}


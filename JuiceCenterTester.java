package com.xworkz.chatscenterapp;

import com.xworkz.chatscenterapp.new_chats_center.JuiceCenter;

public class JuiceCenterTester {

	public static void main(String[] args) {
		
		String staffNames[]= new String[3];
			staffNames[0] = "XXX";
			staffNames[1] = "YYY";
			staffNames[2] = "ZZZ";
		    	
		String menu[] = new String [5];
			menu[0] = "Mango Juice"; 
			menu[1] = "Orange Juice";
			menu[2] = "Painaple Juice"; 
			menu[3] = "Grapes Juice";
			menu[4] = "Pommogranate Juice";
		int price[] = new int[5];
		   price[0]=70;
		   price[1]=60;
		   price[2]=50;
		   price[3]=50;
		   price[4]=80;
		   
		String billingMethod[] = new String[3];
			billingMethod[0]="Cash";
			billingMethod[1]="Ceridt Card  /  Debit Card ";
			billingMethod[2]="UPI";
			
			JuiceCenter  jc= new JuiceCenter ("Moon's JUICE center","Shivamogga", "WEYUG43YUGDF7R78236HJB",staffNames,menu,price,billingMethod);

		
			jc.dispalyInfo();
			
			/*
			 * JuiceCenter jc= new JuiceCenter(); jc.gstNo= "JRU3HJDS487DFBHJ4"; jc.address
			 * ="Shivamogga"; jc.name =" '' Moon's  JUICE center'' ";
			 * 
			 * jc.staffNames= new String [3]; jc.staffNames[0] = "XXXXX"; jc.staffNames[1] =
			 * "YYYYY"; jc.staffNames[2] = "ZZZZZ";
			 * 
			 * jc.menu = new String [5]; jc.menu[0] = "Mango Juice"; jc.menu[1] =
			 * "orange Juice "; jc.menu[2] = "Painaple Juice"; jc.menu[3] = "Grapes Juice ";
			 * jc.menu[4] = "P0mmogranate Juice";
			 * 
			 * jc.price = new int [5]; jc.price[0] = 70; jc.price[1] = 60; jc.price[2] =50;
			 * jc.price[3] = 50; jc.price[4] = 80; jc.billingMethod = new String[3];
			 * jc.billingMethod[0]="Cash";
			 * jc.billingMethod[1]="Ceridt Card  /  Debit Card "; jc.billingMethod[2]="UPI";
			 * 
			 * jc.dispalyInfo();
			 */
		}
}

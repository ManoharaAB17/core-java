package com.xworkz.chatscenterapp;

import com.xworkz.chatscenterapp.new_chats_center.IceCreamParlour;

public class IceCreamParlourTester {

public static void main(String[] args) {
		
		String staffNames[]= new String[3];
			staffNames[0] = "XXX";
			staffNames[1] = "YYY";
			staffNames[2] = "ZZZ";
		    	
		String menu[] = new String [5];
			menu[0] = "Choco Brownie Sundee"; 
			menu[1] = "Death By Chocolate";
			menu[2] = "Big Daddy"; 
			menu[3] = "Hot Chocolate Fudge";
			menu[4] = "Moon's ICP special";
		int price[] = new int[5];
		   price[0]=155;
		   price[1]=145;
		   price[2]=125;
		   price[3]=150;
		   price[4]=105;
		   
		String billingMethod[] = new String[3];
			billingMethod[0]="Cash";
			billingMethod[1]="Ceridt Card  /  Debit Card ";
			billingMethod[2]="UPI";
			
			IceCreamParlour  icp= new IceCreamParlour ("Moon's IceCreamParlour","Shivamogga", "JKW2BUYG35G35YG3U32",staffNames,menu,price,billingMethod);

		
			icp.dispalyInfo();
			
			/*
			 * IceCreamParlour icp= new IceCreamParlour(); icp.gstNo= "JRU3HJDS487DFBHJ4"; icp.address
			 * ="Shivamogga"; icp.name =" '' Moon's  IceCreamParlour'' ";
			 * 
			 * icp.staffNames= new String [3]; icp.staffNames[0] = "XXXXX"; icp.staffNames[1] =
			 * "YYYYY"; icp.staffNames[2] = "ZZZZZ";
			 * 
			 * icp.menu = new String [5]; icp.menu[0] = "Choco Brownie Sundee"; icp.menu[1] =
			 * "Death By Chocolate "; icp.menu[2] = "Big Daddy"; icp.menu[3] = "Hot Chocolate Fudge ";
			 * icp.menu[4] = "P0mmogranate Juice";
			 * 
			 * icp.price = new int [5]; icp.price[0] = 155; icp.price[1] = 145; icp.price[2] =125;
			 * icp.price[3] = 150; icp.price[4] = 105; icp.billingMethod = new String[3];
			 * icp.billingMethod[0]="Cash";
			 * icp.billingMethod[1]="Ceridt Card  /  Debit Card "; icp.billingMethod[2]="UPI";
			 * 
			 * icp.dispalyInfo();
			 */
		}

}

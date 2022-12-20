package com.xworkz.collectionsapp.dec20;

import java.util.Collection;
import java.util.TreeSet;

public class Curencies {

	public static void main(String[] args) {
		String cu1= "Indian Rupee ";
		String cu2= "United States Dollar ";
		String cu3= " Euro";
		String cu4= "Pound streling ";
		String cu5= " Australian Dollar";
		String cu6= " Swiss Franc";
		String cu7= "Singapore Dollar ";
		String cu8= "Omani Rial ";
		String cu9= "New Zealand Dollar ";
		String cu10= "Albanian Lek ";
		String cu11= "South African Rand ";
		String cu12= "Kuwaitia Dinar ";
		String cu13= " Jordanian Dinarj";
		String cu14= "Japanese yen ";
		String cu15= " Israeli Shekel";
		String cu16= "Cayman Island Dollar ";
		String cu17= "Turkish lira ";
		String cu18= " Danish Krone";
		String cu19= " East Caribbean Dollar";
		String cu20= " Bahraini Dinar";
		String cu21= " Chinese yuan";
		String cu22= "Russian Ruble ";
		String cu23= "Brazilian Real ";
		String cu24= "Hong Kong Dollar ";
		String cu25= " Indonesion Rupiah";
		String cu26= "Colombian Peso ";
		
		Collection<String> col = new TreeSet<String>();
		
		col.add(cu1);
		col.add(cu2);
		col.add(cu3);
		col.add(cu4);
		col.add(cu5);
		col.add(cu6);col.add(cu7);col.add(cu8);col.add(cu9);col.add(cu10);
		col.add(cu11);col.add(cu12);col.add(cu13);col.add(cu14);col.add(cu15);col.add(cu16);col.add(cu17);col.add(cu18);col.add(cu19);col.add(cu20);
		col.add(cu21);col.add(cu22);col.add(cu23);col.add(cu24);col.add(cu25);col.add(cu26);
		
		System.out.println("Before collection");
		System.out.println(col);
		
		System.out.println("Size :   "+ col.size());
		
		
		System.out.println("After");
		col.clear();
		
		
	}

}
